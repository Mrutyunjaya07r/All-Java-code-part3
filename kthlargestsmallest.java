public class kthlargestsmallest {
    public static void main(String[] args) {
        int a[]={5,8,10,1,3,6,2};
        int k=3;
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<=k;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        for(int i=0;i<=k;i++){
            if(min>a[i]){
                min=a[i];
            }
        }
        System.out.println("The kth largest is: "+max);
        System.out.println("The kth smallest is: "+min);
    }
}
