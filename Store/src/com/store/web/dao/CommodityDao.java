package com.store.web.dao;

import java.util.List;

import com.store.web.domain.Commodity;
/**
 * 
 * @author xj
 *Dao
 */
public interface CommodityDao {
   /**
    * 一页 最多60个商品
    * 根据关键字搜索商品
    * @param kw
    * @param page
    * @return List<Commodity>
    */
   List<Commodity> getCommodities(String kw, String page);
}
