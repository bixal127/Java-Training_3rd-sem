class parent {
    void display() {
        System.out.println("hello");
    }

    void disp() {
        System.out.println("Hi");
    }

    void dis() {
        System.out.println("Huuuuuu");
    }
}

class child extends parent {

    void display() {
        System.out.println("namaste");
    }

    void disp() {
        System.out.println("Nepathi");
    }
}

public class OverRiding {
    public static void main(String[] args) {
        child c = new child();
        c.dis();
        c.disp();
        c.display();
    }
}