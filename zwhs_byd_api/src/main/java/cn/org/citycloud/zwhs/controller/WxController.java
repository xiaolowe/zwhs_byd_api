package cn.org.citycloud.zwhs.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.org.citycloud.zwhs.entity.MaterialWarehouse;
import cn.org.citycloud.zwhs.entity.Store;
import cn.org.citycloud.zwhs.handler.MyWechatHandler;
import cn.org.citycloud.zwhs.repository.MaterialWarehouseDao;
import cn.org.citycloud.zwhs.repository.StoreDao;
import cn.org.citycloud.zwhs.repository.WechatKeyDao;
import cn.org.citycloud.zwhs.repository.WechatMenuDao;
import io.github.elkan1788.mpsdk4j.mvc.WechatWebSupport;
import io.github.elkan1788.mpsdk4j.vo.MPAccount;

/**
 * 微信接口
 * @author cr
 *
 */
@Controller
@RequestMapping(value="/wx")
public class WxController extends WechatWebSupport {
	
	@Autowired
	private StoreDao storeDao;
	@Autowired
	private WechatKeyDao wechatKeyDao;
	@Autowired
	private MaterialWarehouseDao materialWarehouseDao;
	@Autowired
	private WechatMenuDao wechatMenuDao;
	@Autowired
	private MyWechatHandler myWechatHandler;
	
	 /**
     * 
     * <ol>
     * <li>开发者的微信公众号信息</li>
     * <li>微信消息处理器</li>
     * </ol>
     */
	@Override
	public void init() {
		
	}

    /**
     * 与微信服务器互动
     * 
     * @param req
     *            微信服务器请求
     * @param resp
     *            响应微信服务器
     * @throws IOException
     */
	@RequestMapping("/core/{storeId}")
	@ResponseBody
    public void wechatCore(@PathVariable int storeId,HttpServletRequest req, HttpServletResponse resp) throws Exception {
		Store store = storeDao.findOne(storeId);
		MPAccount mpAccount = new MPAccount();
		mpAccount.setAppId(store.getAppId());
		mpAccount.setAppSecret(store.getAppSecret());
		mpAccount.setToken(store.getWechatToken());
		myWechatHandler.setStoreId(storeId);
		_wk.setMpAct(mpAccount);
		_wk.setWechatHandler(myWechatHandler);
		_wk.setParams(req.getParameterMap());
        String respmsg = "success";
        try {
        	if ("GET".equals(req.getMethod())) {
                respmsg = _wk.check();
            }
            else {
                respmsg = _wk.handle(req.getInputStream());
            }
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
        
        // 输出回复消息
        resp.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        resp.getWriter().print(respmsg);
    }
	
	/*@RequestMapping("/article/{keyId}")
	@ResponseBody
	public void replyArticle(@PathVariable int keyId,HttpServletRequest request,HttpServletResponse response,Map<String, Object> model)throws Exception{
		MaterialWarehouse mh = materialWarehouseDao.findOne(keyId);
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		response.getWriter().print(mh.getArticleComments());
	}*/
	
	@RequestMapping("/article/{keyId}")
	public String replyArticle2(@PathVariable int keyId,HttpServletRequest request,HttpServletResponse response,Map<String, Object> model)throws Exception{
		MaterialWarehouse mh = materialWarehouseDao.findOne(keyId);
		model.put("title", mh.getArticleTitle());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String time = df.format(new Date())+"&nbsp;"+mh.getArticleAuthor();
		model.put("time", time);
		model.put("content", mh.getArticleComments());
		return "front";
	}
   
}
