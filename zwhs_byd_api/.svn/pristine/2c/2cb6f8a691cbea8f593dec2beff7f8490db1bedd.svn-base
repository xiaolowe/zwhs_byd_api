package cn.org.citycloud.zwhs.controller;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.org.citycloud.zwhs.bean.StoreServiceOrderSearchBean;
import cn.org.citycloud.zwhs.constants.ErrorCodes;
import cn.org.citycloud.zwhs.core.BaseController;
import cn.org.citycloud.zwhs.entity.StoreServiceOrder;
import cn.org.citycloud.zwhs.exception.BusinessErrorException;
import cn.org.citycloud.zwhs.service.StoreServiceOrderService;


@Controller
@RequestMapping("storeserviceorder")
public class StoreServiceOrderController extends BaseController{
	
	@Autowired
	private StoreServiceOrderService storeServiceOrderService;
	
	
	/**
	 * 获取服务订单信息列表
	 * 列表
	 * @return
	 */
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody()
	public Object getServiceInfoList(@Valid StoreServiceOrderSearchBean bean) throws Exception, RuntimeException {

		Sort sort = new Sort(Direction.DESC, "orderId");
	    Pageable pageable = new PageRequest(bean.getPageNo() - 1, bean.getPageSize(), sort);
	    
	    StoreServiceOrder storeServiceOrder = new StoreServiceOrder();
	    int storeId = getStoreId();
	    storeServiceOrder.setOrderId(bean.getOrder_id());
	    storeServiceOrder.setServiceName(bean.getService_name());
	    storeServiceOrder.setOrderStatus(bean.getOrder_status());
	    storeServiceOrder.setStoreId(storeId);
	    
		Page<StoreServiceOrder> list = storeServiceOrderService.getStoreServiceOrderList(pageable, storeServiceOrder);
		return list;
	}
	
	
	
	/**
	 * 查看订单详情
	 * @return
	 */
	@RequestMapping(value = "/detail", method = RequestMethod.GET)
	@ResponseBody()
	public Object detailServiceInfo(
			@RequestParam(value = "order_id") Integer orderId) throws Exception, RuntimeException {

		if(orderId == null){
			
			throw new BusinessErrorException(ErrorCodes.PARAM_ERROR, "参数为空");
			
		}
		return storeServiceOrderService.getStoreServiceOrderById(orderId);
				
		
	}
	
	
	
}
