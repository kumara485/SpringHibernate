package com.oded.model;

import java.util.Arrays;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

public class Blog {

	private int id;
	
	private String title;
	
	private String body;
	private String comments ;
	private String[] likes;
	private String gender;
	private String rating;
	public Blog() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public String[] getLikes() {
		return likes;
	}
	public void setLikes(String[] likes) {
		this.likes = likes;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", body=" + body + ", comments=" + comments + ", likes="
				+ Arrays.toString(likes) + ", gender=" + gender + ", rating=" + rating + "]";
	}
	
}
