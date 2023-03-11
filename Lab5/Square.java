package Lab5;

public class Square extends Rectangle{
   // private double side;
    Square(){
        super();
        //side=1.0;
    }
    Square(double side){
        super();
        //this.side=side;
        this.setLength(side);
        this.setWidth(side);
    }
    Square(double side,String color,boolean filled){
        super();
        //this.side=side;
        this.setWidth(side);
        this.setLength(side);
        this.setColor(color);
        this.setFilled(filled);
    }

    public double getSide() {
        return width;
    }

    public void setSide(double side) {
        //this.side = side;
        this.setWidth(side);
        this.setLength(side);
    }
    @Override
    public void setLength(double length){
        super.setLength(length);
        super.setWidth(length);
        //this.side=length;
    }
    @Override
    public void setWidth(double width){
        super.setWidth(width);
        super.setLength(width);
       // this.side=width;
    }
    @Override
    public String toString(){
        return "A square with a side = " +this.getWidth() +" subclass of "+super.toString();
    }

    public static void main(String[] args) {
        Square patrat = new Square(2,"green",true);
        System.out.println(patrat.getLength());
        System.out.println(patrat.getWidth());
        patrat.setSide(2.5);
        System.out.println(patrat.getSide());
        System.out.println(patrat.getPerimeter());
        System.out.println(patrat.getArea());
        System.out.println(patrat.getColor());
        System.out.println(patrat);

        Shape [] shapes = new Shape[3];
        shapes[0]= new Circle(2,"mov",true);
        shapes[1]=new Rectangle(4,5,"green",false);
        shapes[2]=new Square(3,"galben",true);

        for (int i=0;i<3;i++){
            System.out.println(shapes[i].getPerimeter());
            System.out.println(shapes[i].getArea());
        }

    }
}
