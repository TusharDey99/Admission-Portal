package mahi;

import java.util.Scanner;

public class Sust extends ReadFile{
    public void SelectFaculties() {
        readMyFile("SUST", "SUST_Units");

        System.out.print("Select eligible unit/s for you: ");
        Scanner input = new Scanner(System.in);
        int UnitNumber = input.nextInt();

            System.out.println();

        switch (UnitNumber) {
            case 1 -> {
                readMyFile("SUST", "A_Unit");
                System.out.println();
                System.out.print("Select subject you would like to apply : ");
                int subNumberForA = input.nextInt();

                for (int i=0; i<3; i++)
                    System.out.println();

                writeUniversitytInfo("Shahjalal University of science and technology", "A", subNumberForA);
            }

            case 2 -> {
                readMyFile("SUST", "B_Unit");
                System.out.println();
                System.out.print("Select subject you would like to apply : ");
                int subNumberForB = input.nextInt();

                for (int i=0; i<3; i++)
                    System.out.println();

                writeUniversitytInfo("Shahjalal University of science and technology", "B", subNumberForB);
            }

            default -> System.out.println("Please select Units using 1 / 2");
        }
    }
}
