package kr.co.portfolio.daoTests;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.co.portfolio.serviceTests.AdminUserServiceTests;
import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/WEB-INF/spirng/root-content.xml"})
public class AdminUserTests {

}
