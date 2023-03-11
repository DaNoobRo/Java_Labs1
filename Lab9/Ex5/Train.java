package Lab9.Ex5;

public class Train {

    String destination;
    String name;

    public Train(String destinatie, String nume) {
        super();
        this.destination = destinatie;
        this.name = nume;
    }

    String getDestination() {
        return destination;
    }

    @Override
    public String toString(){
        return this.name;
    }

}
