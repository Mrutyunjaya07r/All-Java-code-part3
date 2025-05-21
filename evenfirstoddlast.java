public class evenfirstoddlast {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9,10};
        int left=0;
        int right=a.length-1;
        while (left<right){
            if(a[left]%2 !=0 && a[right]%2==0){
                int temp=a[left];
                a[left]=a[right];
                a[right]=temp;
                left++;
                right--;
            }
            if(a[left]%2==0){
                left++;
            }
            if(a[right]%2==1){
                right--;
            }
        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
