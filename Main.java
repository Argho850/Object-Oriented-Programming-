public class Main {
   public static class Primechecker {
        public static boolean isPrime(int number) {
            if (number <= 1) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(number); ++i) {
                if (number % i == 0) {
                    return false;
                }
            }

            return true;
        }


        public static void main(String[] args) {
            int x = 3, y = 2;
            int sum = x + y;
            int sub = x - y;
            int sum_O = 0;
            int sum_E = 0;
            int [] a = {10, 20, 30, 35, 53};
            int l = a.length;

           /* ______________Question:1 _______________
                      simple calculations */
           
            System.out.println("Sum is:" + sum); // Adding two value
            System.out.println("Multiplication is : " + x * y); // multiplying two value
            System.out.println("Subtraction is :" + sub); // Subtracting two value

            /*__________________ Qustion no 2 _________________ 
      Odd elements Sumation and Even elements Sumation of the given Array*/

            for (int i = 0; i < l; ++i) {
                if (a[i] % 2 == 0) {
                    sum_E += a[i];
                } else if (a[i] % 2 != 0) {
                    sum_O += a[i];
                }
            }

            System.out.println("Sum of the even numbers Between the array :" + sum_E);
            System.out.println("Sum of the odd numbers Between the array :" + sum_O);

            /*___________________ QUESTION :3 __________________
                    Prime Number Checker of the Given Array*/

            System.out.println("Results:");
            for (int number : a) {
                if (isPrime(number)) {
                    System.out.println(number + " Is a prime Number.");
                } else {
                    System.out.println(number + " Is not a prime Number.");
                }
            }
           
          /*_---________________ Question :4 ______________________
                         Multiplicaton Table*/
            for(int i=1 ; i<=10 ; ++i){
                System.out.println( x+ "x" +i + "=" +x *i );
            }
        }
    }
}
