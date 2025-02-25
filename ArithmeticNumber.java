class Practice {
// int a;
// int b;

public void Addition(int a, int b){
    int sum = a+b;
    
    System.out.println("Sum is :"+sum);
}

public void multilication(int a , int b){
    int product = a*b;
    System.out.println(product);
}

}


 public class ArithmeticNumber extends Practice{


    public static void main(String[] args) {
    

Practice arithmetic = new Practice();
arithmetic.Addition(5, 10);


arithmetic.multilication(5, 10);




    }
        
    }   	



