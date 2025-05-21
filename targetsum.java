public class targetsum {
    public static void main(String[] args) {
        int a[]={4,6,3,5,8,2};
        int targetsum=7;
        for(int i=0;i<a.length;i++){
           for(int j=i+1;j<a.length;j++){
               if(a[i]+a[j]==targetsum){
                   System.out.print("The pairs are: "+a[i]);
                   System.out.print(","+a[j]);
               }
           }
            System.out.println();
        }
    }
}
