public class firstnonrepetingchar {
    public static void main(String[] args) {
        String s="hellohi";
        int arr[]=new int[127];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]=arr[s.charAt(i)]+1;
        }
        char ch[]=new char[s.length()];
        int temp=0;
        for(int i=0;i<s.length();i++){
            if(arr[s.charAt(i)]==1){
               ch[temp]=s.charAt(i);
               temp++;
            }
        }
        for(int i=0;i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }
        System.out.println();
        System.out.println("The first non repeteing charter is: "+ch[0]);
    }
}
