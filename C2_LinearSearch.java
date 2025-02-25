import java.util.Scanner;

public class C2_LinearSearch {

    // Linear Search Method
    public int C2_Linear_Search(int[] arr, int key) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (key == arr[i]) {
                System.out.println("Element found at index: " + i);
                return i;
            }
        }
        System.out.println("Element not found");
        return -1;
    }

    public static void main(String[] argñs) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a key:");
        int key = sc.nextInt();

 
        C2_LinearSearch searchObj = new C2_LinearSearch();
        searchObj.C2_Linear_Search(arr, key);

        sc.close();
    }
}
