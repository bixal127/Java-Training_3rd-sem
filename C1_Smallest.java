import java.util.Scanner;

public class C1_Smallest {
    int[] a;

    public int display(int[] arr) {
        int n = arr.length;
        int small = arr[0];
        for (int i = 0; i < n; i++) {
            if (small > arr[i]) {
                small = arr[i];
            }
        }
        return small;
    }

    public static void main(String[] args) {
        C1_Smallest newnumber = new C1_Smallest();
        
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter ");
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0; i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(newnumber.display(arr));
    }
}