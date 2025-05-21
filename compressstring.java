public class compressstring {
    public static void main(String[] args) {
        String s="aaabbbbccdddee";
        String ans="";
        int arr[]=new int[127];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]=arr[s.charAt(i)]+1;
        }
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)!=s.charAt(i+1)){
                System.out.print(arr[s.charAt(i)]);
                System.out.print(s.charAt(i));
            }

        }
        System.out.println(ans);
    }
}
