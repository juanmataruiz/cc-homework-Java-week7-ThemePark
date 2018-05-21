import java.util.ArrayList;

public abstract class Ride implements IRide {

    private String name;
    private double price;
    private int minAge;
    private double minHeight;
    private ArrayList<IRide> rides;


    public Ride(String name, double price, int minAge, double minHeight) {
        this.rides = new ArrayList<>();
        this.name = name;
        this.price = price;
        this.minAge = minAge;
        this.minHeight = minHeight;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getMinAge() {
        return minAge;
    }

    public double getMinHeight() {
        return minHeight;
    }

    public void


}
