public class binarysearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,10};
        int item=2;
        int hi=arr.length-1;
        int li=0;
        int mid=(hi+li)/2;
        while (li<=hi){
            if(arr[mid]==item){
                System.out.println("The element is present at: "+mid);
                break;
            }
            else if(item<arr[mid]){
                hi=mid-1;
            }
            else {
                li=mid+1;
            }
            mid=(li+hi)/2;
        }
        if(li>hi){
            System.out.println("Not found");
        }

    }
}
