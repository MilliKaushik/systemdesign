package mementoPattern;

import java.util.ArrayList;
import java.util.List;

public class EditorOriginal {

	private String content;
	private List<String> contents;

	public EditorOriginal() {
		contents = new ArrayList<>();
	}

	public void undo() {
		if (contents.isEmpty())
			return;
		contents.remove(contents.size() - 1);
		if (contents.isEmpty())
			this.content = "";
		else
			this.content = contents.get(contents.size() - 1);
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		contents.add(content);
		this.content = content;
	}
}
