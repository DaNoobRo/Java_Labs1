package Lab10.Ex3;

import static Lab10.Ex3.TestCounters.i;

public class Counter_100_200 implements Runnable{


    public void run(){
        Thread t = Thread.currentThread();
        for(int j=100;j<=200;j++){
            i=j;
            System.out.println(t.getName() + " i = "+i);

        }
        System.out.println(t.getName() + " job finalised.");
    }
}
