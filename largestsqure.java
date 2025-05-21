public class largestsqure {
    public static void main(String[] args) {
        int a[]={-10,-5,-2,1,2,5,6,8};
        int left=0;
        int right=a.length-1;
        int k[]=new int[a.length];
        while (left<=right){
            if(Math.abs(a[left])> Math.abs(a[right])){
               k[left]=a[left]*a[left];
               left++;
            }
            else {
                k[right]=a[right]*a[right];
                right--;
            }
        }
        for(int i=0;i<k.length;i++){
            System.out.print(k[i]+" ");
        }
        System.out.println();
    }
}
