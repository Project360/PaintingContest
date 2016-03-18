/**
 * TCSS360
 * Sara Vandandaigue
 */
package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import view.Login;

/**
 * This class tests the Login page.
 * 
 * @author Sara Vandandaigue
 * @version 03/18/2016
 *
 */
public class LoginTest {
	
	private Login loginPage;

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		loginPage = new Login();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		loginPage = null;
	}

	/**
	 * Tests the LoginUser method with invalid credentials.
	 * Test method for {@link view.Login#LoginUser(java.lang.String, java.lang.String)}.
	 */
	@Test
	public final void testLoginUser() {
		String regNo = "1";
		String user = "Sara";
		Assert.assertFalse(loginPage.LoginUser(regNo, user));
		regNo = "27522";
		String wrongUser = "1234";
		Assert.assertFalse(loginPage.LoginUser(regNo, wrongUser));
		//Assert.assertTrue(loginPage.LoginUser(user, regNo));
	}
	
	/**
	 * Tests the LoginUser method with valid credentials.
	 * Test method for {@link view.Login#LoginUser(java.lang.String, java.lang.String)}.
	 */
	@Test
	public final void testLoginUserValid() {
		String regNo = "19511";
		String user = "Sara";
		Assert.assertTrue(loginPage.LoginUser(regNo, user));
	}

}
