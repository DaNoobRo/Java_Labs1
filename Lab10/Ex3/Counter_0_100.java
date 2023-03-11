package Lab10.Ex3;

import static Lab10.Ex3.TestCounters.i;
public class Counter_0_100 implements Runnable{


    public void run(){

        Thread t = Thread.currentThread();
        for(int j=1;j<=100;j++){
            i=j;
            System.out.println(t.getName() + " i = "+i);

        }
        System.out.println(t.getName() + " job finalised.");
    }
}
