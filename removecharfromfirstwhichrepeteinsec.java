public class removecharfromfirstwhichrepeteinsec {
    public static void main(String[] args) {
        String s1="mrutyunjaya";
        String s2="mruty";
        for(int i=0;i<=s1.length()-1;i++){
            for(int j=0;j<=s2.length()-1;j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    s1 = s1.replace(s1.charAt(i), ' ');
                    s1 = s1.replaceAll("\\s", "");
                }
            }
        }
        System.out.println(s1);

    }
}
