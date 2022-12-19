package com.human.springboot;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PostDAO {
	ArrayList<Posting> list();
	View viewPosting(int post_id);
	void insertContent(String title, String content, String writer);
	void deletePosting(int post_id);
	void updatePosting(int post_id, String title, String content); 
}
