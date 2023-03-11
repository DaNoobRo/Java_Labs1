package Lab2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){
        int []v;
        int n;
        Scanner reader = new Scanner(System.in);
        System.out.println("read the number of elements");
        n=reader.nextInt();

        v=new int[n];

        for(int i=0;i<n;i++){
            System.out.println("enter element" + i);
            v[i]=reader.nextInt();
        }
        int max= v[0];
        for(int i=1;i<n;i++){
            if(v[i]>max)max=v[i];
        }
        System.out.println("The maximum is " +max);
    }
}
