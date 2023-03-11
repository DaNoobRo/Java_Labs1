package Lab2;

import java.util.Random;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args){
        int g_number,a_number;
        boolean wrong=true;

        Scanner reader = new Scanner(System.in);
        Random rand = new Random();
        a_number= rand.nextInt(50);
        //for testing
        System.out.println(" nr is " +a_number);

        for(int i=1;i<=3;i++){
            System.out.println("Your guess (0-50) ? : ");
            g_number= reader.nextInt();
            if(g_number==a_number){
                System.out.println("YEY ! u guessed it !");
                wrong=false;
                break;
            }
            else if(g_number>a_number){
                System.out.println("Try again ,number is less than your guess");
            }
            else {
                System.out.println("Try again,number is greater than your guess");
            }
        }
        if(wrong) System.out.println("BUUUUU,u lose ,the nr. was " +a_number);
    }
}
