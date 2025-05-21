public class q14 {
    public static void main(String[] args) {
        String s1="cat";
        String s2="act";
        System.out.println("The given two string are anagram: "+anagramstring(s1,s2));
    }
    public static boolean anagramstring(String s1,String s2){
        int arr[]=new int[127];
        if(s1.length()!= s2.length()){
            return false;
        }
        else {
            for(int i=0;i< s1.length();i++){
                arr[s1.charAt(i)]=arr[s1.charAt(i)]+1;
            }
            for(int i=0;i<s2.length();i++){
                arr[s2.charAt(i)]=arr[s2.charAt(i)]-1;
            }
            for (int i=0;i<s1.length();i++){
                if(arr[s1.charAt(i)]==0){
                    return true;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}
