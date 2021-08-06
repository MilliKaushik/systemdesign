package stackoverflow.service;

import stackoverflow.model.Post;
import stackoverflow.model.PostRequest;

//TAG SERVICE
public interface PostService {

	void add(PostRequest postRequest);

	void delete(Post post);

	void flag(Post post);

	void upvote(Post post);

	void downvote(Post post);

}
