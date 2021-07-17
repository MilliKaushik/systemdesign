package memento;

public class MainDesignPattern {

	public static void main(String[] args) {

		// Memento Pattern
		Editor editor = new Editor();
		History history = new History();

		editor.setContent("a");
		history.push(editor.saveStateToMemento());
		editor.setContent("b");
		history.push(editor.saveStateToMemento());
		editor.setContent("c");
		history.push(editor.saveStateToMemento());

		// c will be displayed
		editor.restoreStateToMemento(history.pop());
		// b will be displayed
		editor.restoreStateToMemento(history.pop());

		// Memento Pattern
	}
}
