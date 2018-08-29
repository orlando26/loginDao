package com.orlando.daoImpl;

import java.util.List;

import org.junit.Test;

import com.orlando.dao.PersonDAO;
import com.orlando.daoimpl.PersonDAOImpl;
import com.orlando.model.Person;

public class PersonDAOImplTest {
	PersonDAO personDao = new PersonDAOImpl();
	
//	@Test
//	public void insertTest(){
//		
//		Person person = new Person();
//		person.setName("Mario");
//		person.setLastName("Benedetti");
//		person.setEmail("marioB@gmail.com");
//		person.setAge(24);
//		person.setAddress("mty");
//		person.setState("NL");
//		person.setCity("San Nicolas");
//		person.setPassword("password");
//		
//		for(int i= 0; i< 15;i++){
//			person.setName("Person " + i);
//			personDao.insert(person);
//		}
	}
	
	@Test
	public void findByIdTest(){
		Person person = personDao.findById(1);
		System.out.println(person);
	}
//	
//	@Test
//	public void getAllPersonsTest(){
//		List<Person> persons = personDao.getAllPersons();
//		for (Person person : persons) {
//			System.out.println(person);
//		}
//	}
//	
//	@Test
//	public void deletePersonTest(){
//		Person person = personDao.findById(2);
//		personDao.deletePerson(person);
//	}
	
}
