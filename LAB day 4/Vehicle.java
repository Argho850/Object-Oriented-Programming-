public class Vehicle {
    protected String brand = "Nissan";

    public void honk() {
        System.out.println("Tuut, tuut!!");
    }
}
class Car extends Vehicle{
    private String modelName="GTR";
    public static void main(String[] args) {
        Car c = new Car();
        c.honk();
        System.out.println("Model Name: " + c.modelName);
        System.out.println("Brand Name: " + c.brand);
    }
}
