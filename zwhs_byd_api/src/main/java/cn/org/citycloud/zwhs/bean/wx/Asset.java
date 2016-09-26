package cn.org.citycloud.zwhs.bean.wx;



public class Asset {
	

	private int id;
	
	private String articleAuthor;

	private Integer articleClassId;

	private String articleClassName;

	private String articleComments;
	
	private String materialDesc;
	
	private String articleTitle;

	private String coverPic;

	private long insDate;

	private int materialType;

	private int storeId;

	private String thumbnailPic;
	
	private int articleState;

	private long updDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getArticleAuthor() {
		return articleAuthor;
	}

	public void setArticleAuthor(String articleAuthor) {
		this.articleAuthor = articleAuthor;
	}

	public Integer getArticleClassId() {
		return articleClassId;
	}

	public void setArticleClassId(Integer articleClassId) {
		this.articleClassId = articleClassId;
	}

	public String getArticleClassName() {
		return articleClassName;
	}

	public void setArticleClassName(String articleClassName) {
		this.articleClassName = articleClassName;
	}

	public String getArticleComments() {
		return articleComments;
	}

	public void setArticleComments(String articleComments) {
		this.articleComments = articleComments;
	}

	public String getArticleTitle() {
		return articleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		this.articleTitle = articleTitle;
	}

	public String getCoverPic() {
		return coverPic;
	}

	public void setCoverPic(String coverPic) {
		this.coverPic = coverPic;
	}

	

	public int getMaterialType() {
		return materialType;
	}

	public void setMaterialType(int materialType) {
		this.materialType = materialType;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public String getThumbnailPic() {
		return thumbnailPic;
	}

	public void setThumbnailPic(String thumbnailPic) {
		this.thumbnailPic = thumbnailPic;
	}

	public long getInsDate() {
		return insDate;
	}

	public void setInsDate(long insDate) {
		this.insDate = insDate;
	}

	public long getUpdDate() {
		return updDate;
	}

	public void setUpdDate(long updDate) {
		this.updDate = updDate;
	}

	public String getMaterialDesc() {
		return materialDesc;
	}

	public void setMaterialDesc(String materialDesc) {
		this.materialDesc = materialDesc;
	}

	public int getArticleState() {
		return articleState;
	}

	public void setArticleState(int articleState) {
		this.articleState = articleState;
	}

	
}
