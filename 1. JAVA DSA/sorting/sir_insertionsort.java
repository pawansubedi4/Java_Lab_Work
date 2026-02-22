public class sir_insertionsort {
    public static void main(String[] args) {
        int arr[] = {1, 23, 45, 12, 34, 56, 12, 890, 45, 123, 45};
        for (int i = 0; i < arr.length; i++) {
            int temp = arr[i];
            int j = i;

            while (j > 0 && temp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = temp;
        }
    }
}
