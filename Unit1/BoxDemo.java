package Unit1;

public class BoxDemo{
    public static void main(String args[]){
        Box b1 = new Box(10, 20);
        System.out.println(b1.toString());
    }

}
class Box {
    int l,b,h;
    // Constructor Overloading / chain of constructor //
    // Method Overloading //
    public Box(){                   // a default constructor//
        this(0,0,0);        //this constructor not any other constructor//
    }
    public Box(int l){
    }
    public Box(int l,int b){
        this.l = l;
        this.b = b;
    }
    public Box(int l,int b,int h){
        this.l = l;
        this.b = b;
        this.h= h;
    }
    @Override
    public String toString(){
        return ("Length: " + l + "\nBreath: " + b + "\nHeight: " + h);
    }
}