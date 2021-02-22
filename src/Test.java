import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<Integer>();

        //System.out.println("X4");

        stack.add(1);
        stack.add(2);
        stack.add(3);
        stack.add(4);
        stack.add(5);

        ArrayList<String> al = new ArrayList<>();

        System.out.println("X3");

        stack.printAll();

        System.out.println(stack.remove());
        System.out.println(stack.remove());
        System.out.println(stack.remove());
        System.out.println(stack.remove());
        System.out.println(stack.remove());

        Stack<String> stringStack = new Stack<>();

        stringStack.add("Ola");
        stringStack.add("Ania");
        stringStack.add("Magda");

        stringStack.printAll();

        System.out.println(stringStack.remove());

        stringStack.printAll();

    }
}
