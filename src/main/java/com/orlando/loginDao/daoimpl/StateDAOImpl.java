package com.orlando.loginDao.daoimpl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.orlando.loginDao.bo.State;
import com.orlando.loginDao.dao.HibernateSession;
import com.orlando.loginDao.dao.StateDAO;

public class StateDAOImpl implements StateDAO{
	
	private static final String GET_ALL_STATES = "FROM State";
	
	@Override
	public List<State> getAllStates() {
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		TypedQuery<State> query = session.createQuery(GET_ALL_STATES);
		List<State> list = query.getResultList();
		session.close();
		return list;
	}

	@Override
	public State findById(int id) {
		State state = (State)HibernateSession.getObjectByPrimaryKey(State.class, id);
		return state;
	}

}