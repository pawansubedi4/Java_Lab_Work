
import java.util.Scanner;
import java.util.Stack;
class prefix1 {
    @SuppressWarnings("unused")
    String infix;
    @SuppressWarnings("FieldMayBeFinal")
    private StringBuilder prefix = new StringBuilder();
    @SuppressWarnings("FieldMayBeFinal")
    private Stack<Character> obj = new Stack<>();

    @SuppressWarnings("static-access")
    public prefix1(String infix) {
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
    public String topostfix(String infix1) {
        infix1 = infix1.trim();
        StringBuilder postfix=new StringBuilder();
        char[] arr = infix1.toCharArray();
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
        return postfix.toString();
    }

  
    public void toprefix() {
        StringBuilder revinfix = new StringBuilder(infix).reverse();
        char[] arr = revinfix.toString().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') arr[i] = ')';
            else if (arr[i] == ')') arr[i] = '(';
        }
        String reversedInfix = String.valueOf(arr);
        String postfixString = topostfix(reversedInfix);
        prefix = new StringBuilder(postfixString).reverse();
        System.out.println("The prefix is: " + prefix.toString());
    }

}

@SuppressWarnings("unused")
class demo12321212232 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your infix1 expression : ");
        String infix = sc.nextLine();
        prefix1 p = new prefix1(infix);
        p.toprefix();
    }
}


