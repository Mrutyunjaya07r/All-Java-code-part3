public class palindrome {
    public static void main(String[] args) {
        String s="racecar";

        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
        if(s.equals(rev)){
            System.out.println("It is an palindrome String");
        }
        else{
            System.out.println("Not an palindrome");
        }
    }
}
