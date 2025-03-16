import java.util.Scanner;

public class Practice_Largest{
    int a[];

    public static int largest(int[] arr) {
        int n = arr.length;
        int large = 0;
        for (int i = 0; i < n; i++) {
            if (large < arr[i] && arr[i] % 2 != 0) {
                large = arr[i];
            }
        }
        return large;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Numbers of Array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter a number");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
      
        
          int res= largest(array);
if (res <= 0 ) {
    System.out.println("Null");
}
else{
        System.out.println("Largest number " +res);
}
    }
}
