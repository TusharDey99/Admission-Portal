package oishee;

import java.util.Scanner;

public class CUET {
    static double sscGPA, hscGPA;

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your SSC GPA: ");

        sscGPA = scanner.nextDouble();

        System.out.println("Please enter your HSC GPA: ");

        hscGPA = scanner.nextDouble();

        if(sscGPA == 5.00 && hscGPA == 5.00)
            System.out.println("Your application accepted for Exam!");

        else
            System.out.println("You are not accepted");

    }
}
