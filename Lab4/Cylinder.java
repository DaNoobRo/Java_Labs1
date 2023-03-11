package Lab4;

import Lab3.Circle;

public class Cylinder extends Circle {

    private double height = 1.0;
    double pi = 3.14159265359;

    public Cylinder()
    {
        super();
        height = 1.0;
    }

    public Cylinder(double radius)
    {
        super(radius);
    }

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override  public double getArea()
    {
        return pi*2*this.getRadius()*(this.getRadius()+height);
    }

    public double getVolume()
    {
        return pi*this.getRadius()*this.getRadius()*height;
    }
    public static void main(String[] args){
        Cylinder d =new Cylinder();
        System.out.println(d.getHeight());
        Cylinder e =new Cylinder(2.3);
        System.out.println(e.getHeight());
        System.out.println(e.getRadius());
        Cylinder f=new Cylinder(2,4);
        System.out.println(f.getHeight());
        System.out.println(f.getRadius());
        System.out.println(f.getArea());
        System.out.println(f.getVolume());

    }

}
