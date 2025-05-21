public class swapping {
    public static void main(String[] args) {
        int a=10;
        int b=9;

        System.out.println("Original value of a is: "+a);
        System.out.println("Original value of b is: "+b);

        /*int temp=a;
        a=b;
        b=temp;
        System.out.println("Now a value is: "+a);
        System.out.println("Now b value is: "+b);*/
        swapm2(a,b);
    }
    public static void swapm2(int a,int b){
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Now a value in m2 is: "+a);
        System.out.println("Now b value in m2 is: "+b);
    }
}
