public class q13 {
    public static void main(String[] args) {
       String s1="Mrutyunjaya";
       String s2="Swain";
       commaseperated(s1,s2);
    }
    public static void commaseperated(String s1,String s2){
        s1=String.join(",",s1,s2);
        System.out.println(s1);
    }
}
