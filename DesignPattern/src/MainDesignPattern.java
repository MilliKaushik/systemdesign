import iteratorPattern.BrowseHistory;
import iteratorPattern.Iterator;
import mementoPattern.Editor;
import mementoPattern.History;
import statePattern.Canvas;
import statePattern.SelectionTool;

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

		// State Pattern
		Canvas canvas = new Canvas();
		canvas.setTool(new SelectionTool());
		canvas.mouseDown();
		canvas.mouseUp();
		// State Pattern

		// Iterator Pattern
		BrowseHistory browseHistory = new BrowseHistory();
		browseHistory.push("a");
		browseHistory.push("b");
		browseHistory.push("c");
		Iterator it = browseHistory.createIterator();
		while (it.hasNext()) {
			System.out.println(it.current());
			it.next();
		}
		// Iterator Pattern
	}
}
