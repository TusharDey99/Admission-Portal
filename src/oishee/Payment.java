package oishee;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import  tushar.*;
import  akhi.*;

public class Payment {

    Scanner scanner = new Scanner(System.in);
    Loading loading = new Loading();
    Random random = new Random();
    RoomChoice roomChoice = new RoomChoice();
    BankPayment bankPayment = new BankPayment();

    int coinChoice, verificationCode, verificationCodeIn, scan;
    float convert;

    char[] res2 = { 'a', 'b', '0', 'c', 'd', '1', 'e', 'f', '2', 'g',
            'h', '3', 'i', 'j', '4', 'k', 'l', '5', 'm', 'n', '6',
            'o', 'p', '7', 'q', 'r', '8', 's', 't', '9', 'u',
            'v', 'w', 'x', 'y', 'z' };

    public void paymentProcess() throws InterruptedException
    {
        System.out.println();
        System.out.println("You have to pay admission fee of 1000 taka(Dorm cost will be included automatically if rented).");
        int pm;
        System.out.println("How would you like to pay?");
        System.out.println("1. Bank Transfer.");
        System.out.println("2. Pay via Cryptocurrency.");
        System.out.print("Enter your choice: ");
        pm = scanner.nextInt();

        switch (pm) {
            case 1 -> bankPayment.bankTransfer();

            case 2 -> cryptoTransfer();

            default -> {
                System.out.println("Wrong Input. Try again.");
                paymentProcess();
            }
        }
    }

    void cryptoTransfer() throws InterruptedException {

        System.out.println("Choose which crypto you would like to pay with: ");
        System.out.println("1. Bitcoin.");
        System.out.println("2. Bitcoin Cash.");
        System.out.println("3. Ethereum.");
        System.out.println("4. Litecoin.");
        System.out.print("Enter your choice: ");
        coinChoice = scanner.nextInt();
        System.out.println();

        if(coinChoice>0 && coinChoice<=4)
        {
                if(coinChoice==1)
                {
                    convert = (float)(1000+roomChoice.roomCost) / 5000000;
                    System.out.println("You will pay "+convert+" Bitcoin(s).");
                }
                else if(coinChoice==2)
                {
                    convert = (float)(1000+roomChoice.roomCost) / 50000;
                    System.out.println("You will pay "+convert+" Bitcoin cash(s).");
                }
                else if(coinChoice==3)
                {
                    convert = (float)(1000+roomChoice.roomCost) / 190000;
                    System.out.println("You will pay "+convert+" Etherem(s).");
                }
                else
                {
                    convert = (float)(1000+roomChoice.roomCost) / 13000;
                    System.out.println("You will pay "+convert+" Litecoin(s).");
                }

            System.out.print("This is our cryptocurrency wallet address number: ");
            for (int i=0; i<36; i++)
                System.out.print(res2[i]);

            char[][] matrix = new char[6][6];
            int k=0;
            for(int i=0; i<6; i++)
            {
                for(int j=0; j<6; j++)
                {
                    matrix[i][j] = res2[k];
                    k++;
                }
            }

            System.out.println();
            System.out.println("Scan this address matrix to go payment directly: ");

            for(int i=0; i<6; i++)
            {
                for(int j=0; j<6; j++)
                {
                    System.out.print(matrix[i][j]+"   ");
                }
                System.out.println();
            }

            System.out.print("Press 1 to scan the address matrix: ");
            scan = scanner.nextInt();

            if(scan==1)
            {
                verificationCode = random.nextInt(900)+100;
                try{
                    BufferedWriter bw = new BufferedWriter(new FileWriter
                            ("C:\\Games\\Test\\CryptoVerification.txt"));
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
                }
                else
                {
                    System.out.println("Something went wrong. Please try again.");
                    cryptoTransfer();
                }
            }
            else
            {
                System.out.println("Something went wrong. Please try again.");
                cryptoTransfer();
            }
        }
	else
        {
            System.out.println("Try again.");
            cryptoTransfer();
        }
    }
}
