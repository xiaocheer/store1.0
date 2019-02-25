package com.store.web.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.store.web.bean.Page;
import com.store.web.domain.Commodity;
import com.store.web.service.CommodityService;
@Controller
public class FirstController {
	@Autowired
   CommodityService service;
	/**
	 * 搜索
	 * @param kw
	 * @param page
	 * @param model
	 * @return String
	 */
	@RequestMapping(value = "/search.action", method = RequestMethod.POST)
	public String search(String kw, Model model) {
		Page page = service.searchByKw(kw,"1");
		//TODO commodities 记录最多可能有60个，需要进一步分页
		model.addAttribute("page", page);
		return "product";
	}
	@RequestMapping(value = "/go.action", method = RequestMethod.POST)
	public String go(String kw, int num, Model model) {
		Page page = service.searchByKw(kw,""+num);
		//TODO commodities 记录最多可能有60个，需要进一步分页
		model.addAttribute("page", page);
		return "product";
	}
}
/*
 */
