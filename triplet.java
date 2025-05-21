public class triplet {
    public static void main(String[] args) {
        int a[]={1,4,5,6,3};
        int targetsum=12;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                for(int k=j+1;k<a.length;k++){
                    if(a[i]+a[j]+a[k]==targetsum){
                        System.out.print("The triplet are: "+a[i]);
                        System.out.print(","+a[j]);
                        System.out.println(","+a[k]);
                    }
                }
            }
            System.out.println();
        }

    }
}
