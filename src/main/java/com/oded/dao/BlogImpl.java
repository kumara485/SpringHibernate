package com.oded.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.oded.model.Blog;

public class BlogImpl implements BlogI {
	
	private JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int addBlog(Blog blog) {
		// TODO Auto-generated method stub
		System.err.println(blog.getComments());
		 String q="insert into data(title,body,comments) values('"+blog.getTitle()+"','"+blog.getBody()+"','"+blog.getComments()+"')"; 
		return jt.update(q);
	}

	public Blog getBlogbyId(int id) {
		// TODO Auto-generated method stub
		String sql="select * from data where id=?";
	return	jt.queryForObject(sql,new Object[]{id},new BeanPropertyRowMapper<Blog>(Blog.class));
	}

	public List<Blog> getAllBlog() {
		// TODO Auto-generated method stub
		String q="select * from data";
		return jt.query(q, new RowMapper() {
			public Blog mapRow(ResultSet rs, int arg1) throws SQLException {
				// TODO Auto-generated method stub
				Blog b=new Blog();
				b.setId(rs.getInt(1));
				b.setTitle(rs.getString(2));
				b.setBody(rs.getString(3));
				b.setComments(rs.getString(4));
				return b;
			}
		}) ;
	}

	public int delBlog(int id) {
		// TODO Auto-generated method stub
		String sql="delete from data where id="+id;
		return jt.update(sql);
	}

	public int editBlog(Blog blog) {
		  
		return jt.update("update data set title='"+blog.getTitle()+"',body='"+blog.getBody()+"',comments='"+blog.getComments()+"' where id="+blog.getId());
	}

	

}
