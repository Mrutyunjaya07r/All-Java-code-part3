public class q12 {
    public static void main(String[] args) {
        String s="hellohi";
        int arr[]=new int[127];
        char repchar[]=new char[s.length()];
        int temp=0;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]=arr[s.charAt(i)]+1;
        }
        char ch=' ';
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)]==1){
                repchar[temp]=s.charAt(i);
                temp++;
            }
        }
        for(int i=0;i<repchar.length;i++){
            System.out.print(repchar[i]+" ");
        }
        System.out.println();
        System.out.println("The first non repeting charater is: "+repchar[0]);
    }
}
