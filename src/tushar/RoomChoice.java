package tushar;

import java.util.Scanner;
import  akhi.*;

public class RoomChoice {

    Scanner input = new Scanner(System.in);
    StudentDorm studentDorm = new StudentDorm();
    public int dormChoice, roomCost;

    void roomChoose()
    {
        System.out.println("Are you interested booking a student dorm?");
        System.out.println("1. Yes.");
        System.out.println("2. No.");
        System.out.print("Enter your choice(1/2): ");
        dormChoice = input.nextInt();

        while (dormChoice < 1 || dormChoice > 2)
        {
            System.out.println("Invalid input. Try again.");
            System.out.println("Are you interested booking a student dorm?");
            System.out.println("1. Yes.");
            System.out.println("2. No.");
            System.out.print("Enter your choice(1/2): ");
            dormChoice = input.nextInt();
        }

        if (dormChoice == 1)
        {
            roomCost = studentDorm.dormBooking();
        }
    }
}
