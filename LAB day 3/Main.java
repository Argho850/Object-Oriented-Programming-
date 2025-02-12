import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Shape s = new Shape(3, 6, 7);
        //System.out.print("Enter the heigth :");
        //s.height = scanner.nextDouble();
        //System.out.print("Enter the width :");
        // s.width = scanner.nextDouble();

        //System.out.print("Enter the radius:");
        //s.radius=scanner.nextDouble();

        s.display();

        System.out.print("Area1 :" + Shape.area(s.height, s.width));

        System.out.print("\nArea2  :" + Shape.area(s.radius));



    }
}