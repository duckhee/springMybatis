package kr.co.portfolio.serviceTests;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.portfolio.user.service.UserService;
import kr.co.portfolio.vo.UserVO;
import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class AdminUserServiceTests {

	@Resource(name="AdminUserService")
	private UserService service;
	
	@Test
	public void MainTests() {
		log.info("User Main Tests");
		log.info("Admin User Service Class" + service.getClass());
	}
	
	@Test
	public void SignUpTests() {
		log.info("User Service SignUp Tests");
		/** Make User Sign Up */
		UserVO user = new UserVO();
		user.setEmail("admindcddccaaddscc5ddc@co.kr");
		user.setPassword("admin1");
		user.setName("admin1");
		/** Service */
		service.signup(user);
	}
}
