import java.util.HashSet;

public class ex2 {
    public static void main(String[] args) {
        int arr[]={3,9,1,10,4,20,2};
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            hs.add(arr[i]);
        }
        System.out.println(hs);
        int longestcon=0;
        for(int i=0;i<arr.length;i++){
            if(!hs.contains(arr[i]-1)){
                int no=arr[i];
                while (hs.contains(no)){
                    no++;
                }
                if(longestcon<no-arr[i]){
                    longestcon=no-arr[i];
                }
            }
        }
        System.out.println(longestcon);
    }
}
