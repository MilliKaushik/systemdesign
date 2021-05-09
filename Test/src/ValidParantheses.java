import java.util.HashMap;
import java.util.Stack;

public class ValidParantheses {

	public boolean isValidParantheses(String parantheses) {

		if (parantheses.isEmpty())
			return true;

		Stack<Character> stack = new Stack<>();
		HashMap<Character, Character> braces = new HashMap<>();
		braces.put('}', '{');
		braces.put(']', '[');
		braces.put(')', '(');

		for (int i = 0; i < parantheses.length(); i++) {
			Character current = parantheses.charAt(i);
			if (braces.values().contains(current))
				stack.push(current);
			else {
				if (stack.isEmpty())
					return false;
				Character top = stack.pop();
				if (top != braces.get(current))
					return false;
			}
		}
		if (!stack.isEmpty())
			return false;
		return true;
	}
}
