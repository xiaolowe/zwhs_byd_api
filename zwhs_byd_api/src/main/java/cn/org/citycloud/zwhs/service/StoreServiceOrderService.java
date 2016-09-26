package cn.org.citycloud.zwhs.service;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import cn.org.citycloud.zwhs.entity.StoreServiceOrder;
import cn.org.citycloud.zwhs.repository.StoreServiceOrderDao;



//Spring Bean的标识.
@Component
// 类中所有public函数都纳入事务管理的标识.
@Transactional
public class StoreServiceOrderService {
	@Autowired
	private StoreServiceOrderDao storeServiceOrderDao;
	
	
	/**
	 * 动态查询门店服务列表
	 * @param pageable
	 * @param storeServiceOrder
	 * @return
	 */
	public Page<StoreServiceOrder> getStoreServiceOrderList(Pageable pageable, StoreServiceOrder storeServiceOrder){
		
		Page<StoreServiceOrder> page = storeServiceOrderDao.findAll(new Specification<StoreServiceOrder>() {
			@Override
			public Predicate toPredicate(Root<StoreServiceOrder> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				
				Predicate where = cb.conjunction();  
		        
				if(storeServiceOrder != null &&
						StringUtils.isNotBlank(storeServiceOrder.getServiceName())){
					Path<String> serviceName = root.get("serviceName");  
					where = cb.and(where, cb.like(serviceName, "%"+storeServiceOrder.getServiceName()+"%"));
				}
				if(storeServiceOrder != null && storeServiceOrder.getOrderId() != null){
					Path<Integer> orderId = root.get("orderId");  
					where = cb.and(where, cb.equal(orderId, storeServiceOrder.getOrderId()));  
				}
				if(storeServiceOrder != null && storeServiceOrder.getStoreId() != null){
					Path<Integer> storeId = root.get("storeId");  
					where = cb.and(where, cb.equal(storeId, storeServiceOrder.getStoreId()));  
				}
				if(storeServiceOrder != null && storeServiceOrder.getOrderStatus() != null){
					Path<Integer> orderStatus = root.get("orderStatus");  
					where = cb.and(where, cb.equal(orderStatus, storeServiceOrder.getOrderStatus()));  
				}
				query.where(where);
				  
			    return null;  
			}
		}, pageable);
		
	    return page;
	}

	/**
	 * 查找订单详情
	 * @param orderId
	 * @return
	 */
	public StoreServiceOrder getStoreServiceOrderById(Integer orderId){
		
		return storeServiceOrderDao.findOne(orderId);
		
	}
	
	
}
