public class q6 {
    public static void main(String[] args) {
        char ch[]={'h','e','l','l','o'};
       int start=0;
       int end=ch.length-1;
       char temp[]=new char[ch.length];
       for(int i=0;i<ch.length;i++){
           temp[start]=ch[end];
           start++;
           end--;
       }
       for(int i=0;i<temp.length;i++){
           System.out.print(temp[i]);
       }
        System.out.println();
    }
}
