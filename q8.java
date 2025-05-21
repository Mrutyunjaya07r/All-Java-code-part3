public class q8 {
    public static void main(String[] args) {
        String s="Hello my name is ritik";
        String ans="";
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(s.charAt(i)!=' '){
                sb=sb.append(ch);
            }
            else {
                sb=sb.reverse();
                ans+=sb;
                ans+=" ";
                sb=new StringBuilder();
            }
        }
        sb=sb.reverse();
        ans+=sb;
        System.out.println(ans);
    }
}
