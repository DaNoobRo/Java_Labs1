package Lab4;

public class Rectangle extends Shape{
    private double width;
    private double length;

    Rectangle(){
        super(); //needed to initialize the inherited attributes color and filled
        this.width=1.0;
        this.length=1.0;
    }
    Rectangle(double width,double length){
        super();
        this.width=width;
        this.length=length;
    }
    Rectangle(double width,double length,String color,boolean filled){
        super(color,filled);
        this.width=width;
        this.length=length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }
    public double getArea(){
        return this.length*this.width;
    }
    public double getPerimeter(){
        return this.length*2+this.width*2;
    }
    @Override
    public String toString(){
        return "A rectangle with  a width = " +this.width +" and a length = "+this.length+" subclass of "+super.toString();
    }
    public static void main(String[] args){
        Rectangle z = new Rectangle(4,2.5);
        System.out.println(z.getWidth());
        System.out.println(z.getLength());
        z.setLength(6);
        z.setWidth(2);
        System.out.println(z.getPerimeter());
        System.out.println(z.getArea());
        System.out.println(z);

        Rectangle x=new Rectangle(4,2.5,"violet",false);
        System.out.println(x.getWidth());
        System.out.println(x.getLength());
        System.out.println(x.getPerimeter());
        System.out.println(x.getArea());
        System.out.println(x);
    }

}
