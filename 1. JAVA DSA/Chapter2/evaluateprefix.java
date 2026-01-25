import java.util.Stack;
public class evaluateprefix {
        public boolean isoperater(char c){
        return c=='+'||c=='-'||c=='*'||c=='/';
    }
    @SuppressWarnings("UnnecessaryContinue")
    public void calculate(String post){
        char[] arr=post.toCharArray();
        Stack<Integer> s=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            char c=arr[i];
            if(isoperater(c))
            {
                int opt1=s.pop();
                int opt2=s.pop();
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
class gguhgui{
    public static void main(String[] args) {
        evaluateprefix obj=new evaluateprefix();
        String prefix = "+*23-45";
        obj.calculate(prefix);
    }
}
