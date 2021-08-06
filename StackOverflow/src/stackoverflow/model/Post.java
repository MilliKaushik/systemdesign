package stackoverflow.model;

import java.util.Date;

import stackoverflow.enumeration.PostType;

public abstract class Post {

	int id;

	String content;

	Date creationDate;

	Location location;

	int noOfUpvotes;

	int noOfDownvotes;

	PostType postType;

	boolean isFlagged;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public int getNoOfUpvotes() {
		return noOfUpvotes;
	}

	public void setNoOfUpvotes(int noOfUpvotes) {
		this.noOfUpvotes = noOfUpvotes;
	}

	public int getNoOfDownvotes() {
		return noOfDownvotes;
	}

	public void setNoOfDownvotes(int noOfDownvotes) {
		this.noOfDownvotes = noOfDownvotes;
	}

	public PostType getPostType() {
		return postType;
	}

	public void setPostType(PostType postType) {
		this.postType = postType;
	}

	public boolean isFlagged() {
		return isFlagged;
	}

	public void setFlagged(boolean isFlagged) {
		this.isFlagged = isFlagged;
	}

}
