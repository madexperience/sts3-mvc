package cs.dit.mapper;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)  //현재 테스트 코드가 스프링 실행 역할을 할 것이라고 알림
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") //설정파일 읽어내기
@Log4j //lombok을 이용해 로그를 기록하는 Logger를 변수로 생성
public class TestMapper {
	
	 @Autowired
	 private TimeMapper timeMapper;
	
	 @Test
	  public void testGetTime02() {
	    log.info("getTime02--------------------------");
	    log.info(timeMapper.getClass().getName());
	    log.info(timeMapper.getTime01());
	  }
	 
	 @Test
	 public void testGetTime01() {
		 log.info("getTime01--------------------------");
		 log.info(timeMapper.getClass().getName());
		 log.info(timeMapper.getTime01());
	  }
}
