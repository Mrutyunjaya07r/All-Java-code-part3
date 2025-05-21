public class quicksort {
    public static void main(String[] args) {
        int a[] = {12, 2, 5, 77, 4};
        int lengtha = a.length;
        quicksortrecur(a, 0, lengtha - 1);
        printarr(a);
    }

    public static int partition(int a[], int low, int high) {
        int pivot = a[(low + high) / 2];
        while (low <= high) {
            while (a[low] < pivot) {
                low++;
            }
            while (a[high] > pivot) {
                high--;
            }
            if (low <= high) {
                int temp = a[low];
                a[low] = a[high];
                a[high] = temp;
                low++;
                high--;
            }
        }
        return low;
    }

    public static void quicksortrecur(int a[], int low, int high) {
        if (low < high) {
            int pi = partition(a, low, high);
            quicksortrecur(a, low, pi - 1);
            quicksortrecur(a, pi, high);
        }
    }

    public static void printarr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
