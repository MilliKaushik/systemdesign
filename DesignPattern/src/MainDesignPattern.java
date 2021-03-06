import iterator.BrowseHistory;
import iterator.Iterator;
import memento.Editor;
import memento.History;
import state.Canvas;
import state.SelectionTool;
import strategy.BlackAndWhiteFilter;
import strategy.Compressor;
import strategy.Filter;
import strategy.ImageStorage1;
import strategy.ImageStorage2;
import strategy.JPEGCompressor;
import strategy.PNGCompressor;
import template.AuditTrail;
import template.GenerateReport3;
import template.Task3;
import template.TransferMoneyTask3;

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

		// strategy pattern
		Compressor compressor = new JPEGCompressor();
		Filter filter = new BlackAndWhiteFilter();
		ImageStorage1 imageStorage1 = new ImageStorage1(compressor, filter);
		imageStorage1.store("a");

		// so we have two versions of the file, one saved as JPEG, other as PNG
		// Now in real application, we might have a list of files, we could iterate over
		// the list and store in different formats and apply different compression and
		// algorithms and filters
		ImageStorage2 imageStorage2 = new ImageStorage2();
		imageStorage2.store("a", new PNGCompressor(), new BlackAndWhiteFilter());
		imageStorage2.store("a", new JPEGCompressor(), new BlackAndWhiteFilter());
		// strategy pattern

		// template pattern
		AuditTrail auditTrail = new AuditTrail();
		Task3 task31 = new TransferMoneyTask3(auditTrail);
		Task3 task32 = new GenerateReport3(auditTrail);
		task31.execute();
		task32.execute();
		// template pattern
	}
}
