package mementoPattern;

import java.util.ArrayList;
import java.util.List;

public class History {
	List<EditorState> states;

	public History() {
		states = new ArrayList<>();
	}

	public void push(EditorState state) {
		states.add(state);
	}

	public EditorState pop() {
		int lastIndex = states.size() - 1;
		EditorState lastState = states.get(lastIndex);
		states.remove(lastState);
		return lastState;
	}
}
