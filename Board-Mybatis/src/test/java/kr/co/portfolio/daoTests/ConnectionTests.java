package kr.co.portfolio.daoTests;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class ConnectionTests {
	
	@Setter(onMethod_ = @Autowired)
	private DataSource dataSource;
	
	@Setter(onMethod_ = @Autowired)
	private SqlSessionFactory sqlSessionFactory;

	@Test
	public void testConnection() {
		try(Connection con = dataSource.getConnection()){
			log.info("Connection : " + con);
		}catch (Exception e) {
			// TODO: handle exception
			fail(e.getMessage());
		}
	}
	
	@Test
	public void JDBCTests() {
		try(Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mybatis_ex?useSSL=false&serverTimezone=UTC", "mybatis","won1228")){
			log.info("get Connection : " + con);
		}catch (Exception e) {
			// TODO: handle exception
			fail(e.getMessage());
		}
	}
	
	@Test
	public void MybatisTests() {
		try(SqlSession sesson = sqlSessionFactory.openSession(); Connection con = sesson.getConnection()){
			log.info("Get Mybatis Connection : " + con);
		}catch (Exception e) {
			// TODO: handle exception
			fail(e.getMessage());
		}
	}
	
}
