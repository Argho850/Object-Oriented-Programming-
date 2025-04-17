class Soft_Engg extends Employee {
    private double salary = 125000.800;

    @Override
    public void display() {
        super.display();
        System.out.println("Salary: " + this.salary);
        System.out.println("Yearly Salary: " + (this.salary * 12));
    }

    public void developCode() {
        System.out.println("Your code is wrong. Do it again!");
    }
}
