import java.util.Stack;
import java.util.Arrays;

public class q4stacj {
    public static int[] removeContinuousElement(int arr[]) {
       Stack<Integer> s=new Stack<>();
       for(int i=0;i<arr.length;i++){
           if(s.isEmpty() || arr[i]!=s.peek()){
               s.push(arr[i]);
           }
           else if(arr[i]==s.peek()){
               if(arr[i]!=arr[i+1] && i<arr.length-1){
                   s.pop();
               }
           }
       }
       int res[]=new int[s.size()];
       for(int i=res.length-1;i>=0;i--){
           res[i]=s.pop();
       }
       return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2};
        // Expected output: [1, 3, 5, 2]
        System.out.println(Arrays.toString(removeContinuousElement(arr)));
    }
}
