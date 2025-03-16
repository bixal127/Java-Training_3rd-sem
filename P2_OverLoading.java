
class Operation {

    // parameters different hunxa jastai (type, number) class name same hunxa
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class P2_OverLoading {
    public static void main(String[] args) {
        Operation op = new Operation();
        System.out.println(op.add(10, 20));
        System.out.println(op.add(10, 20, 30));
        System.out.println(op.add(10.5, 20.20));

    }
}
