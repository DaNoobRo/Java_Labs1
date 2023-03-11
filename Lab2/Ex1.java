package Lab2;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args){

        Integer num1,num2,max;
        Scanner reader = new Scanner(System.in);

        System.out.println("Insert number 1");
        num1= reader.nextInt();
        System.out.println("Insert number 2");
        num2=reader.nextInt();

        max = num1.compareTo(num2);
        if(max == 0 || max > 0) System.out.println(num1);
        else System.out.println(num2);

    }
}
