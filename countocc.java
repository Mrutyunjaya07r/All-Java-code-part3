public class countocc {
    public static void main(String[] args) {
        int a[]={1,2,3,3,6,7,8,9,9,9,10,6,9};
        int elem=9;
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]==elem){
               count++;
            }
        }
        System.out.println("The number of element is: "+count);
    }
}
