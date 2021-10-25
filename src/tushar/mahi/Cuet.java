package mahi;

import java.util.Scanner;

public class Cuet extends ReadFile{

    public void SelectFaculties() {
        readMyFile("CUET", "cuetFaculties");

        System.out.print("Select eligible unit/faculty for you: ");

        Scanner input = new Scanner(System.in);
        int UnitNumber = input.nextInt();

            System.out.println();

        switch (UnitNumber) {
            case 1 -> {
                readMyFile("CUET", "civil");
                System.out.println();
                System.out.print("Select subject you would like to apply : ");
                int subNumberForA = input.nextInt();

                for (int i=0; i<3; i++)
                    System.out.println();

                writeUniversitytInfo("Chittagong University of Engineering & Technology", "Civil Engineering", subNumberForA);
            }

            case 2 -> {
                readMyFile("CUET", "me");
                System.out.println();
                System.out.print("Select subject you would like to apply : ");
                int subNumberForB = input.nextInt();

                for (int i=0; i<3; i++)
                    System.out.println();

                writeUniversitytInfo("Chittagong University of Engineering & Technology", "Mechanical Engineering", subNumberForB);
            }

            case 3 -> {
                readMyFile("CUET", "ece");
                System.out.println();
                System.out.print("Select subject you would like to apply : ");
                int subNumberForC = input.nextInt();

                for (int i=0; i<3; i++)
                    System.out.println();

                writeUniversitytInfo("Chittagong University of Engineering & Technology", "Electrical & Computer Engineering", subNumberForC);
            }

            case 4 -> {
                readMyFile("CUET", "arc");
                System.out.println();
                System.out.print("Select subject you would like to apply : ");
                int subNumberForD = input.nextInt();

                for (int i=0; i<3; i++)
                    System.out.println();

                writeUniversitytInfo("Chittagong University of Engineering & Technology", "Architecture & Planning", subNumberForD);
            }

            case 5 -> {
                readMyFile("CUET", "et");
                System.out.println();
                System.out.print("Select subject you would like to apply : ");
                int subNumberForE = input.nextInt();

                for (int i=0; i<3; i++)
                    System.out.println();

                writeUniversitytInfo("Chittagong University of Engineering & Technology", "Engineering & Technology", subNumberForE);
            }

            default -> System.out.print("Please select Units using 1-5");
        }
    }
}
