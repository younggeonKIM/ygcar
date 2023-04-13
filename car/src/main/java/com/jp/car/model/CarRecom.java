package com.jp.car.model;

public class CarRecom {
	private String autoName;
	private String autoMaker; //製造業者
	private String origin; //国産車、外車
	
	private long price; //消費税込み (yen)
	private int overLength; //overall length 全長(m)
	private int overWidth; //overall width　全幅(m)
	private int overHeight; //overall height　全高(m)
	private int vehWeight; //vehicle weight 車両重量(kg)
	
	public String getAutoName() {
		return autoName;
	}
	public void setAutoName(String autoName) {
		this.autoName = autoName;
	}
	public String getAutoMaker() {
		return autoMaker;
	}
	public void setAutoMaker(String autoMaker) {
		this.autoMaker = autoMaker;
	}
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public int getOverLength() {
		return overLength;
	}
	public void setOverLength(int overLength) {
		this.overLength = overLength;
	}
	public int getOverWidth() {
		return overWidth;
	}
	public void setOverWidth(int overWidth) {
		this.overWidth = overWidth;
	}
	public int getOverHeight() {
		return overHeight;
	}
	public void setOverHeight(int overHeight) {
		this.overHeight = overHeight;
	}
	public int getVehWeight() {
		return vehWeight;
	}
	public void setVehWeight(int vehWeight) {
		this.vehWeight = vehWeight;
	}
	
	
	
}
