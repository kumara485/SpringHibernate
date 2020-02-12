package com.oded.dao;

import java.util.List;

import com.oded.model.Blog;

public interface BlogI {
	 int addBlog(Blog blog);
	 Blog getBlogbyId(int id);
	 List<Blog> getAllBlog();
	 int delBlog(int id);
	 int editBlog(Blog blog);
	 
	 

}
