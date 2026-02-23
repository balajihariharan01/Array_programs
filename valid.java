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



2nd way 


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String str = "({[}])";
		Stack<Character> stack = new Stack<>();
		boolean valid = true;
		for(char ch:str.toCharArray())
		{
		    if(ch=='{' || ch=='[' || ch=='(')
		    {
		        stack.push(ch);
		    }
		    else
		    {
		        if(stack.isEmpty())
		        {
		            valid = false;
		            break;
		        }
		        char top = stack.pop();
		        if((ch==']' && top!='[') || (ch=='}' && top!='{') || (ch==')' && top!='('))
		        {
		            valid = false;
		            break;
		        }
		    }
		}
		if(!stack.isEmpty())
		{
		    valid = false;
		    System.out.println(valid);
		}
		else
		{
		    System.out.println(valid);
		}
	}
}
