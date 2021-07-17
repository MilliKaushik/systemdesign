package adapter.iteratorEnumExample;

import java.util.Enumeration;
import java.util.Iterator;

//https://stackoverflow.com/a/38000760 - generics
public class EnumerationAdapter implements Iterator<Object> {
	Enumeration<?> enumeration;

	public EnumerationAdapter(Enumeration<?> enumeration) {
		this.enumeration = enumeration;
	}

	@Override
	public boolean hasNext() {
		return enumeration.hasMoreElements();
	}

	@Override
	public Object next() {
		return enumeration.nextElement();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
