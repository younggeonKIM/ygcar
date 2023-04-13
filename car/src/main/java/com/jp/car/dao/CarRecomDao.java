package com.jp.car.dao;

import java.util.ArrayList;
import java.util.List;

import com.jp.car.model.CarRecom;

public interface CarRecomDao {
	public final static List<CarRecom> carList = new ArrayList<CarRecom>();
	
	public void addCar(CarRecom cr);
	public CarRecom findCarRecom (CarRecom cr);
	public List<String> getAutoNam (CarRecom cr);
	public List<String> getAutoNamByOrig (CarRecom cr);
}
