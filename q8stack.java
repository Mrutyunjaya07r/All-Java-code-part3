import java.util.Stack;

public class q8stack {
    public static int longestHistogram(int arr[]) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int nse[] = new int[n];
        int pse[] = new int[n];

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        while (!st.isEmpty()) st.pop();

        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && arr[i] <= arr[st.peek()]) {
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int area = arr[i] * (nse[i] - pse[i] - 1);
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int arr[] = {5, 2, 4, 6, 3, 5};
        System.out.println(longestHistogram(arr));
    }
}
