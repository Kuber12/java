package Unit1;

public class CircleDemo{
    public static void main(String args[]){
        Circle cir = new Circle(5.5);   // give value to radius//
        System.out.println("Area = "+ cir.calcArea()); // call the methods inside the class//
        System.out.println("Perimeter = "+ cir.calcPerimeter());
    }
}
class Circle {
    double radius;
    final double PI = 3.1416; // to make it a constant unchangeable//

    public Circle(double r){                //if this was radius yo need to make//
        radius = r;                         //this.radius = radius//
    }

    public double calcArea(){       //a methoid calcArea //
        return PI * radius * radius;
    }
    public double calcPerimeter(){
        return 2 * PI * radius;
    }

}
