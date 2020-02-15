package com.oded.dao;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.oded.model.Blog;

import javassist.compiler.SyntaxError;

public class BlogImpl implements BlogI {
@Autowired	
 private HibernateTemplate jt;
    @Transactional
	public void addBlog(Blog blog) {
		// TODO Auto-generated method stub
    	System.err.println("ser");
		 jt.save(blog);
		 
		 System.err.println("afterserrr");
	}

	public Blog getBlogbyId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Blog> getAllBlog() { 
		List list=new ArrayList<Blog>();
		// TODO Auto-generated method stub
		 List<Blog> loadAll = jt.loadAll(Blog.class);
		 list.add(loadAll);
		 return list;
	}

	public int delBlog(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int editBlog(Blog blog) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setJt(HibernateTemplate jt) {
		this.jt = jt;
	}
	
	/*private JdbcTemplate jt;
	public void setJt(JdbcTemplate jt) {
		this.jt = jt;
	}

	public int addBlog(Blog blog) {
		// TODO Auto-generated method stub
		System.err.println(blog.getComments());
		 String q="insert into data(title,body,comments,rating,gender,likes) values('"+blog.getTitle()+"','"+blog.getBody()+"','"+blog.getComments()+"','"+blog.getRating()+"','"+blog.getGender()+"','"+blog.getLikes()+"')"; 
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
				ArrayList list=new ArrayList();
				Blog b=new Blog();
				b.setId(rs.getInt(1));
				b.setTitle(rs.getString(2));
				b.setBody(rs.getString(3));
				b.setComments(rs.getString(4));
				b.setRating(rs.getString(5));
				b.setGender(rs.getString(6));
				
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
*/
	

}
