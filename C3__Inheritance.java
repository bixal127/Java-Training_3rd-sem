 class C3_Inheritance {
    int a;
    int b;
    int result;

  C3_Inheritance(int a, int b) {
        this.a = a;
        this.b = b;
        result = a + b;
    }

    C3_Inheritance(){
       this.a = 3;
     this.b = 4;
      result = 3;
    }
}

class Child extends C3_Inheritance{


    Child(){
    super();
}


    Child(int a, int b) {
        super(a, b);
    }

}
public class C3__Inheritance {

    public static void main(String[] args) {
        Child p1 = new Child();
        System.out.println(p1.result);

        Child p2 = new Child(2, 3);
        System.out.println(p2.result);
    }
}