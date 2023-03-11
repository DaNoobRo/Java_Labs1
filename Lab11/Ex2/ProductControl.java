package Lab11.Ex2;

public class ProductControl {

    Product p;
    ProductView view;
    public ProductControl(Product p, ProductView view){
        p.addObserver(view);
        this.p=p;
        this.view=view;
    }

    public static void main(String[] args) {
        ProductView view=new ProductView();
        Product p=new Product();
        ProductControl controller=new ProductControl(p,view);
    }
}
