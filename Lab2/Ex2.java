package Lab2;

import java.util.Scanner;
public class Ex2 {

    public static void main(String[] args) {
        Integer cifra;
        System.out.println("Insert cifra");
        Scanner reader = new Scanner(System.in);
        cifra= reader.nextInt();
        switch (cifra) {
            case 1 -> System.out.println("ONE");
            case 2 -> System.out.println("TWO");
            case 3 -> System.out.println("THREE");
            case 4 -> System.out.println("FOUR");
            case 5 -> System.out.println("FIVE");
            case 6 -> System.out.println("SIX");
            case 7 -> System.out.println("SEVEN");
            case 8 -> System.out.println("EIGHT");
            case 9 -> System.out.print("NINE");
            default -> System.out.println("OTHER");
        }

        if(cifra==1) System.out.println("ONE");
        else if(cifra==2) System.out.println("Two");
        else if(cifra==3) System.out.println("three");
        else if(cifra==4) System.out.println("four");
        else if(cifra==5) System.out.println("five");
        else if(cifra==6) System.out.println("six");
        else if(cifra==7) System.out.println("seven");
        else if(cifra==8) System.out.println("eight");
        else if(cifra==9) System.out.println("nine");
        else System.out.println("other");
    }
}
