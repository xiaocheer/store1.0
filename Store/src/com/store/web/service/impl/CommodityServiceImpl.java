package com.store.web.service.impl;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.store.web.bean.Page;
import com.store.web.dao.CommodityDao;
import com.store.web.dao.impl.CommodityDaoImpl;
import com.store.web.domain.Commodity;

import com.store.web.service.CommodityService;
/**
 * 
 * @author xj
 *
 */
@Service("commodityService")
@Transactional
public class CommodityServiceImpl implements CommodityService {
	CommodityDao dao = new CommodityDaoImpl();

	@Override
	public Page searchByKw(String kw, String page) {
		List<Commodity> commodities = dao.getCommodities(kw, page);
		Page records = new Page(Integer.parseInt(page));
		records.setRecords(commodities);
		return records;
	}
	
}
