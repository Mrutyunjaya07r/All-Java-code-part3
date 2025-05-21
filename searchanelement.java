public class searchanelement {
    public static void main(String[] args) {
        int a[]={2,3,4,6,1,9,8};
        int element=10;
        int count=0;
        for(int i=0;i<a.length;i++){
            if(element==a[i]){
                System.out.println("The element is present at: "+i);
                count=count+1;
            }
        }
        if(count==0){
            System.out.println("Not found");
        }
    }
}
