package com.oded.model;

public class Blog {

	private int id;
	private String title;
	private String body;
	private String comments ;
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
	@Override
	public String toString() {
		return "Blog [id=" + id + ", title=" + title + ", body=" + body + ", comments=" + comments + "]";
	}
	
	
}
