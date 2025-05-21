public class q17 {
    public static void main(String[] args) {
        String str = "aaabbbbccdddde";
        int a[] = new int[127];

        for (int i = 0; i < str.length(); i++) {
            a[str.charAt(i)]++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (a[str.charAt(i)] != 0) {
                System.out.print(str.charAt(i)+""+a[str.charAt(i)]);
                a[str.charAt(i)] = 0;
            }
        }
    }
}
