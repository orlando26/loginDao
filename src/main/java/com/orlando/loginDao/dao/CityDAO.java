package com.orlando.loginDao.dao;

import java.util.List;

import com.orlando.loginDao.bo.City;


//DAO (Data Access Object) Patron de diseño
public interface CityDAO {
	
	public List<City> findAllByStateId(int stateId);
	
}
	