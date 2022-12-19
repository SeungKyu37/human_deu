package com.human.springboot;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemDAO {
	void insertMember(String loginid, String password, String name, String mobile);
	int MemberCnt(String loginid, String passcode);
	int checkDup(String loginid);
}
