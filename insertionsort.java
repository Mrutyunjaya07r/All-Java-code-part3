public class insertionsort {
    public static void main(String[] args) {
        int temp;
        int a[]={12,2,5,77,4};
        for(int i=0;i<a.length;i++){
            temp=a[i];
            int j=i;
            while (j>0 && a[j-1]>temp){
                a[j]=a[j-1];
                j=j-1;
            }
            a[j]=temp;
        }
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }}
