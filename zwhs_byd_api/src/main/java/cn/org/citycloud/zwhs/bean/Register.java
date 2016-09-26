package cn.org.citycloud.zwhs.bean;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;


public class Register {
	

	
	private Date insDate;

	
	private Integer storeId=0;

	
	private Date updDate;

	
	private String userAvatar="";

	@NotBlank
	private String userEmail;

	@NotBlank
	private String userPhone;

	@NotBlank
	private String userPwd;

	
	private byte userSex=0;
	@NotBlank
	private String userTruename;
	
	private String smsinfo="";

	public Date getInsDate() {
		return insDate;
	}

	public void setInsDate(Date insDate) {
		this.insDate = insDate;
	}

	public Integer getStoreId() {
		return storeId;
	}

	public void setStoreId(Integer storeId) {
		this.storeId = storeId;
	}

	public Date getUpdDate() {
		return updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

	public String getUserAvatar() {
		return userAvatar;
	}

	public void setUserAvatar(String userAvatar) {
		this.userAvatar = userAvatar;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public byte getUserSex() {
		return userSex;
	}

	public void setUserSex(byte userSex) {
		this.userSex = userSex;
	}

	public String getUserTruename() {
		return userTruename;
	}

	public void setUserTruename(String userTruename) {
		this.userTruename = userTruename;
	}

	public String getSmsinfo() {
		return smsinfo;
	}

	public void setSmsinfo(String smsinfo) {
		this.smsinfo = smsinfo;
	}

	

}
