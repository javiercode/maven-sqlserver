package de.cosh.azure;

import de.cosh.azure.model.GeoPredio19;
import de.cosh.azure.model.Person;
import de.cosh.azure.model.PersonBuilder;
import de.cosh.azure.repository.GeoPredio19Repositorio;
import de.cosh.azure.service.PersonService;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.Instant;
import java.util.Collection;
import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SqlserverApplicationTests {

	@Autowired
	private GeoPredio19Repositorio geoPredio19Repositorio;

//	@Before
//	public void setup()
//	{
//		Date birthday = Date.from(Instant.now());
//		String name = "cosh";
//		Long salary = 10L;
//
//		personService.create(new PersonBuilder()
//								.setBirthday(birthday)
//								.setName(name)
//								.setSalary(salary)
//								.createPerson());
//	}
//
//	@After
//	public void tearDown()
//	{
//		personService.tabulaRasa();
//	}
//
//	@Test
//	public void addPerson() {
//
//		Date birthday = Date.from(Instant.now());
//		String name = "cosh2";
//		Long salary = 24L;
//
//		final Person person = new PersonBuilder().createPerson();
//		person.setBirthday(birthday);
//		person.setName(name);
//		person.setSalary(salary);
//
//		personService.create(person);
//
//		Collection<Person> allPersons = personService.findAll();
//
//		Assert.assertTrue(allPersons.stream().anyMatch(person1 -> person1.getName().equals(name)));
//	}

	@Test
	public void checkAverage() {

		GeoPredio19 geoPredio19 = geoPredio19Repositorio.getOne(46);

		Assert.assertEquals(15.0, geoPredio19.getIdObjeto(), 0.1);
	}
}
