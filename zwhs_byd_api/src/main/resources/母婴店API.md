中物华商B2C平台Rest API
==========================
母婴店端 
==========================

---

#[1.商品库相关](#1-api)

###[1.1 母婴店上架/下架商品查询](#1-1-) 
###[1.2 母婴店告罄商品查询](#1-2-)
###[1.3 中物华商商品库查询](#1-3-)
###[1.4 商品申请API](#1-4-api)
###[1.5 查询某个商品详情API](#1-5-api)
###[1.6 查询某个商品的所有评论API](#1-6-api)
###[1.7 屏蔽或取消屏蔽某个评论API](#1-7-api)
###[1.8 上架某个商品(我的仓库)API](#1-8-api)
###[1.9上架某个商品(中物华商商品库)API](#1-9-api)
###[1.10 下架某个商品API](#1-10-api)
###[1.11 更新某个商品属性API](#1-11-api)
###[1.12 品牌信息API](#1-12-api)
#####[1.12.1 根据品牌名称模糊查询品牌信息API](#1-12-1-api)
###[1.13 分类信息API](#1-13-api)
###[1.14 子分类API](#1-14-api)
---

#[2. 母婴店登录注册相关API](#2-api)

###[2.1 注册API](#2-1-api) 
###[2.2 登录API](#2-2-api)
###[2.3 母婴店信息认证API](#2-3-api)
###[2.4 获取省级信息API](#2-4-api) 
###[2.5 获取市级信息API](#2-5-api)
###[2.6 获取区级信息API](#2-6-api)
###[2.7 发送短信验证码API](#2-7-api) 

---
#[3. 会员管理API](#3-api)

###[3.1 会员管理API](#3-1-api) 
###[3.2 会员详情API](#3-2-api)
 
---
#[4. 订单管理API](#4-api)

###[4.1 订单管理API](#4-1-api) 
###[4.2 订单详情API](#4-2-api)

---
#[5. 店铺管理API](#5-api)

###[5.1 更新店铺模板信息API](#5-1-api) 
###[5.2 获取店铺信息API](#5-2-api) 

---

#[6. 财务管理API](#6-api)

###[6.1 母婴店财务信息API](#6-1-api) 
###[6.2 历史提款列表API](#6-2-api)
###[6.3 收款详情API](#6-3-api)
###[6.4 申请提款API](#6-4-api) 

---

#[7. 我的服务API](#7-api)

###[7.1 获取服务信息API](#7-1-api) 
###[7.2 上/下架某个服务API](#7-2-api)


---

#[8. 微信API](#8-api)

###[8.1 微信绑定API](#8-1-api) 
###[8.2 获取门店微信账号信息API](#8-2-api)
###[8.3 获取门店关键字列表API](#8-3-api) 
###[8.4 获取关键字的图文列表API](#8-4-api)
###[8.5 添加关键字API](#8-5-api) 
###[8.6 更新关键字回复信息API](#8-6-api)
###[8.7 删除关键字API](#8-7-api) 
###[8.8 获取门店关注时和答不上来关键字API](#8-8-api)
###[8.9 添加门店微信菜单API](#8-9-api)
###[8.10 更新门店微信菜单API](#8-10-api) 
###[8.11 查询门店微信菜单API](#8-11-api)
###[8.12 获取某个关键字信息API](#8-12-api)
---
#[9. 首页API](#9-api)

###[9.1 首页图表API](#9-1-api) 
###[9.2 首页数据API](#9-2-api)
---
#[10. 门店图片API](#10-api)

###[10.1 获取门店图片列表API](#0-1-api) 
###[10.2 添加门店图片API](#10-2-api)
---


1. 商品库相关API
===
---
##1.1 母婴店上架/下架商品查询
####功能
>母婴店上架/下架商品查询

####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/commodity/shelve

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token


####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| page     | integer |   否     |页数，默认为1
| pageSize     | integer |   否     |每页大小，默认为10
| goodsState     | integer |   否     |商品状态：1为上架，0为下架，默认为1
| searchValue     | string |   否     |商品名称/品牌(模糊查询)
| gcNo     | integer |   否     |商品分类编码，默认为0（全部）

####返回示例

	{
	  "content": [
	    {
	      "goodsId": 1,
	      "avgScore": null,
	      "brandName": "雀巢",
	      "brandNo": 101,
	      "evaluatedNum": 0,
	      "gcLitId": 1101,
	      "gcLitName": "妈妈奶粉",
	      "gcName": "妈妈专区",
	      "gcNo": 11,
	      "goodsAttr": "属性",
	      "goodsBody": "妈妈奶粉哈哈哈哈",
	      "goodsCostprice": 100,
	      "goodsImage": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	      "goodsImageSmall": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	      "goodsMarketprice": 152,
	      "goodsName": "雀巢妈妈孕产妇营养配方奶粉900g",
	      "goodsNo": "101110110001",
	      "goodsNumber": 100,
	      "goodsPrice": 152,
	      "goodsSellprice": 152,
	      "goodsSn": "6917878025162",
	      "goodsSpec": "6*900g",
	      "goodsState": 1,
	      "insDate": 1448884535000,
	      "isRecommend": 1,
	      "offlineTime": 1451562851000,
	      "sellNumber": 23,
	      "stockNumber": 76,
	      "storeId": 1,
	      "updDate": 1448884536000
	    },
	    {
	      "goodsId": 2,
	      "avgScore": null,
	      "brandName": "澳邦",
	      "brandNo": 102,
	      "evaluatedNum": 0,
	      "gcLitId": 1101,
	      "gcLitName": "妈妈奶粉",
	      "gcName": "妈妈专区",
	      "gcNo": 11,
	      "goodsAttr": "属性",
	      "goodsBody": "妈妈奶粉哈哈哈哈",
	      "goodsCostprice": 100,
	      "goodsImage": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	      "goodsImageSmall": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	      "goodsMarketprice": 152,
	      "goodsName": "雀巢妈妈孕产妇营养配方奶粉900g",
	      "goodsNo": "102120110001",
	      "goodsNumber": 100,
	      "goodsPrice": 152,
	      "goodsSellprice": 152,
	      "goodsSn": "6917878025162",
	      "goodsSpec": "6*900g",
	      "goodsState": 1,
	      "insDate": 1448884535000,
	      "isRecommend": 0,
	      "offlineTime": 1451562851000,
	      "sellNumber": 23,
	      "stockNumber": 76,
	      "storeId": 1,
	      "updDate": 1448884536000
	    }
	  ],
	  "totalPages": 8,
	  "totalElements": 16,
	  "last": false,
	  "size": 2,
	  "number": 0,
	  "first": true,
	  "sort": null,
	  "numberOfElements": 2
	}
---


##1.2 母婴店告罄商品查询
####功能
>母婴店告罄商品查询

####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/commodity/exhaust

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token


####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| page     | integer |   否     |页数，默认为1
| pageSize     | integer |   否     |每页大小，默认为10
| searchValue     | string |   否     |商品名称/品牌(模糊查询)
| gcNo     | integer |   否     |商品分类编码，默认为0（全部）


####返回示例

	{
	  "content": [
	    {
	      "goodsId": 1,
	      "avgScore": null,
	      "brandName": "雀巢",
	      "brandNo": 101,
	      "evaluatedNum": 0,
	      "gcLitId": 1101,
	      "gcLitName": "妈妈奶粉",
	      "gcName": "妈妈专区",
	      "gcNo": 11,
	      "goodsAttr": "属性",
	      "goodsBody": "妈妈奶粉哈哈哈哈",
	      "goodsCostprice": 100,
	      "goodsImage": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	      "goodsImageSmall": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	      "goodsMarketprice": 152,
	      "goodsName": "雀巢妈妈孕产妇营养配方奶粉900g",
	      "goodsNo": "101110110001",
	      "goodsNumber": 100,
	      "goodsPrice": 152,
	      "goodsSellprice": 152,
	      "goodsSn": "6917878025162",
	      "goodsSpec": "6*900g",
	      "goodsState": 1,
	      "insDate": 1448884535000,
	      "isRecommend": 1,
	      "offlineTime": 1451562851000,
	      "sellNumber": 23,
	      "stockNumber": 76,
	      "storeId": 1,
	      "updDate": 1448884536000
	    },
	    {
	      "goodsId": 2,
	      "avgScore": null,
	      "brandName": "澳邦",
	      "brandNo": 102,
	      "evaluatedNum": 0,
	      "gcLitId": 1101,
	      "gcLitName": "妈妈奶粉",
	      "gcName": "妈妈专区",
	      "gcNo": 11,
	      "goodsAttr": "属性",
	      "goodsBody": "妈妈奶粉哈哈哈哈",
	      "goodsCostprice": 100,
	      "goodsImage": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	      "goodsImageSmall": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	      "goodsMarketprice": 152,
	      "goodsName": "雀巢妈妈孕产妇营养配方奶粉900g",
	      "goodsNo": "102120110001",
	      "goodsNumber": 100,
	      "goodsPrice": 152,
	      "goodsSellprice": 152,
	      "goodsSn": "6917878025162",
	      "goodsSpec": "6*900g",
	      "goodsState": 1,
	      "insDate": 1448884535000,
	      "isRecommend": 0,
	      "offlineTime": 1451562851000,
	      "sellNumber": 23,
	      "stockNumber": 76,
	      "storeId": 1,
	      "updDate": 1448884536000
	    }
	  ],
	  "totalPages": 8,
	  "totalElements": 16,
	  "last": false,
	  "size": 2,
	  "number": 0,
	  "first": true,
	  "sort": null,
	  "numberOfElements": 2
	}

