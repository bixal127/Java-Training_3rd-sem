public class C1_LargestNumber {
    int[] a;

    public int display(int[] arr) {
        int n = arr.length;
        int large = arr[0];
        for (int i = 0; i < n; i++) {
            if (large < arr[i]) {
                large = arr[i];
            }
        }
        return large;
    }

    public static void main(String[] args) {
        C1_LargestNumber newnumber = new C1_LargestNumber();
        int[] numbers = { 3, 3, 1, 12, 2, 1 };

        int result = newnumber.display(numbers);

        System.out.println(result);
    }
}