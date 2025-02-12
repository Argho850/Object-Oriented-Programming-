import java .util .Scanner ;

public class Shape {
    double  height ;
    double width;
    double radius;
    static double Pi = 3.1416;

    public Shape(double  height ,double width ,double radius){
        this.height = height;
        this.width = width;
        this .radius = radius;

    }
    public void display(){
        System.out.println(this.height);
        System.out.println(this.width);
        System.out.println(this.radius);
    }


    static double area(double height , double width){

        return height * width ;
    }
    static double area(double radius){

        return Pi * radius * radius ;
    }


}
