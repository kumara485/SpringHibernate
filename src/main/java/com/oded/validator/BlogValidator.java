package com.oded.validator;


import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.oded.model.Blog;

@Component
	public class BlogValidator implements Validator{

		public boolean supports(Class<?> clazz) {
			// TODO Auto-generated method stub
			return Blog.class.equals(clazz);
		}

		public void validate(Object target, Errors errors) {
			// TODO Auto-generated method stub
			Blog blog =(Blog) target;
			ValidationUtils.rejectIfEmpty(errors, "title","blog.title.empty");
			ValidationUtils.rejectIfEmpty(errors, "body","blog.body.empty");
			ValidationUtils.rejectIfEmpty(errors, "comments","blog.comments.empty");
			ValidationUtils.rejectIfEmpty(errors, "likes","blog.likes.empty");
			ValidationUtils.rejectIfEmpty(errors, "gender","blog.gender.empty");
			ValidationUtils.rejectIfEmpty(errors, "rating","blog.rating.empty");
			
			
		}

	}


