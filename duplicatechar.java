public class duplicatechar {
    public static void main(String[] args) {
        String str="hellobubbly";
        int arr[]=new int[127];
        for(int i=0;i<=str.length()-1;i++){
            arr[str.charAt(i)]=arr[str.charAt(i)]+1;
        }
        char c =' ';
        for(int i=0;i<=str.length()-1;i++){
            if(arr[str.charAt(i)]>1){
              c=str.charAt(i);
              System.out.println("The repeted char is: "+c);
            }
        }
    }
}
