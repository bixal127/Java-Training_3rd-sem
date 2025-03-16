class Food {

    private String name;
    private int price;

    public Food() {
        // Value diye pani na diye pani yei assgin garxa
        // name = "";
        // price = 0;

    }

    public Food(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }
}

public class C4_Food {

}
