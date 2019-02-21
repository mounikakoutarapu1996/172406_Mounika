package com.java.news;

public class NewsId {
	private int newsId;
	private String PostedByUser;
	private String commentByUser;
	private String comment;
	public NewsId(int newsId, String postedByUser, String commentByUser, String comment) {
		super();
		this.newsId = newsId;
		PostedByUser = postedByUser;
		this.commentByUser = commentByUser;
		this.comment = comment;
	}
	public int getNewsId() {
		return newsId;
	}
	public void setNewsId(int newsId) {
		this.newsId = newsId;
	}
	public String getPostedByUser() {
		return PostedByUser;
	}
	public void setPostedByUser(String postedByUser) {
		PostedByUser = postedByUser;
	}
	public String getCommentByUser() {
		return commentByUser;
	}
	public void setCommentByUser(String commentByUser) {
		this.commentByUser = commentByUser;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "NewsId [newsId=" + newsId + ", PostedByUser=" + PostedByUser + ", commentByUser=" + commentByUser
				+ ", comment=" + comment + "]";
	}
	
	

}
