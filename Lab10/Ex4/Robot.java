package Lab10.Ex4;

import java.util.Random;

import static java.lang.Thread.sleep;


public class Robot implements  Runnable{

    boolean isDestroyed;
    private int x;
    private int y;
    private volatile int[][] map;
    String name;

    Robot(int[][] map,int i){
        this.name="robot"+i;
        Random rand = new Random();
        this.x=(rand.nextInt(5));
        this.y=(rand.nextInt(5));
        this.isDestroyed=false;
        this.map=map;
        map[x][y]=1;
    }
    public void updatePos() {

        synchronized (this) {

            if (map[x][y] == -1) {
                this.isDestroyed = true;
                map[x][y] = 0;
            }
            map[x][y]=0;
            Random rand = new Random();
            this.x=(rand.nextInt(5));
            this.y=(rand.nextInt(5));

            if(map[x][y] == 1) {
                this.isDestroyed = true;
                map[x][y] = -1;
            }
            else{ map[x][y] = 1; }

        }
    }

    public void run(){
        try {
            while (!isDestroyed) {
                System.out.println(this.name + ": "+"position x : " + x + " position y :" + y + " occup :" + map[x][y]);
                updatePos();
                sleep(100);

            }
            System.out.println(this.name+" = destroyed");
        } catch (InterruptedException e) {
            System.out.println("something went wrong");
        }

    }
}
