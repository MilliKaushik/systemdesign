package stackoverflow.service;

import stackoverflow.model.Question;

public class ModeratorService {

	public void closeQuestion(Question question) {
		question.setOpen(false);
	}
	
	
	
}
