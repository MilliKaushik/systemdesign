package stackoverflow.dao;

import stackoverflow.model.Post;
import stackoverflow.model.PostRequest;

public abstract class PostDAO {

	public abstract void add(PostRequest postRequest);

	public abstract void delete(Post post);

	public abstract void flag(Post post);

	public abstract void upvote(Post post);

	public abstract void downvote(Post post);
}
