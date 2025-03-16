import java.util.ArrayList;

class Food {
    private String name;
    private double price;

    public Food(String name, double price) {
        this.name = name;
        this.price = price;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString(){
        return "\n{Name: " + name + " Price: "+ price+" }";
    }
}

public class C4_FoodMenuOrder {

    public static void main(String[] args) {
        
        ArrayList<Food> list = new ArrayList<>(5);

        list.add(new Food("Momo", 180));
        list.add(new Food("Chowmin", 150));
        list.add(new Food("Samosa", 100));
        list.add(new Food("Doughnut", 80));
        list.add(new Food("Rice", 150));


        for(Food food : list){
            System.out.println(food);
        }
        // System.out.println(list);

}

}
