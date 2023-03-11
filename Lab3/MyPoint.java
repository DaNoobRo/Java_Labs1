package Lab3;

import java.lang.Math;

public class MyPoint {

    public int x,y;
    MyPoint(){
        x=0;
        y=0;
    }
    public MyPoint(int X,int Y){
        this.x=X;
        this.y=Y;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void setXY(int X,int Y){
        this.x=X;
        this.y=Y;
    }

    public double distance(int X,int Y){
        return Math.sqrt((this.x-X)*(this.x-X)+(this.y-Y)*(this.y-Y));
    }
    public double distance(MyPoint another ){
        return  Math.sqrt((another.x-this.x)*(another.x-this.x)+(another.y-this.y)*(another.y-this.y));
    }

    @Override
    public String toString(){
        return "( "+x+ " "+y+")" ;
    }


    public static void main(String[] args){
        MyPoint pointy = new MyPoint(2,3);
        MyPoint pointy2 = new MyPoint(5,6);
        System.out.println(pointy.getX() +" "+ pointy.getY());
        System.out.println(pointy.distance(4,1));
        System.out.println(pointy.distance(pointy2));

    }
}

