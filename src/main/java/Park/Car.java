package Park;

public class Car {

    private String id;
    private boolean isLargeCar;

    public Car(String id, boolean isLargeCar) {
        this.id = id;
        this.isLargeCar = isLargeCar;
    }

    public String getId() {
        return id;
    }

    public boolean isLargeCar() {
        return isLargeCar;
    }
}
