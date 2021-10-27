package akhi;

import java.util.Scanner;

public class InformationInput {

    String name, dateOfBirth, schoolName, collegeName, division;
    int sscYear, hscYear;
    double sscGPA, hscGPA;

    Scanner input = new Scanner(System.in);

    void infoInput()
    {
        System.out.println("Carefully enter valid information");

        System.out.print("Your name: ");
        name = input.nextLine();
        System.out.print("Your date of birth: ");
        dateOfBirth = input.nextLine();
        System.out.print("Your school name: ");
        schoolName = input.nextLine();
        System.out.print("Your college name: ");
        collegeName = input.nextLine();
        System.out.print("Your division: ");
        division = input.nextLine();
        System.out.print("Your SSC passing year: ");
        sscYear = input.nextInt();
        System.out.print("Your HSC passing year: ");
        hscYear = input.nextInt();
        System.out.print("Your SSC GPA: ");
        sscGPA = input.nextDouble();
        System.out.print("Your HSC GPA: ");
        hscGPA = input.nextDouble();
    }
}
