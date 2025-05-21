public class rotatebyk {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int k=3;
        int n=a.length;
        for(int i=0;i<a.length;i++){
            k=k%n;
            if(i<k){
                System.out.print(a[n+i-k]+" ");
            }
            else {
                System.out.print(a[i-k]+" ");
            }
        }
    }
}
