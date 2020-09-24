public class GenericStackClient {
    public static void main(String[] args) {
        System.out.println("Stack of integers: ");
        stackOfIntegers();
    }
    private static void stackOfIntegers(){
        MyGenericStack<Integer> stack=new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("1.1 Size of stack after push operations: "+stack.size());
        System.out.println("1.2 Pop elements from stack: ");
        while (!stack.isEmpty()){
            System.out.printf("%d",stack.pop());
        }
        System.out.println("\n 1.3 Size of stack after pop operations: "+stack.size());
    }
}
