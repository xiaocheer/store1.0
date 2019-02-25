package com.store.web.util;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.store.web.domain.Commodity;


/**
 * 
 * @author xj
 * json的工具类
 *
 */
public class JSONUtil {
	/**
	 * 返回京东的Commodity
	 * @param array
	 * @return List<Commodity>
	 */
	public static List<Commodity> JSON2JDobj(JSONArray array){
		List<Commodity> list=new ArrayList<Commodity>();
		for (int i = 0; i < array.length(); i++) {
			try {
				JSONObject jsonObject = array.getJSONObject(i);
				Field[] fields = Commodity.class.getDeclaredFields();
				Commodity commodity = new Commodity();
				for (int j = 0; j < fields.length; j++) {
					Field field = commodity.getClass().getDeclaredField(fields[j].getName());
					field.setAccessible(true);
					field.set(commodity, array.getJSONObject(i).get(field.getName()));
				}
				list.add(commodity);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		return list;
	}

}
