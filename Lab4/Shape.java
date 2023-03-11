package Lab4;

public class Shape {
    String color;
    boolean filled;
    public Shape(){
        this.color="red";
        this.filled=true;
    }
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public boolean isFilled(){
        return this.filled;
    }

    @Override
    public String toString(){
        if(this.isFilled())
            return "A shape with color of "+this.color+" and filled";
        else return "A shape with color of "+this.color+" and Not filled";
    }
}
