
import java.util.Scanner;
import java.util.Stack;
class prefix {
    @SuppressWarnings("unused")
    String infix;
    @SuppressWarnings("FieldMayBeFinal")
    private StringBuilder prefix = new StringBuilder();
    @SuppressWarnings("FieldMayBeFinal")
    private Stack<Character> obj = new Stack<>();

    public prefix(String infix) {
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

    public void toprefix() {
        infix = infix.trim();
        char[] arr = infix.toCharArray();
        for (int i = arr.length-1; i>=0; i--) {
            char c = arr[i];
            if (isOperator(c)) {
                while (!obj.isEmpty() && isOperator(obj.peek())&& prioty(obj.peek()) >= prioty(c)) {
                    prefix.append(obj.pop());
                }
                obj.push(c);
            } else if (isparenthis(c)) {
                if (c == (')')) {
                    obj.push(c);
                } else if (c == '(') {
                    while (!obj.isEmpty() && (obj.peek() != '(')) {
                        prefix.append(obj.pop());
                    }
                    obj.pop();
                }
            } else {
                prefix.append(c);
            }
        }
        while (!obj.isEmpty()) {
            prefix.append(obj.pop());
        }
        System.out.println("the prefix eqn is " + prefix.toString());
    }
}

@SuppressWarnings("unused")
class demo12321212 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your infix expression : ");
        String infix = sc.nextLine();
        prefix p = new prefix(infix);
        p.toprefix();
    }
}

