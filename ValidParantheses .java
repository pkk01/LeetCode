import java.util.*;

public class ValidParantheses {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        // if left parantheses --> push
        // if right parantheses --> pop
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            }
            else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }
            else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }
            else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }
            else
             return false;
        }

        return stack.isEmpty();

    }
}