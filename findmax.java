public class findmax {
    public static void main(String[] args) {
        int a[]={2,1,5,8,9,4};
        int max=0;
        for(int i=0;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println("The maximum is: "+max);
    }
}
