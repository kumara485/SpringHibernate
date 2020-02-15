package com.oded.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.oded.dao.BlogImpl;
import com.oded.model.Blog;
import com.oded.validator.BlogValidator;




@Controller
public class BlogController {
	//@Autowired
    private BlogValidator validator=new BlogValidator();
	@Autowired
	private BlogImpl ddd;
	public void setddd(BlogImpl ddd) {
		this.ddd = ddd;
	}

//@Autowired


	

	
	@PostMapping("/addblog")
	public void addBlog( @ModelAttribute("blog") @Validated Blog blog,BindingResult br){
		//System.err.println("enter");
		//System.err.println(ddd);
		// model.addAttribute("blog",new Blog());
		//System.err.println(validator);
	//validator.validate(blog, br);
		
		/*if(br.hasErrors()){
			System.err.println("Errors");
			List<FieldError> fieldErrors = br.getFieldErrors();
			
			//return "add";
		}*/
		
		System.err.println("controller");
        ddd.addBlog(blog) ;
        System.err.println(" ftercontroller");
		
		
		
	}
	@GetMapping("/edit/{id}")
	public ModelAndView getBlog(@PathVariable ("id")int id,Model model){
		
		Blog blogbyId = ddd.getBlogbyId(id);
		System.err.println(blogbyId);
		  model.addAttribute("list",ddd.getBlogbyId(id));
		return new ModelAndView("edit");
		
		
	}
	
	@GetMapping("/blogs")
	public ModelAndView addBlog(Model model){
		
		 System.err.println(ddd.getAllBlog().get(0));
		model.addAttribute("list", ddd.getAllBlog());
		return new ModelAndView("list");
		
		
	}
	
	@GetMapping("/")
	public String addfromBlog(Model model){
		
		model.addAttribute("blog",new Blog());
		return "add";
		
		
	}
	
	@GetMapping("/delete/{id}")
	public String delfromBlog(@PathVariable("id")int id){
		System.err.println("enter");
		     int delBlog = ddd.delBlog(id);
		if(delBlog>0){
			return "delete";
		}else{
			return "error";
		}
		
		
		
	}
	
//	@PostMapping("/editblog")
//	public String editBlog(@ModelAttribute("blog") Blog blog){
//		//System.err.println("enter");
//		//System.err.println(ddd);
//		///int addBlog = ddd.addBlog(blog) ;
//	   if(addBlog>0){
//		   return "redirect:/blogs";  
//	   }else{
//		   return "error";    
//	   }
//	
//	
//	
//}
}
