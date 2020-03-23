package kr.co.portfolio.serviceTests;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/WEB-INF/spirng/root-content.xml"})
public class AdminUserServiceTests {

}
