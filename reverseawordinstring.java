public class reverseawordinstring {
    public static void main(String[] args) {
        String s="I am a student of iter";
        String ans="";
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else {
                sb.reverse();
                ans +=sb;
                ans += " ";
                sb=new StringBuilder("");
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);
    }
}
