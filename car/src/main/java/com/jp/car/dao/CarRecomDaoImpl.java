package com.jp.car.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jp.car.model.CarRecom;


public class CarRecomDaoImpl implements CarRecomDao {
	
	@Override
	public void addCar(CarRecom cr) {
		carList.add(cr);

	}

	@Override
	public CarRecom findCarRecom(CarRecom cr) {
		CarRecom carFind = new CarRecom();
		for(int i = 0; i<carList.size(); i++) {
			if(cr.getAutoName().equals(carList.get(i).getAutoName()) && cr.getAutoMaker().equals(carList.get(i).getAutoMaker())) {
				carFind = carList.get(i);
				break;
			}
		}
		return carFind;
	}

	@Override
	public List<String> getAutoNam(CarRecom cr) {
		List<String> autoNameList = new ArrayList<String>();
		
		for(int i = 0 ; i<carList.size(); i++) {
			if(cr.getAutoMaker().equals(carList.get(i).getAutoMaker())){
				autoNameList.add(carList.get(i).getAutoName());
			}
		}
		
		return autoNameList;
	}

	@Override
	public List<String> getAutoNamByOrig(CarRecom cr) {
List<String> autoNameList = new ArrayList<String>();
		
		for(int i = 0 ; i<carList.size(); i++) {
			if(cr.getOrigin().equals(carList.get(i).getOrigin())){
				autoNameList.add(carList.get(i).getAutoName());
			}
		}
		
		return autoNameList;
	}

}
