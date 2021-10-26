package tushar;

import java.util.Scanner;

import  oishee.*;

public class Main {

    public static int district;

    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        Loading loading = new Loading();
        Payment payment = new Payment();
        RoomChoice roomChoice = new RoomChoice();

        for (int i=0; i<3; i++)
            System.out.println();
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tWelcome To The Admission Portal");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t (Public University Admission Portal)");

        //Instructions instructions = new Instructions();


        System.out.println("Districs:");
        System.out.println("1 - Sylhet.");
        System.out.println("2 - Dhaka.");
        System.out.println("3 - Chottogram.");
        System.out.print("Enter your district number: ");
        district = input.nextInt();

        while(district > 3 || district < 1)
        {
            System.out.println();
            System.out.println("Invalid district number. Try again.");
            System.out.println("Districs:");
            System.out.println("1-Sylhet.");
            System.out.println("2-Dhaka.");
            System.out.println("3-Chottogram.");
            System.out.print("Enter your district number: ");
            district = input.nextInt();
            System.out.println();
        }


        if (district == 1)
        {
            BFSSylhet bfsSylhet = new BFSSylhet();
            bfsSylhet.createGraph();
            bfsSylhet.informationInput();
                loading.loadingEffect();
            bfsSylhet.universityChoosing();
                loading.loadingEffect();
            bfsSylhet.breadthFirstSearch();
            bfsSylhet.pathCalling();
                loading.loadingEffect();
            roomChoice.roomChoose();
            payment.paymentProcess();
            bfsSylhet.infoPrinting();
        }

        else if (district == 2)
        {
            BFSDhaka bfsDhaka = new BFSDhaka();
            bfsDhaka.createGraph();
            bfsDhaka.informationInput();
                loading.loadingEffect();
            bfsDhaka.universityChoosing();
                loading.loadingEffect();
            bfsDhaka.breadthFirstSearch();
            bfsDhaka.pathCalling();
                loading.loadingEffect();
            roomChoice.roomChoose();
            payment.paymentProcess();
            bfsDhaka.infoPrinting();
        }

        else {
            BFSChottogram bfsChottogram = new BFSChottogram();
            bfsChottogram.createGraph();
            bfsChottogram.informationInput();
                loading.loadingEffect();
            bfsChottogram.universityChoosing();
                loading.loadingEffect();
            bfsChottogram.breadthFirstSearch();
            bfsChottogram.pathCalling();
                loading.loadingEffect();
            roomChoice.roomChoose();
            payment.paymentProcess();
            bfsChottogram.infoPrinting();
        }
    }
}
