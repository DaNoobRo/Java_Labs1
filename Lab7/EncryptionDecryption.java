package Lab7;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class EncryptionDecryption {

    //I would look at it more because right now both encryption and decryption work
    //on .txt file -> Would make it so it takes the encrypted file and decrypts it and viceversa

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter full path of file");
        String fileName = scanner.nextLine();

        System.out.println("please enter operation number");
        System.out.println("1.Encryption");
        System.out.println("2.Decryption");
        int operation = scanner.nextInt();

        try {

            int ctr;

            FileInputStream inputStream = new FileInputStream(fileName);
            FileOutputStream outputStreamE = new FileOutputStream("CodedText.enc");
            FileOutputStream outputStreamD = new FileOutputStream("CodedText.dec");


            if(operation==1) {
                while ((ctr = inputStream.read()) != -1) {
                    ctr -= 1; // 1 is the encryption key .
                    System.out.print((char) ctr);
                    outputStreamE.write(ctr);
                }
                outputStreamE.close();
            }
            if(operation==2){
                while ((ctr = inputStream.read()) != -1) {
                    ctr += 1; // 1 is the encryption key .
                    System.out.print((char) ctr);
                    outputStreamD.write(ctr);
                }
                outputStreamD.close();
            }
        } catch (Exception ex){
            ex.printStackTrace();
        }
    }

}
