package cs.dit.service;

import java.util.List;

import org.springframework.stereotype.Service;

import cs.dit.domain.BoardVO;
import cs.dit.mapper.BoardMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;

	@Log4j
	@Service
	@RequiredArgsConstructor
	public class BoardServiceImpl implements BoardService {
	  //spring 4.3 이상에서 자동 처리 
	  private final BoardMapper mapper;
	  
	  @Override
	  public List<BoardVO> getList() {
	 	log.info("getList -------------------");
		return mapper.getList();
	  }
	  
	  @Override
	  public int register(BoardVO board) {
		 int i = mapper.insert(board);
		 return i;
	  }
	  
	  @Override
		public BoardVO get(Long bno) {
			
			return mapper.read(bno);
		}
	  @Override
		public int modify(BoardVO board) {
				
			return mapper.update(board);
		}
	  @Override
		public int remove(Long bno) {
			
			return mapper.delete(bno);
		}
	}
