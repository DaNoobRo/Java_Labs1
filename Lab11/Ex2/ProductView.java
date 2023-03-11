package Lab11.Ex2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class ProductView extends JFrame implements Observer {

    // Elements in window
    JLabel productLabel, availableProducts, quantityLabel, priceLabel;
    JTextField product, quantity, price;
    JTextArea productList;
    JButton addProduct, delete, changeQuantity, show;
    ArrayList<Product> list = new ArrayList<>();


    //Oracle :
    //"This method is called whenever the observed object is changed.
    // An application calls an Observable object's notifyObservers method
    // to have all the object's observers notified of the change."

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("1");
        for (Product index : list) {

            if (index.name.compareTo(((Product) o).getName()) != 0) {
                list.add((Product) o);
                showItems();
            }
        }
    }
    //Layout
    ProductView() {

        setTitle("Stock management application");
        setLocation(700, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        init();
        setSize(400, 420);
        setVisible(true);
    }

    public void init() {

        this.setLayout(null);

        // text fields

        productLabel = new JLabel("Product name:");
        productLabel.setBounds(10, 20, 150, 20);

        product = new JTextField();
        product.setBounds(150, 20, 200, 20);

        quantityLabel = new JLabel("Quantity");
        quantityLabel.setBounds(10, 40, 150, 20);

        quantity = new JTextField();
        quantity.setBounds(150, 40, 200, 20);

        priceLabel = new JLabel("Price");
        priceLabel.setBounds(10, 60, 150, 20);

        price = new JTextField();
        price.setBounds(150, 60, 200, 20);

        availableProducts = new JLabel("Products");
        availableProducts.setBounds(10, 100, 150, 20);

        productList = new JTextArea();
        productList.setBounds(10, 120, 350, 130);

        //Buttons

        addProduct = new JButton("Add Product");
        addProduct.setBounds(20, 250, 200, 20);

        delete = new JButton("Delete Product");
        delete.setBounds(20, 280, 200, 20);

        changeQuantity = new JButton("Change Available Quantity");
        changeQuantity.setBounds(20, 310, 200, 20);

        show = new JButton("View Products");
        show.setBounds(20, 340, 200, 20);

        //ActionListeners

        addProduct.addActionListener(new AddProduct());
        delete.addActionListener(new Delete());
        changeQuantity.addActionListener(new Change());
        show.addActionListener(new ShowItems());

    //adding everything to the frame
        add(priceLabel);
        add(price);
        add(quantity);
        add(quantityLabel);
        add(delete);
        add(show);
        add(changeQuantity);
        add(addProduct);
        add(availableProducts);
        add(productLabel);
        add(product);
        add(productList);
    }

    // here are the ActionListener classes
    // we also could have had an e.getSource().equals(btn)
    // less code but less efficient

    class AddProduct implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Product p = new Product(product.getText(), Integer.parseInt(price.getText()), Integer.parseInt(quantity.getText()));
            list.add(p);
            product.setText("");
            price.setText("");
            quantity.setText("");
        }
    }

    class Delete implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            list.removeIf(index -> index.name.compareTo(product.getText()) == 0);
            product.setText("");
        }
    }

    class Change implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            for (Product index : list) {
                if (index.name.compareTo(product.getText()) == 0)
                    index.quantity = Integer.parseInt(quantity.getText());
            }
        }
    }

    class ShowItems implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            productList.setText("");
            for (Product index : list) {
                productList.append(index.toString());
            }
        }
    }

    //method to append to textArea
    public void showItems() {
        productList.setText("");
        for (Product index : list) {
            productList.append(index.toString());
        }
    }


    public static void main(String[] args) {
        new ProductView();
    }

}
