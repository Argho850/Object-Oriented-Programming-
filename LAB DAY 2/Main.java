
import java.util.Scanner;

        public class Main {

            public static void main(String[] args){

                Scanner scanner = new Scanner(System.in);
                Rectangle rec = new Rectangle();

                System.out.print("Enter the length :");
                rec.length = scanner.nextDouble();

                System.out.print("Enter the width :");
                rec.width = scanner.nextDouble();

                rec.display();
                rec.area();


                Insert(rec, scanner);

                rec.display();
                rec.area();
            }

            static void Insert(Rectangle rec, Scanner scanner) {
                System.out.print("Enter a new value of length to update :");
                rec.length = scanner.nextDouble();
                System.out.print("Enter a new value of width to update :");
                rec.width = scanner.nextDouble();


        }

}
