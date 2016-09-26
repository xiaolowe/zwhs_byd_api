package cn.org.citycloud.zwhs.core;

import cn.org.citycloud.zwhs.bean.UserToken;
import cn.org.citycloud.zwhs.entity.StoreUser;

/**
 * 控制器基类
 * 
 * @author lanbo
 *
 */
public class BaseController {

	/**
	 * 会员Id
	 */
	private int memberId;

	/**
	 * 门店Id
	 */
	private int storeId=0;
	
	/**
	 * 母婴店类型（0 普通母婴店    1 平台母婴店）
	 */
	private int storeType;

	/**
	 * 微信号
	 */
	private String openId;
	
	/**
	 * 母婴店的用户ID
	 */
	private int userId;
	
	private StoreUser storeUser;
	
	private String token;
	
	/**
	 * 母婴店名称
	 */
	private String companyName;
	
	private UserToken userToken;

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public StoreUser getStoreUser() {
		return storeUser;
	}

	public void setStoreUser(StoreUser storeUser) {
		this.storeUser = storeUser;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public UserToken getUserToken() {
		return userToken;
	}

	public void setUserToken(UserToken userToken) {
		this.userToken = userToken;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getStoreType() {
		return storeType;
	}

	public void setStoreType(int storeType) {
		this.storeType = storeType;
	}
	
	

}
