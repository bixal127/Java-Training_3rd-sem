class Subject {
    // Private fields
    private int Math;
    private int science;
    private int social;

    // Setter and getter for Math
    public void setMath(int marks) {
        this.Math = marks;
    }

    public int getMath() {
        return this.Math;
    }

    public void setScience(int marks) {
        this.science = marks;
    }

    public int getScience() {
        return this.science;
    }

    public void setSocial(int marks) {
        this.social = marks;
    }

    public int getSocial() {
        return this.social;
    }
}

public class C4_AccessModifier {
    public static void main(String[] args) {
        Subject sc = new Subject();

        sc.setMath(33);
        sc.setScience(55);
        sc.setSocial(50);

        System.out.println("Math Marks: " + sc.getMath());
        System.out.println("Science Marks: " + sc.getScience());
        System.out.println("Social Marks: " + sc.getSocial());
    }
}
