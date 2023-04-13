package com.jp.car.dao;

import java.util.ArrayList;
import java.util.List;

import com.jp.car.model.CarRecom;

public class DomCarRecomDaoImpl implements CarRecomDao {
	public final static List<CarRecom> domList = new ArrayList<CarRecom>();
	@Override
	public void addCar(CarRecom cr) {
		domList.add(cr);

	}

	@Override
	public CarRecom findCarRecom(CarRecom cr) {
		
		return null;
	}

}
