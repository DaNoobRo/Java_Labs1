package Lab4;

public class Square extends Rectangle{

   // private double side; //square should not have any attributes, only the inherited ones
    Square(){
        super(1,1);
        
    }
    Square(double side){
        super(side, side);
        //this.side=side;
        //this.setLength(side);
        //this.setWidth(side);
    }
    Square(double side,String color,boolean filled){
        super(side, side, color, filled);
        //this.side=side;
        //this.setWidth(side);
        //this.setLength(side);
        //this.setColor(color);
        //this.setFilled(filled);
    }

    public double getSide() {
        super.getLength();
        return this.getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side); //because the rectangle attributes are private
    }
    @Override
    public void setLength(double length){
        super.setLength(length);
        //super.setWidth(length);
        //this.side=length;
    }
    @Override
    public void setWidth(double width){
        super.setWidth(width);
        //super.setLength(width);
        //his.side=width;
    }
    @Override
    public String toString(){
        return "A square with a side = " +this.getWidth() +" subclass of "+super.toString();
    }

    public static void main(String[] args){
        Square m=new Square();
        System.out.println(m);
        Square n=new Square(3);
        System.out.println(n);
        Square l=new Square(3,"blue",false);
        System.out.println(l);
        l.setLength(4);
        System.out.println("length : " +l.getLength() +"; width : " +l.getWidth() +"; side : " + l.getSide() );
        System.out.println(l);
        System.out.println(l.getArea());
        System.out.println(l.getPerimeter());
        l.setSide(3);
        System.out.println(l);

    }
}
