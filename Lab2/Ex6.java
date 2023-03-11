package Lab2;

import java.util.Scanner;

public class Ex6 {
    public static int factorial(int num){
        if(num==0)
            return 1;
        else if(num==1)
            return 1;
        else
            return num*factorial(num-1);
    }
    public static void main(String[] args){
        int N,N_fact=1;
        Scanner reader = new Scanner(System.in);

        System.out.println("N");
        N= reader.nextInt();

        //non-recursive method
        for(int i=1;i<=N;i++){
            N_fact=N_fact*i;
        }
        System.out.println("here is N!"+N_fact);
        //recursive method ,check factorial declaration
        N_fact=factorial(N);
        System.out.println("here is N!"+N_fact);
    }
}
