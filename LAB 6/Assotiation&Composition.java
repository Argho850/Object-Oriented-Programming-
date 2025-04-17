public class AddressInfo {
    String street,city,state,postalCode;

    public AddressInfo(String street, String city,String state,String postalCode)
    {
        this.street=street;
        this.city=city;
        this.state=state;
        this.postalCode=postalCode;
    }
}
class Bus {
    private Driver driver; // Aggregation: Bus can exist without a driver

    Bus(Driver driver) {
        this.driver = driver;
    }

    void showDriver() {
        System.out.println("Bus driver is " + driver.name);
    }
}
class Car {
    private Engine engine; // Composition: Car cannot exist without an Engine

    Car(String engineType) {
        this.engine = new Engine(engineType);
    }

    void startCar() {
        engine.start();
        System.out.println("Car is ready to drive!");
    }
}
class Driver {
    String name;

    Driver(String name) {
        this.name = name;
    }
}
public class Employeee {
    String name;
    AddressInfo addressInfo;
    InsuranceInfo insuranceInfo;
    public Employeee(String name, AddressInfo addressInfo, InsuranceInfo insuranceInfo)
    {
        this.name=name;
        this.addressInfo=addressInfo;
        this.insuranceInfo=insuranceInfo;

    }
    public void display()
    {
        System.out.println("Name of Employee : "+this.name);
        System.out.println("Address of Employee: "+
                addressInfo.street+", "+addressInfo.city+", "+
                addressInfo.state+", "+addressInfo.postalCode);
        System.out.println("Insurance information: "+
                insuranceInfo.policyName+", "+insuranceInfo.policyId);
    }

}
class Engine {
    private String type;

    Engine(String type) {
        this.type = type;
    }

    void start() {
        System.out.println(type + " Engine is starting...");
    }
}
public class InsuranceInfo {
    String policyName;
    int policyId;
    public InsuranceInfo(String policyName, int policyId)
    {
        this.policyId=policyId;
        this.policyName=policyName;
    }
}
public class Main {
    public static void main(String[] args) {
        AddressInfo addressInfo= new AddressInfo("Sector 4", "Uttara", "Dhaka", "1711");
        InsuranceInfo insuranceInfo =new InsuranceInfo("Life Insurance", 123);
        Employeee employeee =new Employeee("Mr. Rahim",addressInfo, insuranceInfo );
        employeee.display();
    }
}

public class Main2 {
    public static void main(String[] args) {
        // Composition: Car has an engine, and engine's lifecycle is tied to the car
        Car myCar = new Car("V8");
        myCar.startCar();

        System.out.println();

        // Aggregation: Bus has a driver, but a driver can exist independently
        Driver driver = new Driver("John");
        Bus myBus = new Bus(driver);
        myBus.showDriver();
    }
}
