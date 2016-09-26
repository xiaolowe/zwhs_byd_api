package cn.org.citycloud.zwhs.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.org.citycloud.zwhs.bean.FirstPage;
import cn.org.citycloud.zwhs.bean.Order;
import cn.org.citycloud.zwhs.bean.chart.ChartData;
import cn.org.citycloud.zwhs.core.BaseController;
import cn.org.citycloud.zwhs.entity.FinAcc;
import cn.org.citycloud.zwhs.entity.Store;
import cn.org.citycloud.zwhs.entity.StoreOrder;
import cn.org.citycloud.zwhs.entity.StoreSg;
import cn.org.citycloud.zwhs.repository.FinAccDao;
import cn.org.citycloud.zwhs.repository.StoreDao;
import cn.org.citycloud.zwhs.repository.StoreOrderDao;
import cn.org.citycloud.zwhs.repository.StoreSgDao;
import cn.org.citycloud.zwhs.service.OrderService;

@RestController
public class FirstPageController extends BaseController{
	
	@Autowired
	private FinAccDao finAccDao;
	@Autowired
	private StoreDao storeDao;
	@Autowired
	private StoreOrderDao storeOrderDao;
	@Autowired
	private OrderService orderService;
	@Autowired
	private StoreSgDao storeSgDao;
	/**
	 * 首页图表
	 * @return
	 */
	@RequestMapping(value="/chart",method=RequestMethod.GET)
	public Object getChart(){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		ChartData xAxis = getxaxis();
		resultMap.put("xAxis", xAxis);
		List<ChartData> series = new ArrayList<ChartData>();
		//获取图表数据
		Order order = new Order();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");		
		Date now = new Date();
		order.setEndTime(df.format(now));
		Calendar cl = Calendar.getInstance();
		cl.setTime(now);
		cl.add(Calendar.DAY_OF_MONTH, -6);
		order.setStartTime(df.format(cl.getTime()));
		order.setStoreId(getStoreId());
		order.setPageSize(99999);
		Page<StoreOrder> storeOrders = orderService.getOrderList(order);
		//end
		ChartData orders = new ChartData();
		ChartData amounts = new ChartData();
		orders.setName("订单数");
		orders.setType("line");
		amounts.setName("成交额");
		amounts.setType("line");
		List<Object> orderList = new ArrayList<Object>();
		List<Object> amountList = new ArrayList<Object>();
		List<Date> startTime = getStartData();
		List<Date> endTime = getEndData();
		for(int i=0;i<startTime.size();i++){
			int size=0;
			BigDecimal amount=new BigDecimal(0);
			for(StoreOrder storeOrder:storeOrders){
				Date orderTime = storeOrder.getAddTime();
				if(orderTime.after(startTime.get(i))&&orderTime.before(endTime.get(i))){
					size++;
					if(storeOrder.getOrderStatus()>10){
						amount = amount.add(storeOrder.getOrderAmount());
					}
					
				}
			}
			orderList.add(size);
			amountList.add(amount);
		}
		orders.setData(orderList);
		amounts.setData(amountList);
		series.add(orders);
		series.add(amounts);
		resultMap.put("series", series);
		return resultMap;
	}
	
	/**
	 * 首页数据
	 * @return
	 */
	@RequestMapping(value="/firstPage",method=RequestMethod.GET)
	public Object getInfo(){
		int storeId = getStoreId();
		FirstPage firstPage = new FirstPage();
		if(storeId==0){
		}else{
			FinAcc finAcc = finAccDao.findByAccNo(storeId);
			if(finAcc!=null){
				firstPage.setAccBal(finAcc.getAccBal());
			}
			
			Store store = storeDao.findByStoreId(storeId);
			if(store!=null){
				firstPage.setTotaMember(store.getWechatMembers().size());
				firstPage.setCompanyAddress(store.getCompanyAddress());
				if(store.getSgId()!=null){
					StoreSg storeSg = storeSgDao.findOne((int)store.getSgId());
					if(storeSg!=null){
						firstPage.setSgId(storeSg.getSgId());
						firstPage.setSgName(storeSg.getSgName());
					}
				}
				
			}
			
			int size = storeOrderDao.getSize(storeId);
			BigDecimal amount = storeOrderDao.getAllAmount(storeId);
			if(amount==null) amount=new BigDecimal(0);
			firstPage.setTotalOrder(size);
			firstPage.setTotalAmount(amount);
		}
		
		return firstPage;
	}
	
	
	private ChartData getxaxis(){
		List<Object> datas = new ArrayList<Object>();
		ChartData xAxis = new ChartData();
		xAxis.setName("x");
		xAxis.setType("category");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");		
		Date now = new Date();
		datas.add(df.format(now));
		Calendar cl = Calendar.getInstance();
		cl.setTime(now);
		for(int i=1;i<7;i++){
			cl.add(Calendar.DAY_OF_MONTH, -1);
			datas.add(df.format(cl.getTime()));
		}
		List<Object> dst = reverseOb(datas);
		xAxis.setData(dst);
		return xAxis;
	}
	
	private List<Date> getStartData(){
		List<Date> dates = new ArrayList<Date>();
		Date now = new Date();
		Calendar cl = Calendar.getInstance();
		cl.setTime(now);
		cl.set(Calendar.HOUR_OF_DAY, 0);
		cl.set(Calendar.MINUTE, 0);
		cl.set(Calendar.SECOND, 0);
		dates.add(cl.getTime());
		for(int i=1;i<7;i++){
			cl.add(Calendar.DAY_OF_MONTH, -1);
			dates.add(cl.getTime());
		}
		List<Date> dst = reverse(dates);
		return dst;
	}
	
	private List<Date> getEndData(){
		List<Date> dates = new ArrayList<Date>();
		Date now = new Date();
		Calendar cl = Calendar.getInstance();
		cl.setTime(now);
		cl.set(Calendar.HOUR_OF_DAY, 23);
		cl.set(Calendar.MINUTE, 59);
		cl.set(Calendar.SECOND, 59);
		dates.add(cl.getTime());
		for(int i=1;i<7;i++){
			cl.add(Calendar.DAY_OF_MONTH, -1);
			dates.add(cl.getTime());
		}
		List<Date> dst = reverse(dates);
		return dst;
	}
	
	private List<Date> reverse(List<Date> source){
		List<Date> dest = new ArrayList<Date>();
		for(int i=0;i<source.size();i++){
			int k = source.size()-1-i;
			dest.add(source.get(k));
		}
		return dest;
	}
	
	private List<Object> reverseOb(List<Object> source){
		List<Object> dest = new ArrayList<Object>();
		for(int i=0;i<source.size();i++){
			int k = source.size()-1-i;
			dest.add(source.get(k));
		}
		return dest;
	}
	
}
