package com.orlando.loginDao.dao;

import java.util.List;

import com.orlando.loginDao.bo.State;

public interface StateDAO {
	
	public List<State> getAllStates();
	
	public State findById(int id);
	
}
