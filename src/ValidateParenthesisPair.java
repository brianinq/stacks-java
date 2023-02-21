import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ValidateParenthesisPair {

    private static final List<Character> rightChars = Arrays.asList(')', '>', '}', ']');
    private static final List<Character> leftChars = Arrays.asList('(', '<', '{', '[');

    public static boolean isBalanced(String input){
        Stack<Character> stack = new Stack<>();
        for (char ch: input.toCharArray()){
            if (isLeft(ch)) stack.push(ch);
            if (isRight(ch)) {
                if (stack.isEmpty()) return false;
                var lastEntry = stack.pop();
                if (!bracketsMatch(lastEntry, ch)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isLeft(char ch) {
        return leftChars.contains(ch);
    }
    private static boolean isRight(char ch) {
        return rightChars.contains(ch);
    }
    private static boolean bracketsMatch(char left, char right){
        return (right == ')' && left == '(') ||
                (right == '}' && left == '{') ||
                (right == '>' && left == '<') ||
                (right == ']' && left == '[');
    }
}
