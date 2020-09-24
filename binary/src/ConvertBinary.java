import java.util.Stack;
public class ConvertBinary {
    public void convertDecimalToBinary(int number){
        Stack<Integer> stack=new Stack<>();
        while (number!=0){
            int num=number%2;
            stack.push(num);
            number/=2;
        }
        while (!(stack.isEmpty())){
            System.out.print(stack.pop());
        }
    }
}
