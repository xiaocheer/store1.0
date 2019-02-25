package com.store.web.domain;

import java.io.Serializable;

public class Commodity implements Serializable{
	

	private String shopImg;
	private String shopTitle;
	private String shopType;
	private String shopAddr;
	private String shopPrice;
	public String getShopImg() {
		return shopImg;
	}
	public void setShopImg(String shopImg) {
		this.shopImg = shopImg;
	}
	public String getShopTitle() {
		return shopTitle;
	}
	public void setShopTitle(String shopTitle) {
		this.shopTitle = shopTitle;
	}
	public String getShopType() {
		return shopType;
	}
	public void setShopType(String shopType) {
		this.shopType = shopType;
	}
	public String getShopAddr() {
		return shopAddr;
	}
	public void setShopAddr(String shopAddr) {
		this.shopAddr = shopAddr;
	}
	public String getShopPrice() {
		return shopPrice;
	}
	public void setShopPrice(String shopPrice) {
		this.shopPrice = shopPrice;
	}
	@Override
	public String toString() {
		return "Commodity [shopImg=" + shopImg + ", shopTitle=" + shopTitle + ", shopType=" + shopType + ", shopAddr="
				+ shopAddr + ", shopPrice=" + shopPrice + "]";
	}
	
}
