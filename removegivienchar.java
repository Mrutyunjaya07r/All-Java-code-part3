public class removegivienchar {
    public static void main(String[] args) {
        String str="Heallo";
        char removechar='o';
        for(int i=0;i<=str.length()-1;i++){
            if(str.charAt(i)==removechar){
                for(int j=0;j<i;j++){
                    System.out.print(str.charAt(j));
                }
                for(int k=i+1;k<str.length();k++){
                    System.out.print(str.charAt(k));
                }
            }
        }
    }
}
