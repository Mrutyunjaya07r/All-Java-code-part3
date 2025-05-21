public class q4 {
    public static void main(String[] args) {
        String s1="hellomystudent";
        String s2="hisir";

        for(int i=0;i<s2.length();i++){
            for(int j=0;j<s1.length();j++){
                if(s1.charAt(j)!=s2.charAt(i)){
                    System.out.print(s1.charAt(i));
                }
            }
        }
    }
}
