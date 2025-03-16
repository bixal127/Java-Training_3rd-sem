public class BuubleSorting {
    static void BubbleSort(int arr[], int n)
     {
        boolean isTrue;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            isTrue = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isTrue = true;
                }
                if (isTrue == false) {
                    break;
                }
            }
        }
    }

    static void Display(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

    }



    public static void main(String[] args) {

        int arr[] = { 3, 2, 3, 5, 7, 4 };
        int n = arr.length;
        BubbleSort(arr, n);
        System.out.print(" Number after Bubble sort: ");
        Display(arr, n);
    }
}
