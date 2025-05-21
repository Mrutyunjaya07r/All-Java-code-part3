public class lastocc {
    public static void main(String[] args) {
        int a[]={1,2,3,5,9,10,2,9,8,9,10,11};
        int elem=10;
        int lastocc=0;
        for(int i=0;i<a.length;i++){
            if(elem==a[i]){
                System.out.println("The index it present is: "+i);
                if(lastocc<i){
                    lastocc=i;
                }
            }
        }
        System.out.println("The last occ is: "+lastocc);
    }
}
