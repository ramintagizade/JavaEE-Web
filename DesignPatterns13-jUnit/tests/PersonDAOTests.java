import static org.junit.Assert.*;

import java.sql.SQLException;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ramintaghizada.designpatterns.demo1.model.DAOFactory;
import com.ramintaghizada.designpatterns.demo1.model.Database;
import com.ramintaghizada.designpatterns.demo1.model.Person;
import com.ramintaghizada.designpatterns.demo1.model.PersonDAO;

public class PersonDAOTests {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("Setup before class");
		Database.getInstance().connect();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("Tear down after class");
		Database.getInstance().disconnect();
	}

	@Before
	public void setUp() throws Exception {
		System.out.println("Setup");
		PersonDAO dao = DAOFactory.getPersonDAO();
		dao.deleteAll();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("Tear down");
	}

	@Test
	public void test() {
		int value = 7;
		value+=2;
		System.out.println("Running demo test");
		assertEquals("Check for equality ",9,value);
	}
	@Test
	public void testCreate() throws SQLException{
		PersonDAO dao = DAOFactory.getPersonDAO();
		Person person1 = new Person("BOB","Letmein");
		Person person2 = new Person("Sue","hello");
		dao.addPerson(person1);
		dao.addPerson(person2);
		List<Person>people = dao.getPeople();
		assertEquals("Should be two people in database",2,people.size());
		assertEquals("These two people should be the same ",person1,people.get(0));
		assertEquals("These two people should be the same ",person2,people.get(1));
	}
}
