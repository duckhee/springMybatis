package kr.co.portfolio.daoTests;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.portfolio.user.dao.UserDao;
import kr.co.portfolio.vo.UserVO;
import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class AdminUserTests {
	
	@Resource(name="AdminUserDao")
	private UserDao dao;

	@Test
	public void mainTests() {
		log.info("Admin User Dao Tests");
		log.info(dao.getClass());
	}
	
	@Test
	public void ListTests() {
		log.info("Admin User List Tests");
		dao.paging(null).forEach(user->{
			log.info(user);
		});
	}
	
	@Test
	public void SignUpTest() {
		log.info("Sign Up Tests");
		UserVO user = new UserVO();
		user.setEmail("admindcdxxdccadcscccc5ddc@co.kr");
		user.setPassword("admin1");
		user.setName("admin1");
		log.info("getBoard"+dao.signup(user));
		
	}
	
	@Test
	public void LoginTests() {
		log.info("Admin User Login Tests");
		String email = "admin@co.kr";
		UserVO user = dao.login(email);
		log.info("login User:" + user);
	}
	
}
