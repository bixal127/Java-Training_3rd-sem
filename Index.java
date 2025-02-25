import java.util.Scanner;

public class Index {



public void displayMsg(String firstText , String secondText){
int  a= 5;
System.out.println(a);
System.out.println(firstText+" "+secondText);
}

public void add(int a, int b){
	System.out.println("Addition: "+ (a+b) );
}

public void less(int c , int d)
{
System.out.println("Less :" + (c-d));
}


public void multiply(int e , int f)
{
System.out.println("Multiply :" + (e*f));
}

public void divide(float g , float h)
{
System.out.println("Divide :" + (g/h));
}


public static void main(String args[]){

String text = "Hello Nepathhya";


int num = 5;
String name = "Bishal Lamichhane";
int grade = 8;
int age = 99;
String Home = "Sunwal";
System.out.println( " My namne is: " + name +"\n From Grade: " + grade +"\n My age: " + age + " \nHome :"+Home);
System.out.println(text);


Index school = new Index();
school.displayMsg("Bishal "," Lamichhane");
school.add(6,5);



Scanner nawa = new Scanner(System.in);
System.out.println("First Number:");
int wow = nawa.nextInt();


System.out.println("Second Number:");
int woww = nawa.nextInt();

Index hi = new Index();
hi.add(wow, woww);


System.out.println("First Number");
int ha = nawa.nextInt();

System.out.println("Second Number ");
int hah = nawa.nextInt();



Index howw = new Index();
 howw.less(ha , hah);

hi.multiply(ha , hah);


Index divi = new Index();
hi.divide(ha , hah);


}
}