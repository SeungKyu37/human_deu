package com.human.springboot;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface empDAO {
	ArrayList<EmpDTO> list();		// 반환값 메소드명(매개변수들)
	ArrayList<RoomtypeDTO> listRoomType();
	ArrayList<Dep> listDep();
	void insertRoomType(String typename);
	void deleteRoomType(int typenum);
	void updateRoomType(String tname, int tnum);
	ArrayList<RoomInfo> infolist();
	void insertRoomInfo(String name, int type, int howmany, int howmuch);
	void deleteRoomInfo(int num);
	void updateRoomInfo(String num, String name, int type, int howmany, int howmuch);
}
