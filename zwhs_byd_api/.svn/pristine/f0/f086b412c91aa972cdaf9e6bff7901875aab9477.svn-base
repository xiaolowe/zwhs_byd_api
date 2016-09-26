package cn.org.citycloud.zwhs.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.org.citycloud.zwhs.core.BaseController;
import cn.org.citycloud.zwhs.entity.ServiceStore;
import cn.org.citycloud.zwhs.repository.ServiceStoreDao;

@RestController
public class ServiceController extends BaseController{
	
	
	@Autowired
	private ServiceStoreDao serviceStoreDao;
	
	/**
	 * 获取服务信息
	 * @param paramMap
	 * @return
	 */
	@RequestMapping(value="/service",method=RequestMethod.GET)
	public Object getServices(){
		try {
			return serviceStoreDao.findByStoreId(getStoreId());
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	} 
	
	/**
	 * 更新某个服务信息
	 * @param id
	 * @param paramMap
	 * @return
	 */
	@RequestMapping(value="/service/{serviceId}",method=RequestMethod.PUT)
	public Object updateSrvById(@PathVariable int id,@RequestParam Map<String, Object> paramMap){
		Map<String, Object> resultMap = new HashMap<String, Object>();
		return resultMap;
	}
	
	/**
	 * 上/下架某个服务
	 * @param id
	 * @param status
	 * @return
	 */
	@RequestMapping(value="/service/{id}/{serviceStatus}",method=RequestMethod.PUT)
	public Object updateSrvById(@PathVariable int id,@PathVariable int serviceStatus){
		ServiceStore serviceStore = serviceStoreDao.findOne(id);
		serviceStore.setServiceState(serviceStatus);
		serviceStoreDao.save(serviceStore);
		return serviceStore;
	}
}
