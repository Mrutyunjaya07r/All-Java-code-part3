public class q16 {
    public static void main(String[] args) {
        String str="PhySiCS";
        String ans="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            int ascii=(int) ch;
            if(ascii<97){
                ascii+=32;
                char sr=(char) ascii;
                ans+=sr;
            }
            else {
                ascii -= 32;
                char sr = (char) ascii;
                ans += sr;
            }
        }
        System.out.println(str);
        System.out.println(ans);
    }
}
