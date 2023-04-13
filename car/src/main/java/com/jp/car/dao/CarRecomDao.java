package com.jp.car.dao;

import com.jp.car.model.CarRecom;

public interface CarRecomDao {
	public void addCar(CarRecom cr);
	public CarRecom findCarRecom (CarRecom cr);
}
