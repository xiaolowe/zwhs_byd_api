package cn.org.citycloud.zwhs.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the community database table.
 * 
 */
@Entity
@NamedQuery(name="Community.findAll", query="SELECT c FROM Community c")
public class Community implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="community_id")
	private int communityId;

	@Column(name="community_logo")
	private String communityLogo;

	@Column(name="community_name")
	private String communityName;

	@Lob
	private String description;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="ins_date")
	private Date insDate;

	private int isclosed;

	@Column(name="reply_image")
	private String replyImage;

	@Column(name="store_id")
	private int storeId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="upd_date")
	private Date updDate;

	public Community() {
	}

	public int getCommunityId() {
		return this.communityId;
	}

	public void setCommunityId(int communityId) {
		this.communityId = communityId;
	}

	public String getCommunityLogo() {
		return this.communityLogo;
	}

	public void setCommunityLogo(String communityLogo) {
		this.communityLogo = communityLogo;
	}

	public String getCommunityName() {
		return this.communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getInsDate() {
		return this.insDate;
	}

	public void setInsDate(Date insDate) {
		this.insDate = insDate;
	}

	public int getIsclosed() {
		return this.isclosed;
	}

	public void setIsclosed(int isclosed) {
		this.isclosed = isclosed;
	}

	public String getReplyImage() {
		return this.replyImage;
	}

	public void setReplyImage(String replyImage) {
		this.replyImage = replyImage;
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public Date getUpdDate() {
		return this.updDate;
	}

	public void setUpdDate(Date updDate) {
		this.updDate = updDate;
	}

}