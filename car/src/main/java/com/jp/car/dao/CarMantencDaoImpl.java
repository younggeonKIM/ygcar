package com.jp.car.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CarMantencDaoImpl implements CarMantencDao {
	@Autowired
	private SqlSession ss;
	
	private static final String NAMESPACE = "com.jp.car.mappers.carmantencMapper";
	@Override
	public List<String> getExpenList() {
		ss.selectList(NAMESPACE+".findExpenItLis");
		return null;
	}

}
