public class secondlargest {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6,7,8,9};
        int largest=Integer.MIN_VALUE;
        int secondlargest=0;
        for(int i=0;i<a.length;i++){
            if(largest<a[i]){
                secondlargest=largest;
                largest=a[i];
            }
            else if (secondlargest<a[i] && a[i]!=largest ) {
                secondlargest=a[i];
            }
        }
        System.out.println("The second largest is: "+secondlargest);
    }
}
