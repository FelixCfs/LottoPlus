/**
 * 
 */
package com.maxicrop.spring.beans;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.maxicrop.lottery.model.User;

/**
 * @author Apichai.T
 * 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class UserServiceTest extends
		AbstractTransactionalJUnit4SpringContextTests {

	private static final Logger logger = LoggerFactory
			.getLogger(UserServiceTest.class);

	@Autowired
	public UserService userService = null;

	private User user = null;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		logger.info("setUpBeforeClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		logger.info("tearDownAfterClass");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		logger.info("@Before");
		user = new User();
		user.setUserName("Dummy1");
		user.setPassword("Dummy1");
		user.setEnabled(true);
		userService.save(user);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		logger.info("@After");
	}

	@Test
	public void testSaveUser() {

		String userName = userService.findByUserName("Dummy1").getUserName();
		String pwd = userService.findByUserName("Dummy1").getPassword();
		boolean isEnable = userService.findByUserName("Dummy1").isEnabled();
		List<User> users = userService.findAllUsers();
		
		int size = users.size();
		
		logger.info("Userame = "+userName);
		logger.info("Password = "+pwd);
		logger.info("Enable = "+isEnable);

		Assert.assertEquals("Dummy1", userName);
		Assert.assertEquals("Dummy1", pwd);
		Assert.assertTrue(isEnable);
		Assert.assertEquals(1, size);

	}

	@Test
	public void testUpdateUser() {

		user.setUserName("Dummy2");
		user.setPassword("Dummy2");
		user.setEnabled(false);
		userService.update(user);
		
		String userName = userService.findByUserName("Dummy2").getUserName();
		String pwd = userService.findByUserName("Dummy2").getPassword();
		boolean isEnable = userService.findByUserName("Dummy2").isEnabled();
		
		logger.info("Userame = "+userName);
		logger.info("Password = "+pwd);
		logger.info("Enable = "+isEnable);
		
		Assert.assertEquals("Dummy2", userService.findByUserName("Dummy2")
				.getUserName());
		Assert.assertEquals("Dummy2", userService.findByUserName("Dummy2")
				.getPassword());
		Assert.assertEquals(false, userService.findByUserName("Dummy2")
				.isEnabled());

	}

	@Test
	public void testDeleteUser() {

		Assert.assertEquals("Dummy1", userService.findByUserName("Dummy1").getUserName());

	}	
	
}
