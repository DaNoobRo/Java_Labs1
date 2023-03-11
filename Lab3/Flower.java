package Lab3;

public class Flower{
    int petal;
    public static int nrObject=0;
    Flower(){
        System.out.println("Flower has been created!");
        nrObject++;
    }
    public int getFlowerNR(){
        return nrObject;
    }

    public static void main(String[] args) {
        Flower[] garden = new Flower[5];
        for(int i =0;i<5;i++){
            Flower f = new Flower();
            garden[i] = f;
            System.out.println("There are " +f.getFlowerNR()+" flowers in garden");
        }
    }
}