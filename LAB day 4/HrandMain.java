class HR extends Employee {
    private double salary = 25000.700;

    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + this.salary);
        System.out.println("Yearly Salary: " + (this.salary * 12));
    }

    public void manageEmployee() {
        System.out.println("Please kindly manage this employee!");
    }
}
public class Main {
    public static void main(String[] args) {
        HR h = new HR();
        Soft_Engg s = new Soft_Engg();

        h.display();
        h.manageEmployee();

        s.display();
        s.developCode();
    }
}
