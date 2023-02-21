import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println(StrReverser.reverse("Reversed"));
        System.out.println(ValidateParenthesisPair.isBalanced("<()>?>"));

        var stack = new StackImplementation();
        stack.push(20);
        stack.push(67);
        stack.push(90);
        stack.pop();
        System.out.println(stack);
    }
}