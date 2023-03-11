package Lab3;

public class Robot {

    //position of Robot
    int x;
    //default constructor
    Robot(){x=1;}

    void change(int k){
        if(k>=1){
            x=x+k;
        }
    }
    @Override
    public String toString(){
        return "x="+x;
    }

    public static void main(String[] args){
        Robot Mulan=new Robot();
        Mulan.change(3);
        System.out.println(Mulan); //printing the object will automatically call toString

    }

}
