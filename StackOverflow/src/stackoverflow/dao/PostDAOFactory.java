package stackoverflow.dao;

import stackoverflow.enumeration.PostType;

public class PostDAOFactory {

	public PostDAO createPostDAO(PostType postType) {
		PostDAO postDAO = null;
		switch (postType) {
		case QUESTION:
			return new QuestionDAO();
		case ANSWER:
			return new AnswerDAO();
		case COMMENT:
			return new CommentDAO();
		}
		return postDAO;
	}

}
