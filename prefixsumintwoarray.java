public class prefixsumintwoarray {
    public static void main(String[] args) {
        int a[]={2,1,3,4,5};
        int prefsum[]=new int[a.length];
        prefsum[0]=a[0];
        for(int i=1;i<prefsum.length;i++){
            prefsum[i]=prefsum[i-1]+a[i];
        }

        System.out.println("The prefix sum is: ");
        for(int i=0;i<prefsum.length;i++){
            System.out.print(prefsum[i]+" ");
        }
        System.out.println();
    }
}
