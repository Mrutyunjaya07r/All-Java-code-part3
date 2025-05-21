public class copy {
    public static void main(String[] args) {
        int a[]={1,3,2,10,4,5,6,9};
        int temp[]=new int[a.length];

        for(int i=0;i<a.length;i++){
            temp[i]=a[i];
        }
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
        System.out.println();
    }
}
