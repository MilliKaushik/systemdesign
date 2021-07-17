package iterator;

import java.util.ArrayList;
import java.util.List;

//why inside the class? Because the iterator is part of the implementation of the BrowseHistory 
//class
public class BrowseHistory {
	private List<String> urls;

	public BrowseHistory() {
		urls = new ArrayList<>();
	}

	public Iterator createIterator() {
		return new ListIterator(this);
	}

	public void push(String url) {
		urls.add(url);
	}

	public String pop(String url) {
		int lastIndex = urls.size() - 1;
		String lastUrl = urls.get(lastIndex);
		urls.remove(lastUrl);

		return lastUrl;
	}

	public class ListIterator implements Iterator {
		private BrowseHistory history;
		private int index;

		public ListIterator(BrowseHistory history) {
			this.history = history;
		}

		@Override
		public boolean hasNext() {
			return index < history.urls.size();
		}

		@Override
		public void next() {
			index++;
		}

		@Override
		public String current() {
			return history.urls.get(index);
		}
	}
}
