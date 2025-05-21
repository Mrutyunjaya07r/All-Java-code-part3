public class linearsearch {
    public static void main(String[] args) {
        int arr[]={12, 2, 5, 77, 4};
        int key=1;
        linearSearch(arr,key);

    }
    public static void linearSearch(int a[],int item){
        int count=0;
        for (int i=0;i<a.length;i++) {
            if (a[i] == item) {
                System.out.println("The element is found at position of: " + i);
                count+=1;
            }
        }
        if(count==0){
            System.out.println("Not found");
        }

    }
}
