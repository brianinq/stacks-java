import java.util.Arrays;

public class StackImplementation {
    private int[] items = new int[5];
    private int count = 0;

    public void push(int item){
        if (count == items.length) throw new StackOverflowError();
        items[count++] = item;
    }
    public int pop(){
        if (count == 0)
            throw new IllegalArgumentException();
        return items[--count];
    }
    public boolean isEmpty(){
        return count == 0;
    }
    @Override
    public String toString(){
        var arr = Arrays.copyOfRange(items, 0, count);
        return Arrays.toString(arr);
    }
}