---

##1.3 中物华商商品库查询
####功能
>中物华商商品库查询接口
	
####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/commodity_syl

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token


####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| page     | integer |   否     |页数，默认为1
| pageSize     | integer |   否     |每页大小，默认为10
| goodsState     | integer |   否     |商品状态：1为上架，0为下架，默认为1
| searchValue     | string |   否     |商品名称/品牌(模糊查询)
| gcNo     | integer |   否     |商品分类编码，默认为0（全部）


####成功返回示例

	{
	  "content": [
	    {
	      "goodsId": 3,
	      "brandName": "雀巢",
	      "brandNo": 101,
	      "confirmTime": null,
	      "confirmUserId": 0,
	      "confirmUserName": null,
	      "contactsName": null,
	      "contactsPhone": null,
	      "gcLitId": 1101,
	      "gcLitName": "妈妈奶粉",
	      "gcName": "妈妈专区",
	      "gcNo": 11,
	      "goodsAddtime": null,
	      "goodsAttr": null,
	      "goodsBody": null,
	      "goodsCostprice": null,
	      "goodsImage": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	      "goodsImageSmall": null,
	      "goodsMarketprice": 152,
	      "goodsName": "雀巢妈妈孕产妇营养配方奶粉900g",
	      "goodsNo": "101110110001",
	      "goodsPrice": 152,
	      "goodsSn": "6917878025162",
	      "goodsSpec": "6*900g",
	      "goodsState": 1,
	      "goodsVerify": 1,
	      "insDate": 1448525435000,
	      "memberId": 0,
	      "storeId": 0,
	      "updDate": 1448525435000
	    }
	  ],
	  "last": true,
	  "totalPages": 1,
	  "totalElements": 1,
	  "size": 10,
	  "number": 0,
	  "first": true,
	  "sort": null,
	  "numberOfElements": 1
	}
####没有数值的返回示例
	{
	  "content": [],
	  "last": true,
	  "totalPages": 0,
	  "totalElements": 0,
	  "size": 2,
	  "number": 0,
	  "sort": null,
	  "first": true,
	  "numberOfElements": 0
	}

---

##1.4 商品申请API
####功能
>母婴店商品申请接口
	
####HTTP请求方式
>POST

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/commodity

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token


####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| goodsName     | string |   是     |商品名称
| brandNo     | integer |   是     |品牌编号
| gcNo     | integer |   是     |商品分类编码
| goodsSn     | string |   是     |商品条形码
| gcLitId     | integer |   是     |商品子分类编码
| goodsSpec     | string |   是     |规格值
| goodsImage     | string |   是     |商品主图
| goodsImageSmall     | string |   是     |商品副图
| goodsBody     | string |   是     |商品内容



####成功返回示例
	{
	  "msg": "申请完成",
	  "code": "1",
	  "content": {
	    "goodsId": 11,
	    "brandName": "飞鹤",
	    "brandNo": 103,
	    "confirmTime": null,
	    "confirmUserId": 0,
	    "confirmUserName": null,
	    "contactsName": null,
	    "contactsPhone": null,
	    "gcLitId": 1307,
	    "gcLitName": "宝宝营养/钙铁锌，维生素",
	    "gcName": "辅食营养",
	    "gcNo": 13,
	    "goodsAddtime": null,
	    "goodsAttr": null,
	    "goodsBody": "",
	    "goodsCostprice": null,
	    "goodsImage": "G01/M00/00/00/CgA8BFZWtwaAP8_7AABFj3XfVtI385.jpg",
	    "goodsImageSmall": "",
	    "goodsMarketprice": null,
	    "goodsName": "350g飞鹤奶粉",
	    "goodsNo": "GS1449105117169",
	    "goodsPrice": null,
	    "goodsSn": "6907925885612",
	    "goodsSpec": "12*350g",
	    "goodsState": 0,
	    "goodsVerify": 10,
	    "insDate": 1449105117169,
	    "memberId": 0,
	    "storeId": 0,
	    "updDate": 1449105117169
	  }
	}

####商品已存在返回示例
`{
  "msg": "商品已存在!",
  "code": "2"
}`
####失败返回示例
`{
  "msg": "申请失败!",
  "code": "2"
}`

---

##1.5 查询某个商品详情API
####功能
>查询某个商品详情接口
	
####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/commodity/{id}

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| id     | integer |   是     |商品ID


####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:



####成功返回示例
	{
	  "goodsId": 16,
	  "avgScore": null,
	  "brandName": "雀巢",
	  "brandNo": 101,
	  "evaluatedNum": 0,
	  "gcLitId": 1101,
	  "gcLitName": "妈妈奶粉",
	  "gcName": "妈妈专区",
	  "gcNo": 11,
	  "goodsAttr": "fuck niap",
	  "goodsBody": "妈妈奶粉哈哈哈哈",
	  "goodsCostprice": 100,
	  "goodsImage": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	  "goodsImageSmall": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	  "goodsMarketprice": 152,
	  "goodsName": "350g飞鹤加锌铁钙奶粉",
	  "goodsNo": "101110110001",
	  "goodsNumber": 100,
	  "goodsPrice": 152,
	  "goodsSellprice": 152,
	  "goodsSn": "6917878025162",
	  "goodsSpec": "6*900g",
	  "goodsState": 1,
	  "insDate": 1448884535000,
	  "isRecommend": 1,
	  "offlineTime": 1451562851000,
	  "sellNumber": 23,
	  "stockNumber": 76,
	  "storeId": 1,
	  "updDate": 1448884536000
	}

####失败返回示例



---

##1.6 查询某个商品的所有评论API
####功能
>查询某个商品的所有评论接口
	
####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/comment/{id}

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token


####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:



####成功返回示例
	[
	  {
	    "gevalId": 1,
	    "companyName": "妈咪爱母婴店",
	    "gevalAddtime": 2015,
	    "gevalContent": "宝宝不错，哈哈哈哈",
	    "gevalExplain": null,
	    "gevalImage": null,
	    "gevalIsanonymous": 0,
	    "gevalRemark": null,
	    "gevalScores": 6,
	    "gevalState": 0,
	    "goodsId": 1,
	    "goodsName": "雀巢妈妈孕产妇营养配方奶粉900g",
	    "goodsPrice": 152,
	    "memberId": 2,
	    "memberTruename": "蓝波",
	    "orderGoodsId": 1,
	    "orderId": 1000001,
	    "orderType": 1,
	    "storeId": 1
	  },
	  {
	    "gevalId": 2,
	    "companyName": "妈咪爱母婴店",
	    "gevalAddtime": 2015,
	    "gevalContent": "宝宝不错，哈哈哈哈",
	    "gevalExplain": null,
	    "gevalImage": null,
	    "gevalIsanonymous": 0,
	    "gevalRemark": null,
	    "gevalScores": 6,
	    "gevalState": 0,
	    "goodsId": 1,
	    "goodsName": "雀巢妈妈孕产妇营养配方奶粉900g",
	    "goodsPrice": 152,
	    "memberId": 2,
	    "memberTruename": "蓝波",
	    "orderGoodsId": 1,
	    "orderId": 1000001,
	    "orderType": 1,
	    "storeId": 1
	  }
	]

####失败返回示例

`暂无数据`


---

##1.7 屏蔽或取消屏蔽某个评论API
####功能
>屏蔽或取消屏蔽某个评论接口
	
####HTTP请求方式
>PUT

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/comment/{id}/{status}

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token


####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| id     | Integer |   是     |评论ID
| status     | Integer |   是     |0为正常，1为屏蔽


####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:



####成功返回示例

`暂无数据`

####失败返回示例

`暂无数据`

---

##1.8 上架某个商品(我的仓库)API
####功能
>上架某个商品(我的仓库)接口
	
####HTTP请求方式
>PUT

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/commodity/up/{id}/{status}

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| id     | integer |   是     |商品ID
| status     | integer |   是     |上架状态，值为1

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| sellPrice     | bigdecimal |   是     |售价
| goodNumber     | integer |   是     |上架数量
| offlineTime     | string |   是     |下架时间，格式为"2015-05-13 13:13 :13"
| isRecommend     | byte |   是     |是否推荐：0为不推荐，1为推荐
| goodBody     | string |   否     |产品介绍

####成功返回示例

	{
	  "msg": "成功",
	  "code": "1",
	  "content": {
	    "goodsId": 16,
	    "avgScore": 0,
	    "brandName": "雀巢",
	    "brandNo": 101,
	    "evaluatedNum": 0,
	    "gcLitId": 1101,
	    "gcLitName": "妈妈奶粉",
	    "gcName": "妈妈专区",
	    "gcNo": 11,
	    "goodsAttr": "fuck niap",
	    "goodsBody": "测试信息",
	    "goodsCostprice": 100,
	    "goodsImage": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	    "goodsImageSmall": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	    "goodsMarketprice": 152,
	    "goodsName": "350g飞鹤加锌铁钙奶粉",
	    "goodsNo": "101110110001",
	    "goodsNumber": 50,
	    "goodsPrice": 152,
	    "goodsSellprice": 1000,
	    "goodsSn": "6917878025162",
	    "goodsSpec": "6*900g",
	    "goodsState": 0,
	    "insDate": 1448884535000,
	    "isRecommend": 0,
	    "offlineTime": 1450972800000,
	    "sellNumber": 23,
	    "stockNumber": 76,
	    "storeId": 1,
	    "updDate": 1448884536000
	  }
	}

####失败返回示例

`{
  "msg": "失败",
  "code": "2"
}`


