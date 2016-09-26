package cn.org.citycloud.zwhs.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the reply database table.
 * 
 */
@Entity
@NamedQuery(name="Reply.findAll", query="SELECT r FROM Reply r")
public class Reply implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="reply_id")
	private int replyId;

	private String content;

	@Column(name="member_id")
	private int memberId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="reply_time")
	private Date replyTime;

	private int status;

	@Column(name="topic_id")
	private int topicId;

	public Reply() {
	}

	public int getReplyId() {
		return this.replyId;
	}

	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getMemberId() {
		return this.memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public Date getReplyTime() {
		return this.replyTime;
	}

	public void setReplyTime(Date replyTime) {
		this.replyTime = replyTime;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getTopicId() {
		return this.topicId;
	}

	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}

}