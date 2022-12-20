package com.human.springboot;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemDAO {
	ArrayList<Member> list();
	void insertMember(String loginid, String password, String name, String mobile);
	int MemberCnt(String loginid, String passcode);
}
