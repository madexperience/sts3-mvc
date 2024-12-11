package cs.dit.service;

import java.util.List;

import cs.dit.domain.BoardVO;

public interface BoardService {
	
	  public List<BoardVO> getList();
	  
	  public int register(BoardVO board);
	  
	  public BoardVO get(Long bno);
	  
	  public int modify(BoardVO board);
		
	  public int remove(Long bno);
}
