package com.store.web.bean;

import java.util.List;

import com.store.web.domain.Commodity;

public class Page {
	private List<Commodity> commodities;
	private int pageNum;
	private int startIndex;
	private int pageSize=18;
	
	private String url;
	
	public Page(int pageNum){
		this.pageNum = pageNum;
		startIndex = (pageNum-1)*pageSize;
	}
	
	public List<Commodity> getRecords() {
		return commodities;
	}
	public void setRecords(List<Commodity> records) {
		this.commodities = records;
	}
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	
}
