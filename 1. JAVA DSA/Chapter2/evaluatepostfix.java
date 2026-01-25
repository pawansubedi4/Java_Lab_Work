import java.util.Stack;
public class evaluatepostfix {
    public boolean isoperater(char c){
        return c=='+'||c=='-'||c=='*'||c=='/';
    }
    @SuppressWarnings("UnnecessaryContinue")
    public void calculate(String post){
        char[] arr=post.toCharArray();
        Stack<Integer> s=new Stack<>();
        for(char c:arr){
            if(isoperater(c))
            {
                int opt2=s.pop();
                int opt1=s.pop();
                switch(c){
                    case '+' -> s.push((opt1+opt2));
                    case '-' -> s.push((opt1-opt2));
                    case '*' -> s.push((opt1*opt2));
                    case '/' -> s.push((opt1/opt2));
                    default -> {
                    }    
                }
            }
            else if(c==' '){
                continue;
            }
            else{
                s.push(Integer.valueOf(String.valueOf(c)));
            }
        }
        System.out.println("the result is "+s.pop());
    }
}
@SuppressWarnings("unused")
class fdsfdd{
    public static void main(String[] args) {
        evaluatepostfix obj=new evaluatepostfix();
        String j="1 2 3 * + 4 5 / - 6 +";
        obj.calculate(j);   
    }
}
