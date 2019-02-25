package com.store.web.service;

import java.util.List;

import com.store.web.bean.Page;
import com.store.web.domain.Commodity;

public interface CommodityService {
	/**
	 * 在搜索框中搜索商品名称，显示结果
	 * @param kw
	 * @param page
	 * @return Page
	 */
   Page searchByKw(String kw, String page);
}
