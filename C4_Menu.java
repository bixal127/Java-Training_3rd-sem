import java.util.ArrayList;;

public class C4_Menu {
    ArrayList<Food> foodlist;

    public C4_Menu() {
        this.foodlist = new ArrayList<>();
    }

    public C4_Menu(ArrayList<Food> foodlist) {
        this.foodlist = foodlist;

    }

    public ArrayList<Food> getFoodList() {
        return this.foodlist;
    }

    public void addFood(Food food) {
        this.foodlist.add(food);
    }

    public void removeFood(String name) {
        for (Food food : foodlist)
            if (food.getName().equals(name)) {
                foodlist.remove(food);
                break;
            }
    }

    public static void main(String[] args) {

    }
}