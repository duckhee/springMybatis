package kr.co.portfolio.daoTests;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.portfolio.member.dao.MemberDao;
import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml"
})
public class AdminMemberTests {

	@Resource(name="AdminMemberDao")
	private MemberDao dao;
	
	@Test
	public void mainTests() {
		log.info("Get Class : " + dao.getClass());
	}
	
	@Test
	public void InsertTests() {
		log.info("Insert Member Tests");
		
	}
	
	@Test
	public void ModifyTests() {
		log.info("Modify Member Tests");
		
	}
	
	@Test
	public void ListTests() {
		log.info("List Member Tests");
		
	}
	
	@Test
	public void ViewTests() {
		log.info("View Member Tests");
	}
	
	@Test
	public void DeleteTests() {
		log.info("Delete Member Tests");
		
	}
}
