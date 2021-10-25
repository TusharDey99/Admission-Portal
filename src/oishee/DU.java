package oishee;

import java.util.Scanner;

public class DU {

    static double sscGPA, hscGPA;

        public static void main (String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Please enter your SSC GPA: ");

            sscGPA= scanner.nextDouble();

            System.out.println("Please enter your HSC GPA: ");

            hscGPA = scanner.nextDouble();

            if(sscGPA >= 3.5 && hscGPA >= 3.5)
            {
                if((sscGPA+hscGPA) >= 8.5)
                    System.out.println("Your application accepted for A Units!");

                else
                    System.out.println("You are not accepted");
            }

        }
    }




