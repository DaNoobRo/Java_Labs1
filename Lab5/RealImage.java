package Lab5;

public class RealImage implements Image,RotatedImage {
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }

    public void displayRotated(){
        System.out.println("Display rotated " +fileName);
    }

}

