public class numberof1and0m2 {
    public static void main(String[] args) {
        int a[]={1,0,0,1,0,1,1,0,0};
        int left=0;
        int right=a.length-1;
        while (left<right){
            if(a[left]==1 && a[right]==0){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
            if(a[left]==0){
                left++;
            }
            if(a[right]==1){
                right--;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
