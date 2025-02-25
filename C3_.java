
class Car {

    public void startEngine() {
        System.out.println("Engine started");
    }

    public void closeEngine() {
        System.out.println("Engine Off");
    }
}

    class BWM extends Car {
 public void Engine(){
    super.startEngine();
    super.closeEngine();
 }
    }

    class Toyata extends Car {
  
    }

public class C3_ {

    public static void main(String[] args) {
     Toyata TOYATA = new Toyata();
     TOYATA.startEngine();
     TOYATA.closeEngine();

     BWM Bmw = new BWM();
     Bmw.Engine();

    }

}
