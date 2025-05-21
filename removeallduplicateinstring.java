public class removeallduplicateinstring {
    public static void main(String[] args) {
        String s="Hellobubbly";
        int arr[]=new int[127];
        for(int i=0;i<=s.length()-1;i++){
            arr[s.charAt(i)]=arr[s.charAt(i)]+1;
        }
        char c=' ';
        for(int i=0;i<=s.length()-1;i++){
            if(arr[s.charAt(i)]>1){
                c=s.charAt(i);
               s=s.replace(s.charAt(i),' ');
               s=s.replaceAll("\\s","");
            }
        }
        System.out.println(s);
    }
}
