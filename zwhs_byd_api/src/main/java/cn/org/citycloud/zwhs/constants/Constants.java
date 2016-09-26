package cn.org.citycloud.zwhs.constants;

/**
 * 常量Class
 * @author lanbo
 *
 */
public class Constants {

	public static final long TOKEN_EXPIRES_IN = 24*3600;
	
	public static final String TOKEN_SECRET = "IFFa52XkBEQ9AoO8";
	
	// 会员的状态 1为开启 0为关闭
	public static final int MEMBER_STATUS_OPEN = 1;
	
	public static final int MEMBER_STATUS_CLOSED = 0;
	
	// 接口外网地址
	public static final String API_URL1 = "http://mm3645071.oicp.net";
	
	// 接口外网路径
	public static final String API_PATH = "/zwhs_byd_api";
	
	//图片外网地址
	public static final String FILE_URL="http://fileproxy.syisy.com/";
	
	// 接口外网地址
	public static final String API_URL = "http://o2ostore.syisy.com";
	
	// 素材库类型 [1:我的素材库， 2:系统素材库]
	public static final int MATERIAL_PERSONAL = 1;
	public static final int MATERIAL_SYSTEM = 2;
	
	public static final int ARTICLE_STATE = 1;
	
	
	// 账户类型(平台:1;母婴店:2;服务商:3; 分销商  4)
    public static final int ACC_TYPE_ZWHS = 1;
    
    public static final int ACC_TYPE_STORE = 2;
    
    public static final int ACC_TYPE_PROVIDER = 3;
    
    public static final int ACC_TYPE_RETAIL_MEMBER = 4;
    
    

}