---
##1.9上架某个商品(中物华商商品库)API
####功能
>上架某个商品(中物华商商品库)接口
	
####HTTP请求方式
>POST

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/commodity/up/{id}/{status}

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| id     | integer |   是     |商品库的商品ID
| status     | integer |   是     |上架状态，值为1


####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| sellPrice     | bigdecimal |   是     |售价
| goodNumber     | integer |   是     |上架数量
| offlineTime     | string |   是     |下架时间，格式为"2015-05-13 13:13 :13"
| isRecommend     | byte |   是     |是否推荐：0为不推荐，1为推荐
| goodBody     | string |   否     |产品介绍

####成功返回示例

	{
	  "msg": "成功",
	  "code": "1",
	  "content": {
	    "goodsId": 16,
	    "avgScore": 0,
	    "brandName": "雀巢",
	    "brandNo": 101,
	    "evaluatedNum": 0,
	    "gcLitId": 1101,
	    "gcLitName": "妈妈奶粉",
	    "gcName": "妈妈专区",
	    "gcNo": 11,
	    "goodsAttr": "fuck niap",
	    "goodsBody": "测试信息",
	    "goodsCostprice": 100,
	    "goodsImage": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	    "goodsImageSmall": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	    "goodsMarketprice": 152,
	    "goodsName": "350g飞鹤加锌铁钙奶粉",
	    "goodsNo": "101110110001",
	    "goodsNumber": 50,
	    "goodsPrice": 152,
	    "goodsSellprice": 1000,
	    "goodsSn": "6917878025162",
	    "goodsSpec": "6*900g",
	    "goodsState": 0,
	    "insDate": 1448884535000,
	    "isRecommend": 0,
	    "offlineTime": 1450972800000,
	    "sellNumber": 23,
	    "stockNumber": 76,
	    "storeId": 1,
	    "updDate": 1448884536000
	  }
	}

####失败返回示例

`{
  "msg": "失败",
  "code": "2"
}`

---

##1.10 下架某个商品API
####功能
>下架某个商品接口
	
####HTTP请求方式
>PUT

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/commodity/down/{id}/{status}

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| id     | integer |   是     |商品ID

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| sellPrice     | bigdecimal |   是     |售价
| goodNumber     | integer |   是     |上架数量
| offlineTime     | string |   是     |下架时间，格式为"2015-05-13 13:13 :13"
| isRecommend     | byte |   是     |是否推荐：0为不推荐，1为推荐
| goodBody     | string |   否     |产品介绍

####成功返回示例

	{
	  "msg": "成功",
	  "code": "1",
	  "content": {
	    "goodsId": 16,
	    "avgScore": 0,
	    "brandName": "雀巢",
	    "brandNo": 101,
	    "evaluatedNum": 0,
	    "gcLitId": 1101,
	    "gcLitName": "妈妈奶粉",
	    "gcName": "妈妈专区",
	    "gcNo": 11,
	    "goodsAttr": "fuck niap",
	    "goodsBody": "测试信息",
	    "goodsCostprice": 100,
	    "goodsImage": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	    "goodsImageSmall": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	    "goodsMarketprice": 152,
	    "goodsName": "350g飞鹤加锌铁钙奶粉",
	    "goodsNo": "101110110001",
	    "goodsNumber": 50,
	    "goodsPrice": 152,
	    "goodsSellprice": 1000,
	    "goodsSn": "6917878025162",
	    "goodsSpec": "6*900g",
	    "goodsState": 0,
	    "insDate": 1448884535000,
	    "isRecommend": 0,
	    "offlineTime": 1450972800000,
	    "sellNumber": 23,
	    "stockNumber": 76,
	    "storeId": 1,
	    "updDate": 1448884536000
	  }
	}

####失败返回示例

`{
  "msg": "失败",
  "code": "2"
}`


---
##1.11 更新某个商品属性API
####功能
>更新某个商品属性接口
	
####HTTP请求方式
>PUT

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/commodity/{id}

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| id     | integer |   是     |商品ID

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| sellPrice     | bigdecimal |   是     |售价
| goodNumber     | integer |   是     |上架数量
| offlineTime     | string |   是     |下架时间，格式为"2015-05-13 13:13 :13"
| isRecommend     | byte |   是     |是否推荐：0为不推荐，1为推荐
| goodsBody     | string |   否     |产品介绍

####成功返回示例

	{
	  "msg": "成功",
	  "code": "1",
	  "content": {
	    "goodsId": 16,
	    "avgScore": 0,
	    "brandName": "雀巢",
	    "brandNo": 101,
	    "evaluatedNum": 0,
	    "gcLitId": 1101,
	    "gcLitName": "妈妈奶粉",
	    "gcName": "妈妈专区",
	    "gcNo": 11,
	    "goodsAttr": "fuck niap",
	    "goodsBody": "测试信息",
	    "goodsCostprice": 100,
	    "goodsImage": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	    "goodsImageSmall": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	    "goodsMarketprice": 152,
	    "goodsName": "350g飞鹤加锌铁钙奶粉",
	    "goodsNo": "101110110001",
	    "goodsNumber": 50,
	    "goodsPrice": 152,
	    "goodsSellprice": 1000,
	    "goodsSn": "6917878025162",
	    "goodsSpec": "6*900g",
	    "goodsState": 0,
	    "insDate": 1448884535000,
	    "isRecommend": 0,
	    "offlineTime": 1450972800000,
	    "sellNumber": 23,
	    "stockNumber": 76,
	    "storeId": 1,
	    "updDate": 1448884536000
	  }
	}

####失败返回示例

`{
  "msg": "失败",
  "code": "2"
}`


---

##1.12 品牌信息API
####功能
>品牌信息接口
	
####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/brand

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token


####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:


####成功返回示例
	[
	  {
	    "id": 1,
	    "brandName": "雀巢",
	    "brandNo": 101,
	    "brandPic": "G01/M00/00/00/CgA8BFZVksaAV88rAABEnBeGtN8264.jpg",
	    "brandSort": 1,
	    "contactsName": null,
	    "goodsSource": 1,
	    "insDate": 1448513756000,
	    "updDate": 1448513759000
	  },
	  {
	    "id": 2,
	    "brandName": "澳邦",
	    "brandNo": 102,
	    "brandPic": "G01/M00/00/00/CgA8BFZVkj2ARq3_AADGpcMWgAU306.png",
	    "brandSort": 2,
	    "contactsName": null,
	    "goodsSource": 1,
	    "insDate": 1448513903000,
	    "updDate": 1448513905000
	  },
	  {
	    "id": 3,
	    "brandName": "飞鹤",
	    "brandNo": 103,
	    "brandPic": "G01/M02/00/00/CgA8BFZVkp2AZFljAABeJ4odPZw592.jpg",
	    "brandSort": 3,
	    "contactsName": null,
	    "goodsSource": 1,
	    "insDate": 1448513918000,
	    "updDate": 1448513920000
	  },
	  {
	    "id": 4,
	    "brandName": "欢恩宝",
	    "brandNo": 104,
	    "brandPic": null,
	    "brandSort": 4,
	    "contactsName": null,
	    "goodsSource": 1,
	    "insDate": 1448513939000,
	    "updDate": 1448513941000
	  },
	  {
	    "id": 5,
	    "brandName": "圣元",
	    "brandNo": 105,
	    "brandPic": "G01/M01/00/00/CgA8BFZVkviABxL-AABdiY7lPBY421.jpg",
	    "brandSort": 5,
	    "contactsName": null,
	    "goodsSource": 1,
	    "insDate": 1449042785000,
	    "updDate": 1449042787000
	  },
	  {
	    "id": 6,
	    "brandName": "圣元",
	    "brandNo": 929,
	    "brandPic": "/test.img",
	    "brandSort": 6,
	    "contactsName": "allen大牛",
	    "goodsSource": 1,
	    "insDate": 1449105767000,
	    "updDate": null
	  }
	]

####失败返回示例

`暂无数据`


---

##1.12.1 根据品牌名称模糊查询品牌信息API
####功能
>根据品牌名称模糊查询品牌信息接口
	
####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/brand/1

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token


####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| brandName     | string |   是     |品牌名称，示例：圣

####成功返回示例
	[
	  {
	    "id": 5,
	    "brandName": "圣元",
	    "brandNo": 105,
	    "brandPic": "G01/M01/00/00/CgA8BFZVkviABxL-AABdiY7lPBY421.jpg",
	    "brandSort": 5,
	    "contactsName": null,
	    "goodsSource": 1,
	    "insDate": 1449042785000,
	    "updDate": 1449042787000
	  },
	  {
	    "id": 6,
	    "brandName": "圣元",
	    "brandNo": 929,
	    "brandPic": "/test.img",
	    "brandSort": 6,
	    "contactsName": "allen大牛",
	    "goodsSource": 1,
	    "insDate": 1449105767000,
	    "updDate": null
	  }
	]

####失败返回示例

`暂无数据`


---

##1.13 分类信息API
####功能
>分类信息接口
	
####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/class

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token


####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:


####成功返回示例

	[
	  {
	    "id": 127,
	    "gcDescription": "",
	    "gcKeywords": "",
	    "gcName": "妈妈专区",
	    "gcNo": 11,
	    "gcParentId": 0,
	    "gcSort": 1,
	    "gcTitle": "妈妈专区",
	    "insDate": 1448516080000,
	    "updDate": 1448516080000
	  },
	  {
	    "id": 128,
	    "gcDescription": "",
	    "gcKeywords": "",
	    "gcName": "奶粉专区",
	    "gcNo": 12,
	    "gcParentId": 0,
	    "gcSort": 2,
	    "gcTitle": "奶粉专区",
	    "insDate": 1448516080000,
	    "updDate": 1448516080000
	  }
	]

