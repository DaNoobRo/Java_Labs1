package Lab7;

public class Coffee {
    private final int temp;
    private final int conc;

    Coffee(int t,int c){temp = t;conc = c;}
    int getTemp(){return temp;}
    int getConc(){return conc;}
    public String toString(){return "[coffee temperature="+temp+":concentration="+conc+"]";}
}
