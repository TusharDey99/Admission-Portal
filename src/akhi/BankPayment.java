package akhi;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import oishee.*;

public class BankPayment {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    Loading loading = new Loading();

    public void bankTransfer() throws InterruptedException {
        int[][] matrix = new int[4][4];
        int scan1, verificationCode, verificationCodeIn;
        int[] bankAccNo = {9, 7, 5, 3, 8, 1, 2, 1, 6, 7, 3, 3, 9, 1, 2, 6};

        System.out.println();
        System.out.println("This is our bank account number: 9753 81216 7339 126");
        System.out.println("Scan this Account number matrix to pay automatically:");

        int k=0;
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                matrix[i][j] = bankAccNo[k];
                k++;
            }
        }

        for(int i=0; i<4; i++)
        {
            for(int j=0; j<4; j++)
            {
                System.out.print(matrix[i][j]+"   ");
            }
            System.out.println();
        }

        System.out.print("Press 1 to scan the account number matrix: ");
        scan1 = scanner.nextInt();

        if(scan1 == 1)
        {
            verificationCode = random.nextInt(900)+100;
            try{
                BufferedWriter bw = new BufferedWriter(new FileWriter
                        ("C:\\Games\\Test\\BankVerification.txt"));
                bw.write(verificationCode+"\n");
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            System.out.print("We have send verification code to your phone number. Please enter the code here: ");
            verificationCodeIn = scanner.nextInt();

            System.out.println();
            if(verificationCodeIn==verificationCode)
            {
                loading.loadingEffect();
                System.out.println("Verification is complete.");

                System.out.println("Payment is complete.");
                System.out.println();
            }
            else
            {
                System.out.println("Something went wrong. Please try again.");
                bankTransfer();
            }
        }
        else
        {
            System.out.println("Something went wrong. Please try again.");
            bankTransfer();
        }
    }
}
