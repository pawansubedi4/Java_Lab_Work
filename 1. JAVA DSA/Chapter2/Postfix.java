
import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    @SuppressWarnings("unused")
    String infix;
    @SuppressWarnings("FieldMayBeFinal")
    private StringBuilder postfix = new StringBuilder();
    @SuppressWarnings("FieldMayBeFinal")
    private Stack<Character> obj = new Stack<>();

    public Postfix(String infix) {
        this.infix = infix;
    }

    public boolean isOperator(char a) {
        return (a == '+' || a == '-' || a == '*' || a == '/');
    }

    public int prioty(char a) {
        if (a == '+' || a == '-') {
            return 1;
        } else {
            return 2;
        }
    }

    public boolean isparenthis(char a) {
        return (a == '(' || a == ')');

    }

    public void topostfix() {
        infix = infix.trim();
        char[] arr = infix.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if(Character.isDigit(c)){
                while(i<arr.length&&Character.isDigit(arr[i])){
                    postfix.append(arr[i]);
                    i++;
                }
                postfix.append(' ');
                i--;
            }
            else if (isOperator(c)) {
                while (!obj.isEmpty() && isOperator(obj.peek())&& prioty(obj.peek()) >= prioty(c)) {
                    postfix.append(obj.pop());
                }
                obj.push(c);
            } else if (isparenthis(c)) {
                if (c == ('(')) {
                    obj.push(c);
                } else if (c == ')') {
                    while (!obj.isEmpty() && (obj.peek() != '(')) {
                        postfix.append(obj.pop());
                    }
                    obj.pop();
                }
            } else {
                postfix.append(c);
            }
        }
        while (!obj.isEmpty()) {
            postfix.append(obj.pop());
        }
        System.out.println("the postfix eqn is " + postfix.toString());
    }
}

@SuppressWarnings("unused")
class demo123212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your infix expression : ");
        String infix = sc.nextLine();
        Postfix p = new Postfix(infix);
        p.topostfix();
    }
}
