package Lab3;
//modified in lab 4
import Lab4.Shape;

public class Circle extends Shape {

    private double radius;
   // private String color = null;
    private final double PI=3.14;

    //overloaded constructors
    public Circle(double radius){
        //super();
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public Circle() {
        this.radius=1.0;
    }

    public double getRadius() {
        return this.radius ;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
       return this.radius * this.radius*PI;
    }

    public double getPerimeter(){return this.radius*2*PI;}

    @Override
    public String toString(){
        return "A circle with a radius = "+this.radius+" is subclass of " + super.toString();
    }

    public static void main(String[] args){
        Circle a = new Circle(2);
        System.out.println(a.getColor());
        System.out.println(a);
        a.setRadius(3);
        System.out.println(a.getArea());
        System.out.println(a.getPerimeter());
        System.out.println(a.isFilled());

        Circle b=new Circle(5,"green",false);

        System.out.println(b.getColor());
        System.out.println(b);
        System.out.println(b.getArea());
        System.out.println(b.getPerimeter());
        System.out.println(b.isFilled());
    }
}
