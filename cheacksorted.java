public class cheacksorted {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7};
        boolean cheack=true;
        for(int i=1;i<a.length;i++){
            if(a[i]<a[i-1]){
                cheack=false;
                break;
            }
        }
        System.out.println("The array is sorted: "+cheack);
    }
}
