package cn.org.citycloud.zwhs.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.json.JSONArray;

import org.nutz.json.Json;
import org.nutz.json.JsonFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cn.org.citycloud.zwhs.bean.wx.Asset;
import cn.org.citycloud.zwhs.bean.wx.WxMenu;
import cn.org.citycloud.zwhs.core.BaseController;
import cn.org.citycloud.zwhs.entity.Store;
import cn.org.citycloud.zwhs.entity.WechatMenu;
import cn.org.citycloud.zwhs.handler.MyWechatHandler;
import cn.org.citycloud.zwhs.mpsdk4j.api.WechatAPIImpl;
import cn.org.citycloud.zwhs.mpsdk4j.vo.MPAccount;
import cn.org.citycloud.zwhs.repository.MaterialWarehouseDao;
import cn.org.citycloud.zwhs.repository.StoreDao;
import cn.org.citycloud.zwhs.repository.WechatKeyDao;
import cn.org.citycloud.zwhs.repository.WechatMenuDao;

@RestController
public class TryController extends BaseController {
	
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

	
	@SuppressWarnings("rawtypes")
	@RequestMapping(value="/try/wx/menu",method=RequestMethod.GET)
	public  boolean setWxMenu(){
				
		WechatMenu  wechatMenu = wechatMenuDao.findByStoreId(7);
		Store store  = storeDao.findByStoreId(7);
		String content = wechatMenu.getContent();
		MPAccount mpAccount= new MPAccount();
		mpAccount.setAppId(store.getAppId());
		mpAccount.setAppSecret(store.getAppSecret());
		mpAccount.setMpId(store.getWecharEntId());
		WechatAPIImpl wechatAPIImpl = new WechatAPIImpl(mpAccount);	
		JSONArray jsonArray = JSONArray.fromObject(content);
		Map<String, Class> classMap = new HashMap<String, Class>();
		classMap.put("assets", Asset.class);
		classMap.put("submenu", WxMenu.class);
		List<WxMenu> wxMenus = JSONArray.toList(jsonArray, WxMenu.class, classMap);
		List<cn.org.citycloud.zwhs.mpsdk4j.vo.api.Menu> menus = new ArrayList<cn.org.citycloud.zwhs.mpsdk4j.vo.api.Menu>();
		for(WxMenu wxMenu:wxMenus){
			cn.org.citycloud.zwhs.mpsdk4j.vo.api.Menu menu = setMenu2(wxMenu);
			if(menu!=null) menus.add(menu);
		}
		Map<String, Object> body = new HashMap<String, Object>();
	    body.put("button", menus);
	    String data = Json.toJson(body, JsonFormat.compact());
	    System.out.println("data:"+data);
	    return  true;
	}
	
	/**
	 * 转换自定义菜单到微信菜单
	 * @param wxMenu
	 * @return
	 */
	private cn.org.citycloud.zwhs.mpsdk4j.vo.api.Menu setMenu2(WxMenu wxMenu){
		cn.org.citycloud.zwhs.mpsdk4j.vo.api.Menu menu = new cn.org.citycloud.zwhs.mpsdk4j.vo.api.Menu();
		if(wxMenu.getType().trim().equalsIgnoreCase("link")){
			
			menu.setType("view");
			menu.setName(wxMenu.getTitle());
			menu.setUrl(wxMenu.getLink().getUrl());
			
		}else if(wxMenu.getType().trim().equalsIgnoreCase("image")){
			menu.setType("click");
			menu.setName(wxMenu.getTitle());
			String key="";
			if(wxMenu.getAssets().size()>0){
				for(Asset asset:wxMenu.getAssets()){
					key+=asset.getId()+"_";
					
				}
			}
			
			if(key.length()>0) menu.setKey(key);
			
		}else if(wxMenu.getType().trim().equalsIgnoreCase("text")){
			menu.setName(wxMenu.getTitle());
			List<cn.org.citycloud.zwhs.mpsdk4j.vo.api.Menu> menus = new ArrayList<cn.org.citycloud.zwhs.mpsdk4j.vo.api.Menu>();
			if(wxMenu.getSubmenu().size()>0){
				for(WxMenu wm:wxMenu.getSubmenu()){
					cn.org.citycloud.zwhs.mpsdk4j.vo.api.Menu mu = setMenu2(wm);
					if(mu!=null) menus.add(mu);
				}
			}
			
			menu.setSubButtons(menus);
		}else {
			menu = null;
		}
		return menu;
	}
	
}
