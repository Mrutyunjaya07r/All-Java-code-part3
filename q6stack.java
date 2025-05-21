import java.util.Arrays;
import java.util.Stack;

public class q6stack {
    public static int[] nextGreater(int arr[]) {
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        int res[] = new int[n];

        res[n - 1] = -1;
        s.push(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            while (!s.isEmpty() && arr[i] >= s.peek()) {
                s.pop();
            }
            if(s.size()==0) res[i]=-1;
            else res[i] =s.peek();
            s.push(arr[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 1, 8, 6, 3, 4};
        // Expected output: [3, 8, 8, 8, -1, -1, 4, -1]
        System.out.println(Arrays.toString(nextGreater(arr)));
    }
}
