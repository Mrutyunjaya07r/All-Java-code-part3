public class anagram {
    public static void main(String[] args) {
        String s="anagram";
        String t="nagrama";
        int arr[]=new int[26];
        System.out.println(anagramstring(s,t));

    }
    public static boolean anagramstring(String s,String t) {
        int arr[] = new int[127];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i)] = arr[s.charAt(i)] + 1;
        }
        for (int j = 0; j < t.length(); j++) {
            arr[t.charAt(j)] = arr[t.charAt(j)] - 1;
        }
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[s.charAt(i)] == 0) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }
}