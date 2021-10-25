package mahi;

import java.util.Scanner;

public class UniversitySelection extends ReadFile{
    void selectUniversity(){

        readMyFile("AllUniversityList", "UniversityName");

        Scanner input = new Scanner(System.in);
        System.out.println("Choose university : ");
        int universityId = input.nextInt();

        switch (universityId) {
            case 1 -> {
                DhakaUniversity du = new DhakaUniversity();
                du.SelectFaculties();
            }

            case 2 -> {
                Buet buet = new Buet();
                buet.SelectFaculties();
            }

            case 3 -> {
                Sust sust = new Sust();
                sust.SelectFaculties();
            }

            case 4 -> {
                Cuet cuet = new Cuet();
                cuet.SelectFaculties();
            }

            case 5 -> {
                Ruet ruet = new Ruet();
                ruet.SelectFaculties();
            }

            default -> System.out.println("Choose properly idiot");
        }
    }
}
