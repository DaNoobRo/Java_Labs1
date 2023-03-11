package Lab10.Ex5;

public class Consumer extends Thread{
    private Buffer bf;
    Consumer(Buffer bf){this.bf=bf;}

    public void run()
    {
        while (true)
        {
            System.out.println("Am citit : "+this+" >> "+bf.get());
        }
    }
}
