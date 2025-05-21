import java.util.Arrays;
import java.util.Stack;

public class q7stack {
    public static int[] previousGreater(int arr[]) {
        int n = arr.length;
        Stack<Integer> s = new Stack<>();
        int res[] = new int[n];

        res[0] = -1;
        s.push(arr[0]);

        for (int i = 1; i < n; i++) {  // Fixed condition
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
        // Expected output: [-1, -1, 3, 2, -1, 8, 6, 6]
        System.out.println(Arrays.toString(previousGreater(arr)));
    }
}
