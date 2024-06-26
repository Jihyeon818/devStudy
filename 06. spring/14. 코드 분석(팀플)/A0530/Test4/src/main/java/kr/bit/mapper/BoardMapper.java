package kr.bit.mapper;

import java.util.List;

import kr.bit.entity.Board;
import kr.bit.entity.Criteria;
import kr.bit.entity.Member;

public interface BoardMapper {
	
	public List<Board> getList(Criteria cri);
	public void insert(Board vo);
	public void insertSelectKey(Board vo);
	public Member login(Member vo);
	public Board read(int idx);
	public void update(Board vo);
	public void delete(int idx);
	public void replyUpdate(Board pa);
	public void replyInsert(Board vo);
	public int totalCount(Criteria cri);
	public void cntUpdate(int idx);

}
