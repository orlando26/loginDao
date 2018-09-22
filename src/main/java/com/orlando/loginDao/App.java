package com.orlando.loginDao;

import java.util.List;

import com.orlando.loginDao.dao.PersonDAO;
import com.orlando.loginDao.daoImpl.PersonDAOImpl;
import com.orlando.loginDao.model.Person;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        PersonDAO personDao = new PersonDAOImpl();
        
        List<Person> persons = personDao.getAllPersons();
        
        for (Person person : persons) {
			System.out.println(person);
		}
    }
}
