package Lab5;

public class ProxyImage implements Image,RotatedImage{
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
        if (this.fileName.endsWith("Rotated"))
            this.displayRotated();
        else this.display();
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }

    public void displayRotated(){
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.displayRotated();
    }
    public static void main(String[] args) {
        ProxyImage piggy = new ProxyImage("piggyRotated");
        ProxyImage doggy = new ProxyImage("doggy");
    }
}
