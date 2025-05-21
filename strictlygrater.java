public class strictlygrater {
    public static void main(String[] args) {
        int a[]={1,2,3,5,9,10,2,9,8,9,10,11};
        int x=5;
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>x){
                count++;
            }
        }
        System.out.println("The number of element is grter then x is: "+count);

    }
}
