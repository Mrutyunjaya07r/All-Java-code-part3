public class finduniqueelement {
    public static void main(String[] args) {
        int a[]={1,2,3,4,3,2,1};
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    a[i]=-1;
                    a[j]=-1;
                }
            }
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                System.out.println("The unique element is: "+a[i]);
            }
        }
    }
}
