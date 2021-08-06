package stackoverflow.model;

import java.util.List;

import stackoverflow.enumeration.PostType;

public abstract class PostRequest {
	
	User user;
	
	Location location;
	
	String content;
	
	List<Photo> photos;
	
	PostType postType;

}
