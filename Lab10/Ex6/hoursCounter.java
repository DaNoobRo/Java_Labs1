package Lab10.Ex6;

public class hoursCounter extends Thread{
    Chronos time=null;

    public hoursCounter(Chronos time) {
        this.time = time;
    }
    public void run(){

        while (currentThread().isAlive()){
            synchronized (time){

            }
        }
    }
}
