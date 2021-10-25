package mahi;

import java.util.Scanner;

public class Buet extends ReadFile{

    public void SelectFaculties() {
        readMyFile("BUET", "buetFaculties");

        System.out.print("Select faculty number: ");

        Scanner input = new Scanner(System.in);
        int facultyNumber = input.nextInt();

            System.out.println();

        String facultyName;

        switch (facultyNumber) {
            case 1 -> {
                readMyFile("BUET", "arc");
                facultyName = "Architecture and Planning";
                System.out.println();
                System.out.print("Now select the department you would like to apply : ");
                int deptName1 = input.nextInt();

                for (int i=0; i<3; i++)
                    System.out.println();

                writeUniversitytInfo("BUET", facultyName, deptName1);
            }

            case 2 -> {
                readMyFile("BUET", "civil");
                facultyName = "Civil Engineering";
                System.out.println();
                System.out.print("Now select the department you would like to apply : ");
                int deptName2 = input.nextInt();

                for (int i=0; i<3; i++)
                    System.out.println();

                writeUniversitytInfo("BUET", facultyName, deptName2);
            }

            case 3 -> {
                readMyFile("BUET", "eee");
                facultyName = "Electrical and Electronic Engineering";
                System.out.println();
                System.out.print("Now select the department you would like to apply : ");
                int deptName3 = input.nextInt();

                for (int i=0; i<3; i++)
                    System.out.println();

                writeUniversitytInfo("BUET", facultyName, deptName3);
            }

            case 4 -> {
                readMyFile("BUET", "general");
                facultyName = "General Engineering";
                System.out.println();
                System.out.print("Now select the department you would like to apply : ");
                int deptName4 = input.nextInt();

                for (int i=0; i<3; i++)
                    System.out.println();

                writeUniversitytInfo("BUET", facultyName, deptName4);
            }

            case 5 -> {
                readMyFile("BUET", "me");
                facultyName = "Mechanical Engineering";
                System.out.println();
                System.out.print("Now select the department you would like to apply : ");
                int deptName5 = input.nextInt();

                for (int i=0; i<3; i++)
                    System.out.println();

                writeUniversitytInfo("BUET", facultyName, deptName5);
            }

            default -> System.out.print("Please select faculty using 1-5");
        }
    }
}
