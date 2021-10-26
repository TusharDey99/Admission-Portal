package oishee;

import java.util.Scanner;

public class DU2 {

    static double sscGPA, hscGPA;

    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your gpa ");

        sscGPA = scanner.nextDouble();

        System.out.println("Please enter your total cgpa in SSC and HSC ");

        hscGPA = scanner.nextDouble();

        if(sscGPA >= 3.0 && hscGPA >= 3.0)
        {
            if((sscGPA+hscGPA) >= 8.0)
                System.out.println("Your application accepted for B Units!");

            else
                System.out.println("You are not accepted");
        }

    }
}
