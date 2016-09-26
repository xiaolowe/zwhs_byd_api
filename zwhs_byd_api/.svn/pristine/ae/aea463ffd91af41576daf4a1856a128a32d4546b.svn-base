package cn.org.citycloud.zwhs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import cn.org.citycloud.zwhs.entity.ServiceStore;
import java.lang.Integer;

public interface ServiceStoreDao extends JpaRepository<ServiceStore, Integer>,JpaSpecificationExecutor<ServiceStore> {
	
	public ServiceStore findByStoreId(Integer storeId);
	
	public ServiceStore findByStoreIdAndServiceState(int storeId,int serviceState);
	
	public long countByStoreId(int store_id);
	
	
	public ServiceStore findByStoreIdAndServiceId(Integer storeId, Integer serviceId);
}
