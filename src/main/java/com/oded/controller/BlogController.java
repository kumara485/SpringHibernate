package com.oded.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.oded.dao.BlogImpl;
import com.oded.model.Blog;

@Controller
public class BlogController {
	@Autowired
 private BlogImpl dao;

	

	
	@PostMapping("/addblog")
	public String addBlog(@ModelAttribute("blog") Blog blog){
		//System.err.println("enter");
		//System.err.println(dao);
		int addBlog = dao.addBlog(blog) ;
	   if(addBlog>0){
		   return "redirect:/blogs";  
	   }else{
		   return "error";    
	   }
		
		
		
	}
	@GetMapping("/edit/{id}")
	public ModelAndView getBlog(@PathVariable ("id")int id,Model model){
		
		Blog blogbyId = dao.getBlogbyId(id);
		System.err.println(blogbyId);
		  model.addAttribute("list",dao.getBlogbyId(id));
		return new ModelAndView("edit");
		
		
	}
	
	@GetMapping("/blogs")
	public ModelAndView addBlog(Model model){
		
		 //System.err.println(dao.getAllBlog().get(0));
		model.addAttribute("list", dao.getAllBlog());
		return new ModelAndView("list");
		
		
	}
	
	@GetMapping("/form")
	public String addfromBlog(){
		
		
		return "add";
		
		
	}
	
	@GetMapping("/delete/{id}")
	public String delfromBlog(@PathVariable("id")int id){
		System.err.println("enter");
		     int delBlog = dao.delBlog(id);
		if(delBlog>0){
			return "delete";
		}else{
			return "error";
		}
		
		
		
	}
	
	@PostMapping("/editblog")
	public String editBlog(@ModelAttribute("blog") Blog blog){
		//System.err.println("enter");
		//System.err.println(dao);
		int addBlog = dao.addBlog(blog) ;
	   if(addBlog>0){
		   return "redirect:/blogs";  
	   }else{
		   return "error";    
	   }
	
	
	
}
}
