public class selectionsort {
    public static void main(String[] args) {
        int a[]={12,2,5,77,4};
        int temp;
        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
               temp=a[i];
                a[i]=a[min];
                a[min]=temp;

        }
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
}