####失败返回示例

`暂无数据`

---

##1.14 子分类API
####功能
>子分类信息接口
	
####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/class/{fatherid}

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token


####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:


####成功返回示例

	[
	  {
	    "id": 3,
	    "gcDescription": "",
	    "gcKeywords": "",
	    "gcName": "妈妈奶粉",
	    "gcNo": 1101,
	    "gcParentId": 11,
	    "gcSort": 1,
	    "gcTitle": "妈妈奶粉",
	    "insDate": 1448515538000,
	    "updDate": 1448515538000
	  },
	  {
	    "id": 4,
	    "gcDescription": "",
	    "gcKeywords": "",
	    "gcName": "妈妈营养",
	    "gcNo": 1102,
	    "gcParentId": 11,
	    "gcSort": 2,
	    "gcTitle": "妈妈营养",
	    "insDate": 1448515538000,
	    "updDate": 1448515538000
	  }
	]

####失败返回示例

`暂无数据`

---

2. 母婴店登录注册相关API
===
---
##2.1 注册API
####功能
>注册接口

####HTTP请求方式
>POST

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/user/tk/register

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:


####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| userTruename     | String |   是     |联系人
| userPhone     | String |   是     |手机号
| userPwd     | String |   是     |密码
| userEmail     | String |   是     |电子邮箱
| smsinfo     | String |   是     |短信码


####返回示例


	{
	  "msg": "成功",
	  "code": "1",
	  "content": {
	    "userId": 2,
	    "storeId": 0,
	    "userAvatar": "",
	    "userEmail": "a@163.com",
	    "userPhone": "12345678912",
	    "userSex": 0,
	    "userTruename": "alex111"
	  }
	}

####失败示例

	{
	  "msg": "该手机号已存在",
	  "code": "2"
	}
---


##2.2 登录API
####功能
>登录接口

####HTTP请求方式
>POST

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/user/tk/login

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:


####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| phone     | String |   是     |手机号
| password     | String |   是     |密码



####返回示例
	{
	  "msg": "登录成功",
	  "code": "1",
	  "srvflay": 1,
	  "companyName": "aabb",
	  "storeState": 1,
	  "storeId": 3,
	  "userId": 2,
	  "token": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJjcnRpbWUiOjE0NTAwNjY2ODE1MTMsInVzZXJJZCI6Mn0.byJ_rqMyFPJdUvPwo6YeY__JwGqKZM7u8lFMhatiCAk"
	}

####失败示例

	{
	  "code": "2",
	  "msg": "用户名密码不正确"
	}
---

##2.3 母婴店信息认证API
####功能
>母婴店信息认证接口

####HTTP请求方式
>POST

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/user/identify

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| storeOwner     | String |   是     |法人姓名
| bankAccName     | String |   是     |银行开户名
| bankAccNumber     | String |   是     |公司银行账号
| businessLicence     | String |   是     |营业执照号
| companyAddress     | String |   是     |公司详细地址
| companyName     | String |   是     |公司名称
| companyRegion     | Integer |   是     |归属区县代码
| organizationCode     | String |   是     |组织机构代码电子版
| ownerCardFront     | String |   是     |身份证正面电子版
| regionCity     | Integer |   是     |归属市代码
| regionProv     | Integer |   是     |归属省代码
| storeImage     | String |   是     |母婴店照片
| storeOwnerCard     | String |   是     |身份证
| taxRegCert     | String |   是     |税务登记证号电子版
| storeUserId     | Integer |   是     |用户ID
| bankOwner     | String |   是     |持卡人姓名






####返回示例
	{
	  "msg": "成功",
	  "code": "1",
	  "storeId": 4
	}

####失败示例

---


##2.4 获取省级信息API
####功能
>获取省级信息接口

####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/user/prov/{level}

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token
####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| level     | Integer |   是     | 1 为省级
####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:


####返回示例
	[
	  {
	    "regionCode": 110000,
	    "regionLevel": 1,
	    "regionName": "北京市"
	  },
	  {
	    "regionCode": 120000,
	    "regionLevel": 1,
	    "regionName": "天津市"
	  }
	]

####失败示例

---


##2.5 获取市级信息API
####功能
>获取市级信息接口

####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/user/city/{level}

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token
####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| level     | Integer |   是     | 2 为市级
####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| code     | Integer |   是     | 省级代码

####返回示例
	[
	  {
	    "regionCode": 110100,
	    "regionLevel": 2,
	    "regionName": "市辖区"
	  },
	  {
	    "regionCode": 110200,
	    "regionLevel": 2,
	    "regionName": "县"
	  }
	]

####失败示例

---

##2.6 获取区级信息API
####功能
>获取区级信息接口

####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/user/region/{level}

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token
####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| level     | Integer |   是     | 3 为区县
####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| code     | Integer |   是     | 市级代码

####返回示例
	[
	  {
	    "regionCode": 110101,
	    "regionLevel": 3,
	    "regionName": "东城区"
	  },
	  {
	    "regionCode": 110102,
	    "regionLevel": 3,
	    "regionName": "西城区"
	  }
	]

####失败示例

---


##2.7 发送短信验证码API
####功能
>发送短信验证码接口

####HTTP请求方式
>POST

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/user/tk/sms

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token
####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| phone     | String |   是     | 发送手机号

####返回示例
	{
	  "msg": "ok",
	  "code": 0,
	  "content": "372255"
	}

####失败示例

---


3. 会员管理API
===
---
##3.1 会员管理API
####功能
>会员管理接口

####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/vips

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| page     | Integer |   是     |页数
| pageSize     | Integer |   是     |页面大小
| searchValue     | String |   否     |查询条件



####返回示例
	{
	  "content": [
	    {
	      "memberId": 2,
	      "insDate": 1449021999000,
	      "memberAvatar": "http://wx.qlogo.cn/mmopen/fP5icNZibkZbFYc4O7YVjPEqgNWZOtJGnJVsjxyTIgdN2LmbNicXjZrxUDQdIMEEyAvIjHFck39vUwYNOkicaYfguhdTSlzJ2Gqv/0",
	      "memberEmail": null,
	      "memberLoginIp": "60.173.247.22",
	      "memberLoginNum": 2,
	      "memberLoginTime": 1449023170000,
	      "memberOldLoginIp": "60.173.247.22",
	      "memberOldLoginTime": 1449022383000,
	      "memberPwd": null,
	      "memberRegion": 0,
	      "memberSex": 1,
	      "memberState": 1,
	      "memberTime": 1449021999000,
	      "memberTruename": "adab",
	      "memberPhone": "15209874296",
	      "openId": "o0rfbjkdwBvthuMV_9o_s5uccs7o",
	      "unionId": null,
	      "updDate": 1449023170000,
	      "wechatAliasname": "蓝波",
	      "wechatNo": null,
	      "wechatMemberAddrs": [
	        {
	          "memberAddrId": 1,
	          "contactsAddress": "安徽省 合肥市",
	          "contactsName": null,
	          "contactsPhone": "15209874296",
	          "insDate": 1449726788000,
	          "memberId": 2,
	          "postCode": "0",
	          "regionCity": 0,
	          "regionCode": 0,
	          "regionProv": 0
	        },
	        {
	          "memberAddrId": 2,
	          "contactsAddress": "六安市",
	          "contactsName": null,
	          "contactsPhone": "13122072859",
	          "insDate": 1450763593000,
	          "memberId": 2,
	          "postCode": "0",
	          "regionCity": 0,
	          "regionCode": 0,
	          "regionProv": 0
	        }
	      ]
	    }
	  ],
	  "last": true,
	  "totalPages": 1,
	  "totalElements": 1,
	  "size": 10,
	  "number": 0,
	  "numberOfElements": 1,
	  "sort": [
	    {
	      "direction": "DESC",
	      "property": "memberId",
	      "ignoreCase": false,
	      "nullHandling": "NATIVE",
	      "ascending": false
	    }
	  ],
	  "first": true
	}

####失败示例

---

##3.2 会员详情API
####功能
>会员详情接口

####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/vips/{id}

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token


####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| id     | integer |   是     |会员ID

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:


