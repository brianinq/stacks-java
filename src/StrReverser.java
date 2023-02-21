import java.util.Stack;

class StrReverser{
    public static String reverse(String str){
        if (str == null) throw new IllegalArgumentException();
        Stack<Character> stack = new Stack<>();
        for (char c: str.toCharArray() ){
            stack.push(c);
        }

        StringBuffer reversed = new StringBuffer();
        while (!stack.isEmpty()){
            reversed.append(stack.pop());
        }
        return reversed.toString();
    }
}