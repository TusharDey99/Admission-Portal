package oishee;

import java.util.Scanner;

public class SUST {

    static double sscGPA, hscGPA;

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your SSC GPA: ");

        sscGPA = scanner.nextDouble();

        System.out.println("Please enter your HSC GPA: ");

        hscGPA = scanner.nextDouble();

        if(sscGPA >= 3.00 && hscGPA >= 3.00)
        {
            if((sscGPA+hscGPA) >= 6.50)
                System.out.println("Your application accepted for A units!");

            else
                System.out.println("You are not accepted");
        }

    }
}
