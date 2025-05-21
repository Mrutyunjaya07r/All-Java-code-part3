public class splitbycomma {
    public static void main(String[] args) {
        String str="Hello";
        String str2="hi";
        spiltbycommaa(str,str2);
    }
    public static void spiltbycommaa(String s1,String s2){
        s1=String.join(",",s1,s2);
        System.out.println("The comma separated value is: "+s1);
    }
}