####返回示例
	{
	  "memberId": 2,
	  "insDate": 1449021999000,
	  "memberAvatar": "http://wx.qlogo.cn/mmopen/fP5icNZibkZbFYc4O7YVjPEqgNWZOtJGnJVsjxyTIgdN2LmbNicXjZrxUDQdIMEEyAvIjHFck39vUwYNOkicaYfguhdTSlzJ2Gqv/0",
	  "memberEmail": null,
	  "memberLoginIp": "60.173.247.22",
	  "memberLoginNum": 2,
	  "memberLoginTime": 1449023170000,
	  "memberNo": null,
	  "memberOldLoginIp": "60.173.247.22",
	  "memberOldLoginTime": 1449022383000,
	  "memberPwd": null,
	  "memberRegion": 0,
	  "memberSex": 1,
	  "memberState": 1,
	  "memberTime": 1449021999000,
	  "memberTruename": "adab",
	  "menberPhone": "15209874296",
	  "openId": "o0rfbjkdwBvthuMV_9o_s5uccs7o",
	  "unionId": null,
	  "updDate": 1449023170000,
	  "wechatAliasname": "蓝波",
	  "wechatNo": null,
	  "stores": [
	    {
	      "storeId": 1,
	      "appId": null,
	      "appSecret": null,
	      "bankAccName": null,
	      "bankAccNumber": null,
	      "bankName": null,
	      "businessLicence": null,
	      "commisRates": 2.5,
	      "companyAddress": null,
	      "companyFax": null,
	      "companyName": "哈哈",
	      "companyPostcode": null,
	      "companyRegion": "340101",
	      "content": "[{\"type\": \"tpl-config\",\"title\": \"32113212\",\"background\": \"#f9f9f9\"},{\"type\": \"tpl-shop\",\"shopName\": \"默认店铺名称\",\"logo\": \"img/profile.png\",\"backgroundColor\": \"#CDCDCD\"},{\"type\": \"tpl-slider\",\"items\": []},{\"type\": \"tpl-title\",\"title\": \"新品上架\",\"subtitle\": \"新品上架的描述\",\"textAlign\": \"left\",\"backgroundColor\": \"#ffffff\"},{\"type\": \"tpl-goods\",\"displayNum\": 6,\"displayType\": {\"name\": \"normal_list\",\"parmas\": {\"showTitle\": true,\"showDesc\": true,\"showPrice\": true}}}]",
	      "createTime": 1448883935000,
	      "insDate": 1448883935000,
	      "joininMessage": null,
	      "joininState": "40",
	      "organizationCode": null,
	      "ownerCardBack": null,
	      "ownerCardFront": "G01/M00/00/00/CgA8BFZVksaAV88rAABEnBeGtN8264.jpg",
	      "regionAreaName": "市区",
	      "regionCity": "340100",
	      "regionCityName": "合肥市",
	      "regionProv": "340000",
	      "regionProvName": "安徽省",
	      "sgId": 1,
	      "storeAliasName": "蓝波母婴",
	      "storeImage": "G01/M00/00/00/CgA8BFZVksaAV88rAABEnBeGtN8264.jpg",
	      "storeNo": 100001,
	      "storeOwner": "蓝波",
	      "storeOwnerCard": "340222198810154855",
	      "storeState": 1,
	      "taxRegCert": null,
	      "updDate": 1449034339000,
	      "userPhone": "18009691019",
	      "wecharEntId": null,
	      "wechatEntName": null,
	      "wechatId": null,
	      "wechatToken": null,
	      "wechatType": 1,
	      "wechatUrl": null
	    }
	  ],
	  "wechatMemberAddr": null
	}

####失败示例

---

4. 订单管理API
===
---
##4.1 订单管理API
####功能
>订单管理接口

####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/orders

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| page     | Integer |   否     |页数
| pageSize     | Integer |   否     |页面大小
| status     | Integer |   否     |订单状态
| startTime     | String |   否     |开始时间 格式:2015-12-10
| endTime     | String |   否     |结束时间 格式:2015-12-10
| orderId     | Integer |   否     |订单号
| memName     | String |   否     |查询条件
| companyName     | String |   否     |查询条件


####返回示例
	{
	  "content": [
	    {
	      "orderId": 1000001,
	      "addTime": 1449389582000,
	      "commisAmount": 2,
	      "commisRates": 1,
	      "companyName": "妈咪爱母婴店",
	      "contactsAddress": "环山路",
	      "contactsName": "蓝波",
	      "contactsPhone": "18880999999",
	      "finishTime": null,
	      "gevalType": 1,
	      "goodsAmount": 200,
	      "insDate": 1449389842000,
	      "memberAddrId": 1,
	      "memberId": 2,
	      "memberTruename": "蓝波",
	      "menberPhone": "18009691019",
	      "orderAmount": 200,
	      "orderStatus": 10,
	      "orderType": 1,
	      "payCode": 3,
	      "payId": 1000001,
	      "paySn": null,
	      "payTime": 1449391838000,
	      "postCode": "241000",
	      "regionAreaName": "蜀山区",
	      "regionCity": 340100,
	      "regionCityName": "合肥市",
	      "regionCode": 340104,
	      "regionProv": 340000,
	      "regionProvName": "安徽省",
	      "remark": null,
	      "storeAmount": 198,
	      "storeId": 1,
	      "updDate": 1449536377000,
	      "visitTime": null
	    }
	  ],
	  "last": true,
	  "totalPages": 1,
	  "totalElements": 1,
	  "size": 10,
	  "number": 0,
	  "sort": [
	    {
	      "direction": "DESC",
	      "property": "orderId",
	      "ignoreCase": false,
	      "nullHandling": "NATIVE",
	      "ascending": false
	    }
	  ],
	  "first": true,
	  "numberOfElements": 1
	}
---

##4.2 订单详情API
####功能
>订单详情接口

####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/order/{id}

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| id     | Integer |   是     |订单ID



####返回示例
	{
	  "orderId": 1000001,
	  "addTime": 1449389582000,
	  "commisAmount": 2,
	  "commisRates": 1,
	  "companyName": "妈咪爱母婴店",
	  "contactsAddress": "环山路",
	  "contactsName": "蓝波",
	  "contactsPhone": "18880999999",
	  "finishTime": null,
	  "gevalType": 1,
	  "goodsAmount": 200,
	  "insDate": 1449389842000,
	  "memberAddrId": 1,
	  "memberId": 2,
	  "memberTruename": "蓝波",
	  "menberPhone": "18009691019",
	  "orderAmount": 200,
	  "orderStatus": 10,
	  "orderType": 1,
	  "payCode": 3,
	  "payId": 1000001,
	  "paySn": null,
	  "payTime": 1449391838000,
	  "postCode": "241000",
	  "regionAreaName": "蜀山区",
	  "regionCity": 340100,
	  "regionCityName": "合肥市",
	  "regionCode": 340104,
	  "regionProv": 340000,
	  "regionProvName": "安徽省",
	  "remark": null,
	  "storeAmount": 198,
	  "storeId": 1,
	  "updDate": 1449536377000,
	  "visitTime": null,
	  "orderGoods": [
	    {
	      "orderGoodsId": 1,
	      "commisRate": 0,
	      "goodsId": 1,
	      "goodsImage": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	      "goodsName": "雀巢妈妈孕产妇营养配方奶粉900g",
	      "goodsNum": 1,
	      "goodsPayPrice": 152,
	      "goodsPrice": 152,
	      "goodsSpec": "6*900g",
	      "goodsType": 1,
	      "memberId": 2,
	      "orderId": 1000001,
	      "orderType": 1,
	      "promotionsId": 0,
	      "storeId": 1
	    }
	  ]
	}
---

5. 店铺管理API
===
---
##5.1 更新店铺模板信息API
####功能
>更新店铺模板信息接口

####HTTP请求方式
>PUT

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/store/{store_id}

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| store_id     | Integer |   是     |店铺ID

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| content     | String |   否     |店铺模板
| storeName     | String |   否     |店铺名称

####返回示例
	{
	  "storeId": 3,
	  "appId": null,
	  "appSecret": null,
	  "bankAccName": "aaa",
	  "bankAccNumber": "12312313",
	  "bankName": "",
	  "businessLicence": "adfadf",
	  "commisRates": null,
	  "companyAddress": "测试门店",
	  "companyFax": null,
	  "companyName": "测试门店",
	  "companyPostcode": null,
	  "companyRegion": "110101",
	  "content": "aaaaaa",
	  "createTime": 1449489911000,
	  "insDate": 1449489911000,
	  "joininMessage": null,
	  "joininState": "10",
	  "organizationCode": "abasd",
	  "ownerCardBack": "",
	  "ownerCardFront": "asdfadf",
	  "regionAreaName": "东城区",
	  "regionCity": 110101,
	  "regionCityName": "东城区",
	  "regionProv": 110000,
	  "regionProvName": "北京市",
	  "sgId": 0,
	  "storeAliasName": null,
	  "storeImage": "asdfsd",
	  "storeOwner": "alex",
	  "storeOwnerCard": "123123123123",
	  "storeState": 2,
	  "taxRegCert": "asdfasdf",
	  "updDate": 1449565333472,
	  "userPhone": "12345678912",
	  "wecharEntId": null,
	  "wechatEntName": null,
	  "wechatId": null,
	  "wechatToken": null,
	  "wechatType": 0,
	  "wechatUrl": null,
	  "wechatMembers": []
	}
---

##5.2 获取店铺信息API
####功能
>获取店铺信息接口

####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/store/{store_id}

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| store_id     | Integer |   是     |店铺ID

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:

####返回示例
	{
	  "storeId": 3,
	  "appId": null,
	  "appSecret": null,
	  "bankAccName": "aaa",
	  "bankAccNumber": "12312313",
	  "bankName": "",
	  "businessLicence": "adfadf",
	  "commisRates": null,
	  "companyAddress": "测试门店",
	  "companyFax": null,
	  "companyName": "测试门店",
	  "companyPostcode": null,
	  "companyRegion": "110101",
	  "content": "aaaaaa",
	  "createTime": 1449489911000,
	  "insDate": 1449489911000,
	  "joininMessage": null,
	  "joininState": "10",
	  "organizationCode": "abasd",
	  "ownerCardBack": "",
	  "ownerCardFront": "asdfadf",
	  "regionAreaName": "东城区",
	  "regionCity": 110101,
	  "regionCityName": "东城区",
	  "regionProv": 110000,
	  "regionProvName": "北京市",
	  "sgId": 0,
	  "storeAliasName": null,
	  "storeImage": "asdfsd",
	  "storeOwner": "alex",
	  "storeOwnerCard": "123123123123",
	  "storeState": 2,
	  "taxRegCert": "asdfasdf",
	  "updDate": 1449565333472,
	  "userPhone": "12345678912",
	  "wecharEntId": null,
	  "wechatEntName": null,
	  "wechatId": null,
	  "wechatToken": null,
	  "wechatType": 0,
	  "wechatUrl": null,
	  "wechatMembers": []
	}
