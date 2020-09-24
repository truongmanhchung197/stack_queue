import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;
public class Palindrome {
    public static boolean isPalindrome(String string){
        string=string.toLowerCase();
        Stack<Character> stack=new Stack<>();
        Queue<Character> queue=new LinkedList<>();
        for (int i=0;i<string.length();i++){
            stack.push(string.charAt(i));
            queue.add(string.charAt(i));
        }
        for (int i=0;i<string.length();i++){
            if (stack.pop()!=queue.poll()){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str ="Able was I ere I saw Elba";
        if (isPalindrome(str)){
            System.out.println("dung");
        } else {
            System.out.println("sai");
        }

    }
}
