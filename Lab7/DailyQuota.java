package Lab7;

public class DailyQuota extends Exception{
    int nrDiff ;
    public DailyQuota(int nrDiff,String msg) {
        super(msg);
    }

}
