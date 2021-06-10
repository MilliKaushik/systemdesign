package mementoPattern;

//Memento pattern is used to implement undo mechanisms in classes.
public class Editor {

	private String content;

	public EditorState saveStateToMemento() {
		return new EditorState(content);
	}

	public void restoreStateToMemento(EditorState state) {
		content = state.getContent();
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
