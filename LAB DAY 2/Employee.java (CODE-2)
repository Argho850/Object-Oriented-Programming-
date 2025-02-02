import java.util.Scanner;

class employee {
    private String name;
    private int age;
    private double salary;

    
    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public int getAge() {
        return age;
    }


    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        employee employee = new employee();
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter employee's name: ");
        String name = scanner.nextLine();
        employee.setName(name);

        System.out.print("Enter employee's age: ");
        int age = scanner.nextInt();
        employee.setAge(age);

        System.out.print("Enter employee's salary: ");
        double salary = scanner.nextDouble();
        employee.setSalary(salary);

        
        System.out.println("\nEmployee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());
    }
}
