package mahi;
import java.io.*;
import java.util.Scanner;

public class DhakaUniversity extends ReadFile{
    public void SelectFaculties() {
        readMyFile("DhakaUniversity", "DuUnits");

        System.out.print("Select eligible unit/s for you: ");
        Scanner input = new Scanner(System.in);
        int UnitNumber = input.nextInt();

            System.out.println();

        switch (UnitNumber) {
            case 1 -> {
                readMyFile("DhakaUniversity", "A_Unit");
                System.out.println();
                System.out.print("Select subject you would like to apply : ");
                int subNumberForA = input.nextInt();

                for (int i=0; i<3; i++)
                    System.out.println();

                writeUniversitytInfo("Dhaka", "A", subNumberForA);
            }

            case 2 -> {
                readMyFile("DhakaUniversity", "B_Unit");
                System.out.println();
                System.out.print("Select subject you would like to apply : ");
                int subNumberForB = input.nextInt();

                for (int i=0; i<3; i++)
                    System.out.println();

                writeUniversitytInfo("Dhaka", "B", subNumberForB);
            }

            case 3 -> {
                readMyFile("DhakaUniversity", "C_Unit");
                System.out.println();
                System.out.print("Select subject you would like to apply : ");
                int subNumberForC = input.nextInt();

                for (int i=0; i<3; i++)
                    System.out.println();

                writeUniversitytInfo("Dhaka", "C", subNumberForC);
            }

            case 4 -> {
                readMyFile("DhakaUniversity", "D_Unit");
                System.out.println();
                System.out.print("Select subject you would like to apply : ");
                int subNumberForD = input.nextInt();

                for (int i=0; i<3; i++)
                    System.out.println();

                writeUniversitytInfo("Dhaka", "D", subNumberForD);
            }

            case 5 -> {
                readMyFile("DhakaUniversity", "F_Unit");
                System.out.println();
                System.out.print("Select subject you would like to apply : ");
                int subNumberForF = input.nextInt();

                for (int i=0; i<3; i++)
                    System.out.println();

                writeUniversitytInfo("Dhaka", "F", subNumberForF);
            }

            default -> System.out.print("Please select Units using 1-5");
        }
    }
}
