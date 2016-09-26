package cn.org.citycloud.zwhs.service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import cn.org.citycloud.zwhs.bean.Pay;
import cn.org.citycloud.zwhs.entity.CashRecoder;
import cn.org.citycloud.zwhs.entity.FinAcc;
import cn.org.citycloud.zwhs.entity.Store;
import cn.org.citycloud.zwhs.entity.StoreUser;
import cn.org.citycloud.zwhs.exception.BusinessErrorException;
import cn.org.citycloud.zwhs.repository.CashRecoderDao;
import cn.org.citycloud.zwhs.repository.FinAccDao;
import cn.org.citycloud.zwhs.repository.StoreDao;
import cn.org.citycloud.zwhs.repository.StoreUserDao;

@Component
public class PayService {
	
	@Autowired
	private CashRecoderDao cashRecoderDao;
	
	@Autowired
	private StoreDao storeDao;
	
	@Autowired
	private FinAccDao finAccDao;
	@Autowired
	private StoreUserDao storeUserDao;
	
	@Transactional(rollbackFor=DataAccessException.class)
	public Object ApplyPay(Pay pay)throws Exception{
		Map<String, Object> resultMap = new HashMap<String, Object>();
		try {
			int store_id = pay.getStoreId();
			Store store = storeDao.findByStoreId(store_id);
			FinAcc finAcc = finAccDao.findByAccNo(store_id);
			StoreUser storeUser = storeUserDao.findOne(pay.getApplyUserId());
			BigDecimal accBal = finAcc.getAccBal();
			if(accBal.compareTo(pay.getApplyMoney())==-1){
				resultMap.put("code", 0);
				resultMap.put("msg", "您当前只能提现"+accBal+"元");
				return resultMap;
			}	
			CashRecoder cashRecoder = new CashRecoder();
			BeanUtils.copyProperties(store, cashRecoder);
			BeanUtils.copyProperties(pay, cashRecoder);
			cashRecoder.setApplyUserName(storeUser.getUserTruename());
			BigDecimal sum = finAcc.getAccBal();
			sum = sum.subtract(pay.getApplyMoney());
			finAcc.setAccBal(sum);
			cashRecoder.setAccSurplus(sum);
			Date now = new Date();
			cashRecoder.setApplyTime(now);
			cashRecoder.setInsDate(now);
			cashRecoder.setUpdDate(now);
			cashRecoderDao.save(cashRecoder);
			finAccDao.save(finAcc);
			resultMap.put("code", 1);
			resultMap.put("msg", "成功");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new BusinessErrorException("2", "失败");
		}
		
		return resultMap;
	}
}
