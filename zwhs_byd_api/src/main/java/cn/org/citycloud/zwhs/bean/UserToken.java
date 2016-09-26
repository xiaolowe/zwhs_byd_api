package cn.org.citycloud.zwhs.bean;

import java.io.Serializable;

/**
 * Token
 * 
 * @author lanbo
 *
 */
public class UserToken implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5259132293621138195L;

	/**
	 * Token
	 */
	private String token;

	/**
	 * 会员Id
	 */
	private int memberId;

	/**
	 * 微信号
	 */
	private String weixinNo;

	/**
	 * 多少秒后过期
	 */
	private long expiresIn;

	/**
	 * 创建时间戳
	 */
	private long createTs;
	
	private int storeId;
	
	private int userId;
	
	private int storeType;
	
	private String userName;
	
	private String companyName;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getWeixinNo() {
		return weixinNo;
	}

	public void setWeixinNo(String weixinNo) {
		this.weixinNo = weixinNo;
	}

	public long getExpiresIn() {
		return expiresIn;
	}

	public void setExpiresIn(long expiresIn) {
		this.expiresIn = expiresIn;
	}

	public long getCreateTs() {
		return createTs;
	}

	public void setCreateTs(long createTs) {
		this.createTs = createTs;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
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