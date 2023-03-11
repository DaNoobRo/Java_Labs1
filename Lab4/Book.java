package Lab4;

import Lab3.Author;

import java.util.Arrays;
import java.util.Scanner;

public class Book {
    private  final String name;
    private final  Author[] authors;
    private double price;
    private int gtyInStock;


    Book(String name, Author[] authors, double price){
        this.name=name;
        this.authors = authors;
        this.price=price;
        this.gtyInStock=0;

    }
    Book(String name,Author[] authors,double price,int gtyInStock){
        this.name=name;
        this.price=price;
        this.gtyInStock=gtyInStock;
        this.authors =authors;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthors() {
        return Arrays.toString(authors);
    }

    public double getPrice() {
        return price;
    }

    public int getGtyInStock() {
        return gtyInStock;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setGtyInStock(int gtyInStock) {
        this.gtyInStock = gtyInStock;
    }

    public String toString(){
        return this.name+" by "+this.authors.length+" authors";
    }

    public void printAuthors(){
        System.out.println(this.authors.length);
        for(int i=0;i<this.authors.length;i++){
            System.out.println("Author "+i+" is :");
            System.out.println(authors[i]);
        }

    }

    public static void main(String[] args){
        Scanner reader =new Scanner(System.in);
        int n = reader.nextInt();
        String name,email;
        char gender;
        Author[] authors =new Author[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter name");
            name=reader.next();
            System.out.println("Enter email");
            email=reader.next();
            System.out.println("Enter gender");
            gender=reader.next().charAt(0);
            authors[i] = new Author(name,email,gender);
        }
        Book book1= new Book("Thousand", authors,36.5);

        System.out.println(book1.getGtyInStock());
        System.out.println(book1.getName());
        System.out.println(book1.getPrice());
        book1.setPrice(23.45);
        System.out.println(book1.getPrice());
        book1.setGtyInStock(56);
        System.out.println(book1.getGtyInStock());
       // System.out.println(authors[1]);
        System.out.println(book1);
        book1.printAuthors();

        Book book2=new Book("Babaduc",authors,36.55,5);
        System.out.println(book2);
        book2.printAuthors();

        System.out.println(book2.getAuthors());


    }
}
