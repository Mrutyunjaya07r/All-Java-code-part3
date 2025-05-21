public class q10 {
    public static void main(String[] args) {
        String s="ABC";
        for(int i=0;i<=s.length()-1;i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }
}
