package adapter.iteratorEnumExample;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class IteratorEnumTestDrive {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>(Arrays.asList(1, 2, 3));
		Iterator<?> iterator = new EnumerationAdapter(v.elements());
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		List<Integer> list = Arrays.asList(1, 2, 3);
		Iterator<Integer> it = list.iterator();
		Enumeration<?> enumeration = new IteratorAdapter(it);
		while (enumeration.hasMoreElements())
			System.out.println(enumeration.nextElement());

		// throws exception as is expected
		iterator.remove();
	}

}
