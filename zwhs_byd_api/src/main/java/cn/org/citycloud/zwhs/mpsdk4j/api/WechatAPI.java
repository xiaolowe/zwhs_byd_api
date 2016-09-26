package cn.org.citycloud.zwhs.mpsdk4j.api;

/**
 * 微信公众平台所有API汇集
 * 
 * @author 凡梦星尘(elkan1788@gmail.com)
 * @since 2.0
 */
public interface WechatAPI extends CredentialAPI, MenuAPI, MediaAPI, GroupsAPI, QRCodeAPI, UserAPI,
        TemplateAPI, MessageAPI {

    // 微信公众平台API入口
    static final String wechatapi = "https://api.weixin.qq.com/cgi-bin";
}
