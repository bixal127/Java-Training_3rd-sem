import java.util.Scanner;


class Program {

  public static boolean lessThanOrEqualToZero(int num) {
        if (num > 0) {
            return false;
        }
        {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int nums = sc.nextInt();
        sc.close();
        boolean result = lessThanOrEqualToZero(nums);
        System.out.println(result);
    }
}