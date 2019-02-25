package com.store.test;


import org.json.JSONException;
import org.json.JSONObject;

import com.show.api.ShowApiRequest;
import com.store.web.dao.CommodityDao;
import com.store.web.dao.impl.CommodityDaoImpl;
/**
 * 
 * @author xj
 *娴嬭瘯绫�
 */
public class Test {
	public static void main(String[] args) throws JSONException {
		String res=new ShowApiRequest("http://route.showapi.com/1615-1","87325","984ff5acb85e4bea9ab69a776f73ecc7")
				.addTextPara("keyWords","蕾姆")
				.addTextPara("page","")
				.addTextPara("mallId","")
			  .post();
		JSONObject json = new JSONObject(res);
		JSONObject jsonObject = (JSONObject) json.get("showapi_res_body");
		JSONObject json2Object = (JSONObject) jsonObject.get("allSize");
		System.out.println(json2Object.toString());
	}
}
