package com.store.web.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.show.api.ShowApiRequest;
import com.store.web.dao.CommodityDao;
import com.store.web.domain.Commodity;
import com.store.web.util.JSONUtil;



/**
 * 
 * @author xj Dao实现类
 */
public class CommodityDaoImpl implements CommodityDao {

	@Override
	public List<Commodity> getCommodities(String kw, String page) {
		String res=new ShowApiRequest("http://route.showapi.com/1615-1","87325","984ff5acb85e4bea9ab69a776f73ecc7")
				.addTextPara("keyWords",kw)
				.addTextPara("page",page)
				.addTextPara("mallId","")
			  .post();
		List<Commodity> commoditiesTemp = null;
		List<Commodity> commodities = new ArrayList<Commodity>();
		try {
			JSONObject json = new JSONObject(res);
			JSONObject jsonObject = (JSONObject) json.get("showapi_res_body");
			JSONArray array = jsonObject.getJSONArray("shopList");
			commoditiesTemp = JSONUtil.JSON2JDobj(array);
			for (int i = 0; i < 18; i++) {
				commodities.add(commoditiesTemp.get(i));
				
			}
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return commodities;
	}



}
