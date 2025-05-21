public class mergesort {
    int array[];
    int temparr[];
    int length;
    public static void main(String[] args) {
        int arr[]={12, 2, 5, 77, 4};
        mergesort ms=new mergesort();
        ms.sort(arr);
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

    }
    public void sort(int arr[]){
        this.array=arr;
        this.length=arr.length;
        this.temparr=new int[length];
        diviedArray(0,length-1);
    }
    public void diviedArray(int lower,int higher){
        if(lower<higher){
            int middle=lower+(higher-lower)/2;
        diviedArray(lower,middle);
        diviedArray(middle+1,higher);
        mergeArray(lower,middle,higher);
        }

    }
    public  void mergeArray(int lower,int middle,int higher){
        for (int i=lower;i<=higher;i++){
            temparr[i]=array[i];
        }
        int i=lower;
        int j=middle+1;
        int k=lower;
        while (i<=middle && j<=higher){
            if(temparr[i]<=temparr[j]){
                array[k]=temparr[i];
                i++;
            }
            else {
                array[k]=temparr[j];
                j++;
            }
            k++;
        }
        while (i<=middle){
            array[k]=temparr[i];
            k++;
            i++;
        }
    }

}
