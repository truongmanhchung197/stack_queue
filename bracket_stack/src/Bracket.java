import java.util.Stack;

public class Bracket {
    public static boolean checkBracket(String string) {
        Stack<Character> bStack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            int num = string.charAt(i);
            if (num == 40) {
                bStack.push(string.charAt(i));
            } else if (num == 41) {
                if (bStack.isEmpty()) {
                    return false;
                } else {
                    bStack.pop();
                }
            }
        }
        if (bStack.isEmpty()) return true;
        else return false;
    }

    public static void main(String[] args) {
        String str = "s * (s – a) * (s – b) * (s – c) ";
        if (checkBracket(str)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
