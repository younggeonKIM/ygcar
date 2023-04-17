package com.jp.car.model;

public class CarRecom {
	private String autoName;
	private String autoMaker; //製造業者
	private String origin; //国産車、外車
	
	private long price; //消費税込み (yen)
	private double overLength; //overall length 全長(m)
	private double overWidth; //overall width　全幅(m)
	private double overHeight; //overall height　全高(m)
	
	private int totEmission; //総排気量 (cc)
	
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
	public double getOverLength() {
		return overLength;
	}
	public void setOverLength(double overLength) {
		this.overLength = overLength;
	}
	public double getOverWidth() {
		return overWidth;
	}
	public void setOverWidth(double overWidth) {
		this.overWidth = overWidth;
	}
	public double getOverHeight() {
		return overHeight;
	}
	public void setOverHeight(double overHeight) {
		this.overHeight = overHeight;
	}
	
	public int getTotEmission() {
		return totEmission;
	}
	public void setTotEmission(int totEmission) {
		this.totEmission = totEmission;
	}
	public int getVehWeight() {
		return vehWeight;
	}
	public void setVehWeight(int vehWeight) {
		this.vehWeight = vehWeight;
	}
	
	
	
}
