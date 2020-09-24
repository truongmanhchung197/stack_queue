import java.util.Stack;

public class Mail {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Integer[] list = {1, 2, 3, 4, 5};
        stack.push(list[0]);
        stack.push(list[1]);
        stack.push(list[2]);
        stack.push(list[3]);
        stack.push(list[4]);
        list[0] = stack.pop();
        list[1] = stack.pop();
        list[2] = stack.pop();
        list[3] = stack.pop();
        list[4] = stack.pop();
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        Stack<String> wStack = new Stack<>();
        String string = "where are you";
        String[] word = string.split("\\s");
        for (int i = 0; i < word.length; i++) {
            wStack.push(word[i]);
        }
        String outp = "";
        int sizeStack = wStack.size();
        for (int i = 0; i < sizeStack; i++) {
            outp += wStack.pop() + " ";
        }
        System.out.println("\n" + outp);


    }
}
