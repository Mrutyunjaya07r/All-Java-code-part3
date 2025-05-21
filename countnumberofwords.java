public class countnumberofwords {
    public static void main(String[] args) {
        String s="hello my name is mrutyunjaya";
        int count=1;
        for(int i=0;i<=s.length()-1;i++){
            if(s.charAt(i)==' '){
                count=count+1;
            }
        }
        System.out.println("The number of words is: "+count);
    }
}
