package mahi;

import java.util.Scanner;

public class Ruet extends ReadFile{
    public void SelectFaculties() {
        readMyFile("RUET", "cuetFaculties");

        System.out.print("Select eligible unit/faculty for you: ");
        Scanner input = new Scanner(System.in);
        int UnitNumber = input.nextInt();

            System.out.println();

        switch (UnitNumber) {
            case 1 -> {
                readMyFile("RUET", "civil");
                System.out.println();
                System.out.print("Select subject you would like to apply : ");
                int subNumberForA = input.nextInt();

                for (int i=0; i<3; i++)
                    System.out.println();

                writeUniversitytInfo("Rajshahi University of Engineering & Technology", "Civil Engineering", subNumberForA);
            }

            case 2 -> {
                readMyFile("RUET", "me");
                System.out.println();
                System.out.print("Select subject you would like to apply : ");
                int subNumberForB = input.nextInt();

                for (int i=0; i<3; i++)
                    System.out.println();

                writeUniversitytInfo("Rajshahi University of Engineering & Technology", "Mechanical Engineering", subNumberForB);
            }

            case 3 -> {
                readMyFile("RUET", "ece");
                System.out.println();
                System.out.print("Select subject you would like to apply : ");
                int subNumberForC = input.nextInt();

                for (int i=0; i<3; i++)
                    System.out.println();

                writeUniversitytInfo("Rajshahi University of Engineering & Technology", "Electrical & Computer Engineering", subNumberForC);
            }

            case 4 -> {
                readMyFile("RUET", "ase");
                System.out.println();
                System.out.print("Select subject you would like to apply : ");
                int subNumberForD = input.nextInt();

                for (int i=0; i<3; i++)
                    System.out.println();

                writeUniversitytInfo("Rajshahi University of Engineering & Technology", "Applied Science and Engineering", subNumberForD);
            }

            default -> System.out.println("Please select Units using 1-4");
        }
    }
}
