public class reverseastring {
    public static void main(String[] args) {
        String s="Mrutyunjaya swain";
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println("The reverse of string is: "+rev);
    }
}