---

6. 财务管理API
===
---
##6.1 母婴店财务信息API
####功能
>母婴店财务信息接口

####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/pay

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:


####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:


####返回示例
	{
	  "id": 1,
	  "accBal": 9900,
	  "accIncome": 10000,
	  "accNo": 3,
	  "accPay": 1000,
	  "updDate": null
	}
---

##6.2 历史提款列表API
####功能
>历史提款列表接口

####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/pay/list

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:

####返回示例
	[
	  {
	    "cashNo": 1,
	    "accSurplus": null,
	    "applyMoney": null,
	    "applyTime": 1449563160000,
	    "applyType": 1,
	    "applyUserId": 0,
	    "applyUserName": null,
	    "bankAccName": "aaa",
	    "bankAccNumber": "12312313",
	    "bankName": "",
	    "companyName": "测试门店",
	    "confirmStat": 0,
	    "confirmTime": null,
	    "confirmUserId": 0,
	    "confirmUserName": null,
	    "insDate": 1449563160000,
	    "payingCertificate": null,
	    "payingTime": null,
	    "payingUserName": null,
	    "payingUserNo": 0,
	    "remark": null,
	    "storeId": 3,
	    "updDate": 1449563160000
	  }
	]
---

##6.3 收款详情API
####功能
>收款详情接口

####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/pay/{cashNo}

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| cashNo     | Integer |   是     |申请编号

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:


####返回示例
	
	{
	  "cashNo": 1,
	  "accSurplus": null,
	  "applyMoney": null,
	  "applyTime": 1449563160000,
	  "applyType": 1,
	  "applyUserId": 0,
	  "applyUserName": null,
	  "bankAccName": "aaa",
	  "bankAccNumber": "12312313",
	  "bankName": "",
	  "companyName": "测试门店",
	  "confirmStat": 0,
	  "confirmTime": null,
	  "confirmUserId": 0,
	  "confirmUserName": null,
	  "insDate": 1449563160000,
	  "payingCertificate": null,
	  "payingTime": null,
	  "payingUserName": null,
	  "payingUserNo": 0,
	  "remark": null,
	  "storeId": 3,
	  "updDate": 1449563160000
	}
---

##6.4 申请提款API
####功能
>申请提款接口

####HTTP请求方式
>POST

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/pay

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:


####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| applyMoney     | Integer |   是     |提款金额

####返回示例
	{
	  "msg": "成功",
	  "code": 1
	}
---

7. 我的服务API
===
---
##7.1 获取服务信息API
####功能
>获取服务信息接口

####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/service

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:

####返回示例
	[
	  {
	    "id": 2,
	    "companyName": "妈咪爱母婴店",
	    "finishNum": 0,
	    "insDate": 1449569770000,
	    "orderNum": 0,
	    "serviceId": 1,
	    "serviceState": 1,
	    "storeId": 1,
	    "updDate": 1449569770000,
	    "serviceInfo": null
	  }
	]
---

##7.2  上/下架某个服务API
####功能
> 上/下架某个服务接口

####HTTP请求方式
>PUT

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/service/{id}/{serviceStatus}

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| serviceStatus     | Integer |   是     |0为下架，1为上架
| id     | Integer |   是     |服务ID

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:

####返回示例
	{
	  "id": 2,
	  "companyName": "妈咪爱母婴店",
	  "finishNum": 0,
	  "insDate": 1449569770000,
	  "orderNum": 0,
	  "serviceId": 1,
	  "serviceState": 0,
	  "storeId": 1,
	  "updDate": 1449569770000,
	  "serviceInfo": null
	}
---



8. 微信API
===
---
##8.1  微信绑定API
####功能
> 微信绑定接口

####HTTP请求方式
>PUT

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/wx/set

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| wecharEntId     | Integer |   是     |公众号原始ID
| wechatEntName     | Integer |   是     |公众号名称
| wechatId     | Integer |   是     |微信号
| appId     | Integer |   是     |AppID
| appSecret     | Integer |   是     |AppSecret

####返回示例
	{
	  "wecharEntId": "aaa",
	  "wechatEntName": "bbb",
	  "wechatId": "333",
	  "wechatToken": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhcHBJZCI6IjExMTEiLCJ0aW1lIjoxNDQ5NzM4ODU4MDY0fQ.jqd_kkbtcWh8S-rfSuPn8snLe_3qmbvPw-ZwsRUXObw",
	  "wechatUrl": "/zwhs_byd_api/wx/core/3",
	  "appId": "1111",
	  "appSecret": "12312"
	}
---


##8.2  获取门店微信账号信息API
####功能
> 获取门店微信账号信息接口

####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/wx/get

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:

####返回示例
	{
	  "wecharEntId": "aaa",
	  "wechatEntName": "bbb",
	  "wechatId": "333",
	  "wechatToken": "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJhcHBJZCI6IjExMTEiLCJ0aW1lIjoxNDQ5NzM4ODU4MDY0fQ.jqd_kkbtcWh8S-rfSuPn8snLe_3qmbvPw-ZwsRUXObw",
	  "wechatUrl": "/zwhs_byd_api/wx/core/3",
	  "appId": "1111",
	  "appSecret": "12312"
	}
---

##8.3  获取门店关键字列表API
####功能
> 获取门店关键字列表接口

