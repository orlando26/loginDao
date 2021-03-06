package com.orlando.loginDao.daoImpl;

import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;

import com.orlando.loginDao.dao.HibernateSession;
import com.orlando.loginDao.dao.PersonDAO;
import com.orlando.loginDao.model.Person;

public class PersonDAOImpl implements PersonDAO{
	private static final String GET_ALL_PERSONS = "FROM Person"; //HQL(Hibernate Query Language)
	
	private static final String FIND_BY_EMAIL = "FROM Person WHERE Email = :email";
	
	
	
	public void insert(Person person) {
		// TODO Auto-generated method stub
		HibernateSession.saveObject(person);
	}

	
	public List<Person> getAllPersons() {
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		TypedQuery<Person> query = session.createQuery(GET_ALL_PERSONS);
		List<Person> list = query.getResultList();
		session.close();
		return list;
	}

	
	public Person findById(int id) {
		Person person = (Person)HibernateSession.getObjectByPrimaryKey(Person.class, id);
		return person;
	}

	
	public Person findByEmail(String email) {
		Session session = HibernateSession.getSession();
		session.beginTransaction();
		TypedQuery<Person> query = session.createQuery(FIND_BY_EMAIL);
		query.setParameter("email", email);
		Person person = (Person)query.getResultList().get(0);
		session.close();
		return person;
	}

	
	public void deletePerson(Person person) {
		HibernateSession.deleteObject(person);
	}

	
	public void updatePerson(Person person) {
		// TODO Auto-generated method stub
		HibernateSession.updateObject(person);
	}

}
