public class numberof0and1m1 {
    public static void main(String[] args) {
        int a[]={1,0,0,1,0,1,1,0,0};
        int count=0;
        int ans[]=new int[a.length];
        for (int i=0;i<a.length;i++){
            if(a[i]==0){
                count++;
            }
        }
        for(int i=0;i<ans.length;i++){
            if(i<count){
                ans[i]=0;
            }
            else {
                ans[i]=1;
            }
        }
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
        System.out.println();
    }
}
