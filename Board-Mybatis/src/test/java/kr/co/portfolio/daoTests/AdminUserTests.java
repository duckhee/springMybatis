package kr.co.portfolio.daoTests;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.portfolio.user.dao.UserDao;
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
		dao.list().forEach(user->{
			log.info(user);
		});
	}
	
}
