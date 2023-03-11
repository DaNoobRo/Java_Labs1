package Lab2;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args){

        int A,B,counter=0;
        boolean prim;
        Scanner reader = new Scanner(System.in);
        System.out.println("Insert A larger than 1");
        A= reader.nextInt();
        System.out.println("Insert B");
        B= reader.nextInt();
        for(int i=A;i<=B;i++){
            prim=true ;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    prim=false;
                    break;
                }
            }
            if(prim) {
                counter++;
                System.out.println(i);
            }
        }
        System.out.println(counter);
    }

}

