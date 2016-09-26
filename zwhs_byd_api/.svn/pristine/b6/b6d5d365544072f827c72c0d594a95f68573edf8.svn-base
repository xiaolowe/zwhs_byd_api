package cn.org.citycloud.zwhs.controller;


import cn.org.citycloud.zwhs.bean.FlowInfo;
import cn.org.citycloud.zwhs.bean.Order;
import cn.org.citycloud.zwhs.core.BaseController;
import cn.org.citycloud.zwhs.entity.StoreOrder;
import cn.org.citycloud.zwhs.repository.StoreOrderDao;
import cn.org.citycloud.zwhs.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
public class OrderController extends BaseController {
	
	@Autowired
	private StoreOrderDao storeOrderDao;
	
	@Autowired
	private OrderService orderService;

	/**
	 * 订单列表信息
	 * @param paramMap
	 * @return
	 */
	@RequestMapping(value="/orders",method=RequestMethod.GET)
	public Object getOrders(Order order){

		order.setStoreId(getStoreId());
		return orderService.getOrderList(order);
	}
	
	/**
	 * 某个订单的详情
	 * @param id
	 * @param paramMap
	 * @return
	 */
	@RequestMapping(value="/order/{id}",method=RequestMethod.GET)
	public Object getOrderById(@PathVariable int id){
		
		return storeOrderDao.findByOrderId(id);
	}

	/**
	 * 订单发货
	 *
	 * @param id
	 * @return
     */
	@RequestMapping(value = "/order/{id}", method = RequestMethod.PUT)
	public Object sendItem(@PathVariable int id, @RequestBody FlowInfo flowInfo) {
		StoreOrder storeOrder = storeOrderDao.findOne(id);
		storeOrder.setUpdDate(new Date());
		storeOrder.setOrderStatus(60);
		storeOrder.setFlowCompanyName(flowInfo.getFlowCompanyName());
		storeOrder.setFlowNum(flowInfo.getFlowNum());
		storeOrderDao.save(storeOrder);
		return storeOrder;
	}
}
