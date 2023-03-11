package Lab10.Ex4;

public class Robot_2Dspace {
    public static void main(String[] args) {

        int [][] map = new int[100][100];

        for(int i=1;i<=10;i++){
            Robot r = new Robot(map,i);
            Thread t = new Thread(r,"robot "+i);
            t.start();
        }
    }
}
