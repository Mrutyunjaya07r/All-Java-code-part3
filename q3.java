public class q3 {
    public static void main(String[] args) {
        String s="hellohi";
        int arr[]=new int[127];

        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]=arr[s.charAt(i)]+1;
        }
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)]>1){
                System.out.print(s.charAt(i)+" ");
            }
        }
    }
}
