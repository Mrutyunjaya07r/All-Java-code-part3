public class ex {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int i=0;
        int j=arr.length-1;
        int temp[]=new int[arr.length];
        for(int k=0;k<arr.length;k++){
            temp[i]=arr[j];
            i++;
            j--;
        }
        for(int l=0;l<temp.length;l++){
            System.out.print(temp[l]);
        }
        System.out.println();
    }
}
