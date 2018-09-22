package com.orlando.loginDao.dao;

import java.util.List;

import com.orlando.loginDao.model.City;

//DAO (Data Access Object) Patron de diseño
public interface CityDAO {
	
	public List<City> findAllByStateId(int stateId); 
	
}
