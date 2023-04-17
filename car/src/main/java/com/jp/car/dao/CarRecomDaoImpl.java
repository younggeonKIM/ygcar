package com.jp.car.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.jp.car.model.CarRecom;


public class CarRecomDaoImpl implements CarRecomDao {
	public final static List<CarRecom> carList = new ArrayList<CarRecom>();
	
	public void addCar(CarRecom cr) {
		carList.add(cr);

	}

	
	public CarRecom findCarRecom(CarRecom cr) { //　詳細情報の検索
		CarRecom carFind = new CarRecom();
		for(int i = 0; i<carList.size(); i++) {
			if(cr.getAutoName().equals(carList.get(i).getAutoName()) && 
				cr.getAutoMaker().equals(carList.get(i).getAutoMaker())) {
				carFind = carList.get(i);
				break;
			}
		}
		return carFind;
	}

	
	public List<String> findAutoNam(CarRecom cr) {
		List<String> autoNameList = new ArrayList<String>();
		
		for(int i = 0 ; i<carList.size(); i++) {
			if(cr.getAutoMaker().equals(carList.get(i).getAutoMaker())){
				autoNameList.add(carList.get(i).getAutoName());
			}
		}
		
		return autoNameList;
	}

	
	public List<String> findAutoNamByMakr(CarRecom cr) {
		List<String> autoNameList = new ArrayList<String>();
		
		for(int i = 0 ; i<carList.size(); i++) {
			if(cr.getAutoMaker().equals(carList.get(i).getAutoMaker())){
				autoNameList.add(carList.get(i).getAutoName());
			}
		}
		
		return autoNameList;
	}

	
	public List<CarRecom> findAutoList(String org) {
		List<CarRecom> autoAutoList = new ArrayList<CarRecom>();
		
		for(int i = 0 ; i<carList.size(); i++) {
			if(org.equals(carList.get(i).getOrigin())){
				autoAutoList.add(carList.get(i));
			}
		}
		
		return autoAutoList;
	}

	

}