####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/wx/key

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| searchValue     | string |   否     |查询条件
####返回示例
	{
	  "content" : [ {
	    "keyId" : 28,
	    "insDate" : 1450320877000,
	    "keywordSearch" : 1,
	    "replyConType" : 2,
	    "replyKeyword" : "123123",
	    "replyText" : "dasdasdascasdxczxczx111111",
	    "replyType" : 2,
	    "storeId" : 7,
	    "updDate" : 1450669438000,
	    "materialWarehouses" : [ {
	      "id" : 15,
	      "articleAuthor" : "Robbins",
	      "articleClassId" : 0,
	      "articleClassName" : null,
	      "articleComments" : "<p>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: rgb(192, 80, 77);\"><strong
	>2016年春运将从1月24日启动，持续到3月3日。选择乘坐飞机出行的旅客需要留意，在合肥东航执飞航线中，根据目前销售订座情况显示，春节前，合肥前往昆明、广州、成都、重庆等地的航班最为热门。</strong
	></span></p><p>&nbsp;</p><p style=\"margin-top: 15px;\">&nbsp;&nbsp;&nbsp;<span style=\"text-decoration
	: line-through;\">&nbsp;<span style=\"text-decoration: line-through; color: rgb(250, 192, 143);\">针对
	客流方向密集的广州、成都、重庆、昆明等地，东航安徽分公司计划增开</span>加班包机200余架次，并计划开通合肥至新加坡、合肥至泰国清迈等国际包机，满足安徽地区春运旅游出行需求。（马洁 王翔 徐颖奇
	）</span></p><p><br/></p><p><img src=\"http://fileproxy.syisy.com/G01/M02/00/04/CgA8BFZ2U3OADtDAAABfYNGLO0w422
	,640x320.jpg\"/></p>",
	      "articleTitle" : "2016年春运将从1月24日启动 昆明广州成都重庆最为热门",
	      "coverPic" : "G01/M00/00/04/CgA8BFZ2SNKAJfvJAAOyhYzf57c055.jpg",
	      "insDate" : 1450592598000,
	      "materialDesc" : null,
	      "materialType" : 1,
	      "storeId" : 1000001,
	      "thumbnailPic" : "G01/M00/00/04/CgA8BFZ2SNKAJfvJAAOyhYzf57c055.jpg",
	      "updDate" : 1450595250000
	    }, {
	      "id" : 16,
	      "articleAuthor" : "Robbins Yao",
	      "articleClassId" : 0,
	      "articleClassName" : null,
	      "articleComments" : "<p><br/></p><p><br/></p><p>&nbsp;&nbsp;&nbsp;&nbsp;今天上午8点，<a target=\"_blank
	\" href=\"http://www.hefei.cc/\">合肥</a>市聘任制公务员报名正式启动。符合条件的报考人员准备好相关材料，以电子邮件方式发送到招聘机关。&nbsp;</p><p>&nbsp
	;&nbsp;&nbsp;&nbsp;据介绍，此次公开招聘分为报名、资格审查、考试测评、考察和体检、公示和审批、办理聘任等环节。报名时间为今天8:00至12月31日17：30，报考人员应准备本人身份证
	或护照、学历和学位证、职（执）业资格证、专业技术资格证等相关证明材料。</p><p>&nbsp;&nbsp;&nbsp;&nbsp;考试测评根据报名人数采取相应的考试方式。资格审查通过人数与招聘职位计
	划等于或超过5:1比例的职位，采取公开招聘的方式进行；不足5:1比例的，采取直接选聘的方式进行。其中，公开招聘分为笔试、面试、综合评价3个环节，直接选聘分为面试和综合评价2个环节。</p><p><br
	/></p><p>&nbsp;&nbsp;&nbsp;&nbsp;根据考试测评总成绩、考察和体检情况，聘任机关党委(党组)讨论提出拟聘任人员，对拟聘任人员，分别在合肥先锋网、合肥市人力资源和社会保障网
	、合肥市公务员局网和招聘机关官方网站进行公示。公示期间，反映有严重问题并查有实据的，取消聘任资格。公示期满后，没有问题或者反映问题不影响聘任的，报市公务员主管部门审批，并报省公务员主管部门备案。（黄颖
	 记者 许超众）</p><p><br/></p><p><img src=\"http://fileproxy.syisy.com/G01/M00/00/04/CgA8BFZ2Se2ATSVzAACFh4_K3jE304
	,640x320.jpg\"/></p><p><img src=\"http://fileproxy.syisy.com/G01/M01/00/04/CgA8BFZ2SfqASCAmAABrMCqAb34211
	,640x320.jpg\"/></p><p><img src=\"http://fileproxy.syisy.com/G01/M02/00/04/CgA8BFZ2Sk-AB2YcAAC6o_dcavY343
	,640x320.jpg\"/></p>",
	      "articleTitle" : "合肥聘任制公务员18日开始报名 12月31日17：30截止",
	      "coverPic" : "G01/M01/00/04/CgA8BFZ2SZyAMuNUAABfYNGLO0w915.jpg",
	      "insDate" : 1450592800000,
	      "materialDesc" : null,
	      "materialType" : 1,
	      "storeId" : 1000001,
	      "thumbnailPic" : "G01/M01/00/04/CgA8BFZ2SZyAMuNUAABfYNGLO0w915.jpg",
	      "updDate" : 1450592873000
	    } ]
	  }, {
	    "keyId" : 38,
	    "insDate" : 1450665605000,
	    "keywordSearch" : 1,
	    "replyConType" : 2,
	    "replyKeyword" : "d1212e",
	    "replyText" : "asdasd",
	    "replyType" : 2,
	    "storeId" : 7,
	    "updDate" : 1450665605000,
	    "materialWarehouses" : [ {
	      "id" : 15,
	      "articleAuthor" : "Robbins",
	      "articleClassId" : 0,
	      "articleClassName" : null,
	      "articleComments" : "<p>&nbsp;&nbsp;&nbsp;&nbsp;<span style=\"color: rgb(192, 80, 77);\"><strong
	>2016年春运将从1月24日启动，持续到3月3日。选择乘坐飞机出行的旅客需要留意，在合肥东航执飞航线中，根据目前销售订座情况显示，春节前，合肥前往昆明、广州、成都、重庆等地的航班最为热门。</strong
	></span></p><p>&nbsp;</p><p style=\"margin-top: 15px;\">&nbsp;&nbsp;&nbsp;<span style=\"text-decoration
	: line-through;\">&nbsp;<span style=\"text-decoration: line-through; color: rgb(250, 192, 143);\">针对
	客流方向密集的广州、成都、重庆、昆明等地，东航安徽分公司计划增开</span>加班包机200余架次，并计划开通合肥至新加坡、合肥至泰国清迈等国际包机，满足安徽地区春运旅游出行需求。（马洁 王翔 徐颖奇
	）</span></p><p><br/></p><p><img src=\"http://fileproxy.syisy.com/G01/M02/00/04/CgA8BFZ2U3OADtDAAABfYNGLO0w422
	,640x320.jpg\"/></p>",
	      "articleTitle" : "2016年春运将从1月24日启动 昆明广州成都重庆最为热门",
	      "coverPic" : "G01/M00/00/04/CgA8BFZ2SNKAJfvJAAOyhYzf57c055.jpg",
	      "insDate" : 1450592598000,
	      "materialDesc" : null,
	      "materialType" : 1,
	      "storeId" : 1000001,
	      "thumbnailPic" : "G01/M00/00/04/CgA8BFZ2SNKAJfvJAAOyhYzf57c055.jpg",
	      "updDate" : 1450595250000
	    } ]
	  }, {
	    "keyId" : 37,
	    "insDate" : 1450665541000,
	    "keywordSearch" : 1,
	    "replyConType" : 1,
	    "replyKeyword" : "asdasd",
	    "replyText" : "asdasdasd",
	    "replyType" : 2,
	    "storeId" : 7,
	    "updDate" : 1450665541000,
	    "materialWarehouses" : [ ]
	  } ],
	  "totalElements" : 3,
	  "totalPages" : 1,
	  "last" : true,
	  "numberOfElements" : 3,
	  "sort" : [ {
	    "direction" : "DESC",
	    "property" : "updDate",
	    "ignoreCase" : false,
	    "nullHandling" : "NATIVE",
	    "ascending" : false
	  } ],
	  "first" : true,
	  "size" : 10,
	  "number" : 0
	}
---

##8.4  获取关键字的图文列表API
####功能
> 获取关键字的图文列表接口

####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/wx/key/material/{keyId}

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| keyId     | Integer |   是     |关键字ID

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:

####返回示例
	[
	  {
	    "id": 6,
	    "articleClassId": 0,
	    "articleClassName": null,
	    "articleComments": "内容测试6",
	    "articleTitle": "标题测试6",
	    "coverPic": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	    "insDate": 1449642788000,
	    "materialType": 1,
	    "storeId": 3,
	    "thumbnailPic": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	    "updDate": 1449642788000
	  },
	  {
	    "id": 7,
	    "articleClassId": 0,
	    "articleClassName": null,
	    "articleComments": "内容测试7",
	    "articleTitle": "标题测试7",
	    "coverPic": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	    "insDate": 1449642793000,
	    "materialType": 1,
	    "storeId": 3,
	    "thumbnailPic": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	    "updDate": 1449642793000
	  }
	]
---

##8.5 添加关键字API
####功能
> 添加关键字接口

####HTTP请求方式
>POST

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/wx/key

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | String |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:


####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| replyKeyword     | String |   是     |关键字
| replyText     | String |   否     |文本回复内容，默认为空
| replyConType     | Integer |   是     |1为文本，2为图文
| mids     | Integer |   否     |图文ID列表

####请求参数示例:
	{"replyKeyword":"aa","storeId":"1","replyConType":"2","mids":[{"mid":"1"},{"mid":"2"}]}
	{"replyKeyword":"bb","storeId":"1","replyConType":"1","replyText":"fuck lanbo"}
####返回示例
	{
	  "keyId": 6,
	  "insDate": 1449744248674,
	  "keywordSearch": 1,
	  "replyConType": 2,
	  "replyKeyword": "aa",
	  "replyText": "",
	  "replyType": 2,
	  "storeId": 1,
	  "updDate": 1449744248674,
	  "materialWarehouses": [
	    {
	      "id": 2,
	      "articleClassId": 0,
	      "articleClassName": null,
	      "articleComments": "内容测试2",
	      "articleTitle": "标题测试2",
	      "coverPic": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	      "insDate": 1449642660000,
	      "materialType": 1,
	      "storeId": 3,
	      "thumbnailPic": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	      "updDate": 1449642660000
	    }
	  ]
	}
---

##8.6 更新关键字回复信息API
####功能
> 更新关键字回复信息接口

####HTTP请求方式
>PUT

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/wx/key

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | String |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:


####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| replyText     | String |   否     |文本回复内容，默认为空
| replyConType     | Integer |   是     |1为文本，2为图文
| keyId     | Integer |   是     |关键字ID
| mids     | Integer |   否     |图文ID列表

####请求参数示例:
	{"keyId":"6","replyConType":"2","mids":[{"mid":"6"},{"mid":"7"}]}
####返回示例
	{
	  "keyId": 6,
	  "insDate": 1449744249000,
	  "keywordSearch": 1,
	  "replyConType": 2,
	  "replyKeyword": "aa",
	  "replyText": "",
	  "replyType": 2,
	  "storeId": 1,
	  "updDate": 1449744495910,
	  "materialWarehouses": [
	    {
	      "id": 7,
	      "articleClassId": 0,
	      "articleClassName": null,
	      "articleComments": "内容测试7",
	      "articleTitle": "标题测试7",
	      "coverPic": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	      "insDate": 1449642793000,
	      "materialType": 1,
	      "storeId": 3,
	      "thumbnailPic": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	      "updDate": 1449642793000
	    },
	    {
	      "id": 6,
	      "articleClassId": 0,
	      "articleClassName": null,
	      "articleComments": "内容测试6",
	      "articleTitle": "标题测试6",
	      "coverPic": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	      "insDate": 1449642788000,
	      "materialType": 1,
	      "storeId": 3,
	      "thumbnailPic": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	      "updDate": 1449642788000
	    }
	  ]
	}
---
##8.7 删除关键字API
####功能
> 删除关键字接口

####HTTP请求方式
>DELETE

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/wx/key/{keyId}

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | String |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| keyId     | Integer |   是     |关键字ID

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:


####返回示例
	{
	  "msg": "成功",
	  "code": 1
	}
---


##8.8 获取门店关注时和答不上来关键字API
####功能
> 获取门店关注时和答不上来关键字接口

####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/wx/key/{replyType}

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | String |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:


####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| replyType     | Integer |   是     |1 关注时回复内容; 2 关键字回复内容;3 答不上来回复

####返回示例
	
---


##8.9 添加门店微信菜单API
####功能
> 添加门店微信菜单接口

####HTTP请求方式
>POST

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/wx/menu

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | String |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:


####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| content     | String |   是     |菜单内容

####返回示例
	{
	  "id": 1,
	  "content": "aabbcc",
	  "insDate": 1449746282237,
	  "menuId": 0,
	  "menuLevel": 0,
	  "menuName": null,
	  "menuOrder": 0,
	  "menuUrl": null,
	  "parMenuId": 0,
	  "storeId": 1,
	  "updDate": 1449746282237
	}
---


##8.10 更新门店微信菜单PI
####功能
> 更新门店微信菜单接口

####HTTP请求方式
>PUT

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/wx/menu

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | String |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:


####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| content     | String |   是     |菜单内容

