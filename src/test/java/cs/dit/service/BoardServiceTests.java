package cs.dit.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cs.dit.domain.BoardVO;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j

public class BoardServiceTests {
	
	@Autowired
	private BoardService service;
	
	@Test
	public void testGetList() {
		List<BoardVO> list = service.getList();
		
		for(BoardVO board : list) {
			log.info(board);
		}
	}
	
	@Test
	public void testRegister() {
		BoardVO board = new BoardVO();
		board.setContent("안녕");
		board.setTitle("반가워요");
		board.setWriter("홍길동");
		
		log.info("Register----------------");
		log.info(board);
		service.register(board);
	}
	
	@Test
	public void testGet() {
		log.info("GET---------------------------");
		
		BoardVO board = service.get(2L);
		log.info(board);
	}

	@Test
	public void testRemove() {
		log.info("Remove---------------------------");
		
		log.info("remove result : " + service.remove(4L));
	}
	
	@Test
	public void testModify() {
		log.info("Modify---------------------------");
		BoardVO board = service.get(1L);
		
		board.setContent("흠");
		log.info("Modify result : " + service.modify(board));
	}
}
