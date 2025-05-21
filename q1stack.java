import java.util.Stack;

public class q1stack {
    public static boolean balancebracket(String str){
        int n=str.length();
        Stack<Character> s=new Stack<>();
        for(int i=0;i<n;i++){
            char ch=str.charAt(i);
            if(ch=='('){
                s.push(ch);
            }
            else{
                if(s.size()==0){
                    return false;
                } else if (s.peek()=='(') {
                    s.pop();
                }
            }
        }
        if(s.size()>0){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        String str="(())()(";
        System.out.println("The given bracket string is balance: "+balancebracket(str));
    }
}