####返回示例
	{
	  "id": 1,
	  "content": "lanbo111",
	  "insDate": 1449746282237,
	  "menuId": 0,
	  "menuLevel": 0,
	  "menuName": null,
	  "menuOrder": 0,
	  "menuUrl": null,
	  "parMenuId": 0,
	  "storeId": 1,
	  "updDate": 1449746282237
	}
---


##8.11 查询门店微信菜单API
####功能
> 查询门店微信菜单接口

####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/wx/menu

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | String |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:


####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:


####返回示例
	{
	  "id": 1,
	  "content": "lanbo111",
	  "insDate": 1449746282000,
	  "menuId": 0,
	  "menuLevel": 0,
	  "menuName": null,
	  "menuOrder": 0,
	  "menuUrl": null,
	  "parMenuId": 0,
	  "storeId": 1,
	  "updDate": 1449746282000
	}
---

##8.12 获取某个关键字信息API
####功能
> 获取某个关键字信息接口

####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/wx/get/{keyId}

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | String |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| keyId     | Integer |   是     |关键字Id

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:


####返回示例
	{
	  "keyId": 7,
	  "insDate": 1449823730000,
	  "keywordSearch": 1,
	  "replyConType": 2,
	  "replyKeyword": "aa",
	  "replyText": "",
	  "replyType": 2,
	  "storeId": 3,
	  "updDate": 1449823730000,
	  "materialWarehouses": [
	    {
	      "id": 2,
	      "articleClassId": 0,
	      "articleClassName": null,
	      "articleComments": "内容测试2",
	      "articleTitle": "标题测试2",
	      "coverPic": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	      "insDate": 1449642660000,
	      "materialType": 1,
	      "storeId": 3,
	      "thumbnailPic": "G01/M02/00/00/CgA8BFZWs-KAXpsOAAFT2IvU_WQ962.jpg",
	      "updDate": 1449642660000
	    }
	  ]
	}
---

9. 首页API
===
---
##9.1  首页图表API
####功能
> 首页图表接口

####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/chart

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:

####返回示例
	{
	  "xAxis": {
	    "name": "x",
	    "type": "category",
	    "data": [
	      "2015-12-14",
	      "2015-12-13",
	      "2015-12-12",
	      "2015-12-11",
	      "2015-12-10",
	      "2015-12-09",
	      "2015-12-08"
	    ]
	  },
	  "series": [
	    {
	      "name": "订单数",
	      "type": "line",
	      "data": [
	        0,
	        1,
	        9,
	        0,
	        0,
	        0,
	        0
	      ]
	    },
	    {
	      "name": "交易额",
	      "type": "line",
	      "data": [
	        0,
	        200,
	        1800,
	        0,
	        0,
	        0,
	        0
	      ]
	    }
	  ]
	}
---

##9.2  首页数据API
####功能
> 首页数据接口

####HTTP请求方式
>GET

####HTTP URL
>http://192.168.109.111：8080/zwhs_byd/firstPage

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:

####返回示例
	{
	  "accBal": 0,  //可提现金额
	  "totaMember": 0, //会员人数
	  "totalOrder": 15, //今日订单数
	  "totalAmount": 3000, //今日交易额
	  "companyAddress": "草泥马大街"
	}
---


10. 门店图片API
===
---
##10.1  获取门店图片列表API
####功能
> 获取门店图片列表API接口

####HTTP请求方式
>GET

####HTTP URL
>http://o2ostore.syisy.com/zwhs_byd_api/image

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| page     | Integer |   否     |页码，默认为1
| pageSize     | Integer |   否     |页面大小，默认为10

####返回示例
	{
	  "content": [
	    {
	      "id": 4,
	      "insDate": 1450848055000,
	      "material": "G01/M02/00/02/CgA8BFZxLteAGkzoAACIpnctht4535.png",
	      "storeId": 7,
	      "updDate": 1450848055000
	    },
	    {
	      "id": 3,
	      "insDate": 1450848045000,
	      "material": "G01/M00/00/02/CgA8BFZxLt-Aca8BAACugh-o5AQ590.png",
	      "storeId": 7,
	      "updDate": 1450848045000
	    },
	    {
	      "id": 2,
	      "insDate": 1450848031000,
	      "material": "G01/M01/00/02/CgA8BFZxLuyASWlkAACugh-o5AQ511.png",
	      "storeId": 7,
	      "updDate": 1450848031000
	    },
	    {
	      "id": 1,
	      "insDate": 1450848011000,
	      "material": "G01/M02/00/02/CgA8BFZxLvqAIQRyAAfxJDU0lPw981.png",
	      "storeId": 7,
	      "updDate": 1450848011000
	    }
	  ],
	  "last": true,
	  "totalPages": 1,
	  "totalElements": 4,
	  "size": 10,
	  "number": 0,
	  "first": true,
	  "sort": [
	    {
	      "direction": "DESC",
	      "property": "updDate",
	      "ignoreCase": false,
	      "nullHandling": "NATIVE",
	      "ascending": false
	    }
	  ],
	  "numberOfElements": 4
	}
---

##10.2 添加门店图片API
####功能
> 添加门店图片接口

####HTTP请求方式
>POST

####HTTP URL
>http://o2ostore.syisy.com/zwhs_byd_api/image

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| image     | string |   是     |图片FileID

####返回示例
	{
		      "id": 1,
		      "insDate": 1450848011000,
		      "material": "G01/M02/00/02/CgA8BFZxLvqAIQRyAAfxJDU0lPw981.png",
		      "storeId": 7,
		      "updDate": 1450848011000
	}
---

11. 门店优惠劵API
===
---
##11.1  获取门店优惠劵列表API
####功能
> 获取门店优惠劵列表API接口

####HTTP请求方式
>GET

####HTTP URL
>http://o2ostore.syisy.com/zwhs_byd_api/coupon

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| page     | Integer |   否     |页码，默认为1
| pageSize     | Integer |   否     |页面大小，默认为10
| status     | Integer |   否     |优惠劵状态，默认为1，1为全部，2为未开始，3为正在进行中，4为已结束
| couponName     | String |   否     |优惠劵名称模糊查询

####返回示例
	{
	  "content": [
	    {
	      "couponId": 4,
	      "couponCondition": 200,
	      "couponLimit": 1,
	      "couponMoney": 50,
	      "couponName": "满200减50元",
	      "couponNumber": 999999,
	      "couponStatus": 10,
	      "couponSymbol": ">=",
	      "effectiveTime": 1452124800000,
	      "expirationTime": 1453075200000,
	      "insDate": 1453105114000,
	      "storeId": 1,
	      "updDate": 1453105114000
	    },
	    {
	      "couponId": 3,
	      "couponCondition": 1000,
	      "couponLimit": 1,
	      "couponMoney": 500,
	      "couponName": "满1000减500元",
	      "couponNumber": 999999,
	      "couponStatus": 10,
	      "couponSymbol": ">=",
	      "effectiveTime": 1452124800000,
	      "expirationTime": 1452988800000,
	      "insDate": 1453105084000,
	      "storeId": 1,
	      "updDate": 1453105084000
	    }
	  ],
	  "last": true,
	  "totalPages": 1,
	  "totalElements": 2,
	  "size": 10,
	  "number": 0,
	  "first": true,
	  "sort": [
	    {
	      "direction": "DESC",
	      "property": "updDate",
	      "ignoreCase": false,
	      "nullHandling": "NATIVE",
	      "ascending": false
	    }
	  ],
	  "numberOfElements": 2
	}
---

##11.2  添加门店优惠劵API
####功能
> 添加门店优惠劵API接口

####HTTP请求方式
>POST

####HTTP URL
>http://o2ostore.syisy.com/zwhs_byd_api/coupon

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| couponCondition     | Integer |   是     |满多少减
| couponLimit     | Integer |   是     |每人限领数量
| couponMoney     | Integer |   是     |优惠劵额度值	
| couponName     | String |   是     |优惠劵名称
| couponNumber     | Integer |   是     |优惠劵数量
| effectiveTime     | String |   是     |生效时间，格式："2016-01-17"	
| expirationTime     | String |   是     |失效时间，格式："2016-01-17"	
| couponDesc     | String |   否     |用途描述	

####返回示例
	{
	  "couponId": 6,
	  "couponCondition": 30,
	  "couponLimit": 1,
	  "couponMoney": 10,
	  "couponName": "满30减10元",
	  "couponNumber": 999999,
	  "couponStatus": 10,
	  "couponSymbol": ">=",
	  "effectiveTime": 1453046400000,
	  "expirationTime": 1453305599000,
	  "insDate": 1453106630056,
	  "storeId": 1,
	  "updDate": 1453106630056
	}
---

##11.3  删除优惠劵API
####功能
> 删除优惠劵API接口

####HTTP请求方式
>DELETE

####HTTP URL
>http://o2ostore.syisy.com/zwhs_byd_api/coupon/{couponId}

####系统级输入参数（HTTPS）
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| token     | string |   是     |token

####路径参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:
| couponId     | Integer |   是     |优惠劵ID

####请求参数
| 参数名称 | 参数类型   |  是否必须  | 描述
| :----:   | :----:  | :----:  |:--------:

####返回示例
	{
	  "couponId": 6,
	  "couponCondition": 30,
	  "couponLimit": 1,
	  "couponMoney": 10,
	  "couponName": "满30减10元",
	  "couponNumber": 999999,
	  "couponStatus": 20,
	  "couponSymbol": ">=",
	  "effectiveTime": 1453046400000,
	  "expirationTime": 1453305599000,
	  "insDate": 1453106630056,
	  "storeId": 1,
	  "updDate": 1453106630056
	}
---