package Lab5;

public class Circle extends Shape {
    protected double radius;
    // private String color = null;
    private final double PI=3.14;

    //overloaded constructors
    public Circle(double radius){
        super();
        this.radius=radius;
    }
    public Circle(double radius,String color,boolean filled) {
        super(color,filled);
        this.radius = radius;
    }

    public Circle() {
        super();
        this.radius=1.0;
    }

    public double getRadius() {
        return this.radius ;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return this.radius * this.radius*PI;
    }
    @Override
    public double getPerimeter(){return this.radius*2*PI;}

    @Override
    public String toString(){
        return "A circle with a radius = "+this.radius+" is subclass of " + super.toString();
    }

    public static void main(String[] args) {
        Circle cerc = new Circle(2,"mov",false);
        System.out.println(cerc.getRadius());
        cerc.setRadius(2.5);
        cerc.setFilled(true);
        System.out.println(cerc.getArea());
        System.out.println(cerc.getPerimeter());
        System.out.println(cerc);
    }
}
