package cs.dit.mapper;

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
public class BoardMapperTests {
    @Autowired
    private BoardMapper mapper;
  
    @Test
    public void testGetList() {
    mapper.getList().forEach(board -> log.info(board));
    }
    @Test
    public void testInsert() {
       BoardVO board = new BoardVO();
       board.setTitle("목요일");
       board.setContent("곧 주말임");
       board.setWriter("san");
       int i = mapper.insert(board);
       if(i==1 ) {
          System.out.println("입력되었습니다.");
       }
    }
    
    @Test
    public void testRead() {
       log.info("read............");
       
       BoardVO board = mapper.read(100);
       log.info(board);
    }
    
    @Test
    public void testDelete() {
       log.info("test/delete----");
       log.info("delete"+ mapper.delete(4L));
    }
    
    @Test
    public void testUpdate() {
       BoardVO board = new BoardVO();
       board.setBno(1L);
       board.setTitle("수정 제목");
       board.setContent("수정 내용");
       board.setWriter("작성자 수정");
       log.info("Test -update--");
       int count = mapper.update(board);
       log.info("update count" + count);
       
    }
}
