public class Addition {
    static int sum(int a , int b , int c) {
        return a + b + c;
    }

    static double sum(double a, double b){
        return a + b;
    }
    static String sum(String a, String b , String c) {
        return a + b + c;
    }
    static String sum(String a, int b , double c) {
        return a + b + c;
    }

  public static void main(String[] args){
      Addition ad= new Addition();
      System.out.println(Addition.sum(4,5  , 6));
      System.out.println(Addition.sum(5.00 ,8.00));
      System.out.println(Addition.sum("Munni" , "Shila" ,"Fara!"));
      System.out.println(Addition.sum("Munni" , 1 ,  5.0));

  }

}