package Lab2;

import java.util.Random;
import static Lab2.BubbleSortExample.bubbleSort;

public class Ex5 {
    public static void main(String[] args){
        Random rand = new Random();
        int []v;
        int n=10;

        v=new int[n];

        for(int i=0;i<n;i++){
            v[i]=rand.nextInt(50);
            System.out.println("element " +i +"is " +v[i]);
        }
        bubbleSort(v);
        System.out.println("Array After Bubble Sort");
        for (int j : v) {
            System.out.print(j + " ");
        }

    }
}
