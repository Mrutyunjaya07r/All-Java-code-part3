public class allcombinationofstring {
    public static void main(String[] args) {
        String s="ABC";
        System.out.println("All combination of string are: ");
        for(int i=0;i<=s.length()-1;i++){
            System.out.println(s.charAt(i)+s.substring(0,i)+s.substring(i+1));
        }
    }
}
