import java.util.Arrays;

public class q5stack {
    public static int[] nextgrater(int arr[]){
        int n=arr.length;
        int res[]=new int[arr.length];
        //by array method
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    res[i]=arr[j];
                    break;
                }
                else {
                    res[i]=-1;
                }
            }
        }
        return res;

    }
    public static void main(String[] args) {
        int arr[]={1,3,2,1,8,6,3,4};
        //3,8,8,8,-1,-1,4,-1
        System.out.println(Arrays.toString(nextgrater(arr)));
    }
}
