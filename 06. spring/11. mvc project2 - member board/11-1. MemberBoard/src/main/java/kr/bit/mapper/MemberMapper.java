package kr.bit.mapper;

import kr.bit.entity.Member;

public interface MemberMapper {
	
	public Member registerCheck(String memberID);
	
	public int register(Member member);
	
	public Member memberLogin(Member memberVo);
	
	public int memberUpdate(Member memberVo);

}
