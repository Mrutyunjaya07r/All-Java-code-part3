public class praticeque {

    public static void main(String[] args) {
        int arr[]={12,-1,-7,8,-15,30,16,28};
        int k=3;
        int res[]=new int[arr.length-k+1];


        for(int i=0;i<arr.length-k;i++){
            for(int j=i;j<k+i;j++){
                if(arr[j]<0){
                    res[i]=arr[j];
                    break;
                }
            }
        }
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}
