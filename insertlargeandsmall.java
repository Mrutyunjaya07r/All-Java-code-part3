public class insertlargeandsmall {
    public static void main(String[] args) {
        int a[]={5,8,1,3,6,2};
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("The max is: "+max);
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println("The min is: "+min);
        int newarray[]={min,max};
        for(int i=0;i<newarray.length;i++){
            System.out.print(newarray[i]+" ");
        }
        System.out.println();
    }
}
