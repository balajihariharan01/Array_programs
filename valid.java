import java.util.*;

public class Main {
   

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.nextLine();
        Stack<Character> stack = new Stack<>();
           for (char ch : expr.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' && (stack.isEmpty() || stack.pop() != '(')) {
                 System.out.println("Not Balanced");
            } else if (ch == '}' && (stack.isEmpty() || stack.pop() != '{')) {
                 System.out.println("Not Balanced");
            } else if (ch == ']' && (stack.isEmpty() || stack.pop() != '[')) {
                 System.out.println("Not Balanced");
            }
        }
        System.out.println(stack.isEmpty() ? "Balanced" : "Not Balanced");
    }
}
