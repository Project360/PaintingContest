/**
 * 
 */
package test;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import model.Contestant;
import view.Registration;

/**
 * @author Sara Vandandaigue
 * @version 03/17/2016
 *
 */
public class RegistrationTest {
	
	Registration reg;
	Contestant user;
	Contestant user2;
	Contestant invalid;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		reg = new Registration();
		user = new Contestant("Sara", "Vandandaigue", "206-794-0123", "30", "sv3@uw.edu");
		user2 = new Contestant("George", "Vandandaigue", "206-794-0123", "30", "sv3@uw.edu");
		invalid = new Contestant("ERROR", "Vandandaigue", "206-794-0123", "30", "sv3@uw.edu");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		reg = null;
		user = null;
		user2 = null;
		invalid = null;
	}

	/**
	 * Test method for {@link view.Registration#validEmail(java.lang.String)}.
	 */
	@Test
	public final void testValidEmail() {
		String email = "sara.com";
		Assert.assertFalse(reg.validEmail(email));
		email = "sara@";
		Assert.assertFalse(reg.validEmail(email));
		email = "sv3@uw.edu";
		Assert.assertTrue(reg.validEmail(email));
		email = "sv3@uw.com";
		Assert.assertTrue(reg.validEmail(email));
		email = "sv3@uw.net";
		Assert.assertTrue(reg.validEmail(email));
		email = "sv3@uw.ru";
		Assert.assertFalse(reg.validEmail(email));
	}

	/**
	 * Test method for {@link view.Registration#validPhone(java.lang.String)}.
	 */
	@Test
	public final void testValidPhone() {
		String phone1 = "123-456-7890";
		Assert.assertTrue(reg.validPhone(phone1));
        phone1 = "123.456.7890";
        Assert.assertTrue(reg.validPhone(phone1));
        phone1 = "123 456 7890";
        Assert.assertTrue(reg.validPhone(phone1));
        phone1 = "(123)-456-7890";
        Assert.assertTrue(reg.validPhone(phone1));
        phone1 = "1234567890";
        Assert.assertTrue(reg.validPhone(phone1));
        phone1 = "12345678901";
        Assert.assertFalse(reg.validPhone(phone1));
        phone1 = "12345..6890";
        Assert.assertFalse(reg.validPhone(phone1));
	}

	/**
	 * Test method for {@link view.Registration#validAge()}.
	 */
	@Test
	public final void testValidAge() {
		String age1 = "101";
		Assert.assertFalse(reg.validAge(age1));
		age1 = "12";
		Assert.assertTrue(reg.validAge(age1));
		age1 = "0";
		Assert.assertFalse("The age was invalid", reg.validAge(age1));
		
	}

	/**
	 * Test method for {@link view.Registration#registerUser(model.Contestant)}.
	 */
	@Test
	public final void testRegisterUserValid() {
		// test writing to file and reading file
		reg.registerUser(user);
		boolean foundUser = false;
		try {
			Scanner in = new Scanner(new File("registeration.txt"));
			while (in.hasNextLine()) {
				String line = in.nextLine();
				String[] theLine = line.split("\\|");
				//String[] userInfo = theLine[1].split(",");
				if(theLine[1].trim().equalsIgnoreCase(user.getFirst()))
				{
					foundUser = true;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertTrue(foundUser);
	}
	
	/**
	 * Test method for {@link view.Registration#registerUser(model.Contestant)}.
	 */
	@Test
	public final void testRegisterUserInvalid() {
		// test writing to file and reading file
		reg.registerUser(user2);
		boolean foundUser = false;
		try {
			Scanner in = new Scanner(new File("registeration.txt"));
			while (in.hasNextLine()) {
				String line = in.nextLine();
				String[] theLine = line.split("\\|");
				String[] userInfo = theLine[1].split(",");
				if(userInfo[0].trim().equalsIgnoreCase(invalid.getFirst()))
				{
					foundUser = true;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertFalse(foundUser);
	}

}
