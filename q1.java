public class q1 {
    public static void main(String[] args) {
        String s="helllllo";
        int max=-1;
        int arr[]=new int[127];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            arr[ch]=arr[ch]+1;
        }
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)]>max){
                max=arr[s.charAt(i)];
            }
        }
        System.out.println(max);
    }
}
