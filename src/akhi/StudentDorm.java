package akhi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class StudentDorm {

    Scanner scanner = new Scanner(System.in);

    int associates, stay, roomNumber;
    int[] RM1 = {0, 2990, 2090, 3999, 5999};
    int[] RM2 = {0, 3499, 4899, 5000, 5999};
    int[] RM3 = {0, 6000, 5000, 4000, 8000, 10000};

    public int dormBooking()
    {
        System.out.println();
        System.out.print("Enter the number of people(not more than 3 person including you): ");
        associates = scanner.nextInt();
        while(associates < 0 || associates > 3)
        {
            System.out.println("Invalid input. Try again.");
            System.out.print("Enter the number of people(not more than 3 person including you): ");
            associates = scanner.nextInt();
        }

        System.out.print("Enter the time of your stay(no more than 3 days): ");
        stay = scanner.nextInt();
        while(stay < 0 || stay > 3)
        {
            System.out.println("Invalid input. Try again.");
            System.out.print("Enter the number of people(not more than 3 person including you): ");
            associates = scanner.nextInt();
        }

        if (associates == 1)
        {
            try{
                BufferedReader dept = new BufferedReader(new FileReader
                        ("C:\\Games\\Test\\ForOne.txt"));

                String text;
                while ((text = dept.readLine()) != null){
                    System.out.println(text);
                }

                dept.close();
            }catch (Exception ignored){
            }

            System.out.print("Choose the room number: ");
            roomNumber = scanner.nextInt();
            while(roomNumber < 0 || roomNumber > 4)
            {
                System.out.println("Invalid input. Try again.");
                System.out.print("Choose the room number: ");
                roomNumber = scanner.nextInt();
            }
        }

        else if (associates == 2)
        {
            try{
                BufferedReader dept = new BufferedReader(new FileReader
                        ("C:\\Games\\Test\\ForTwo.txt"));

                String text;
                while ((text = dept.readLine()) != null){
                    System.out.println(text);
                }

                dept.close();
            }catch (Exception ignored){
            }

            System.out.print("Choose the room number: ");
            roomNumber = scanner.nextInt();
            while(roomNumber < 0 || roomNumber > 4)
            {
                System.out.println("Invalid input. Try again.");
                System.out.print("Choose the room number: ");
                roomNumber = scanner.nextInt();
            }
        }

        else
        {
            try{
                BufferedReader dept = new BufferedReader(new FileReader
                        ("C:\\Games\\Test\\ForThree.txt"));

                String text;
                while ((text = dept.readLine()) != null){
                    System.out.println(text);
                }

                dept.close();
            }catch (Exception ignored){
            }

            System.out.print("Choose the room number: ");
            roomNumber = scanner.nextInt();
            while(roomNumber < 0 || roomNumber > 5)
            {
                System.out.println("Invalid input. Try again.");
                System.out.print("Choose the room number: ");
                roomNumber = scanner.nextInt();
            }
        }

        if(associates == 1)
            return RM1[roomNumber]*stay;
        else if(associates == 2)
            return RM2[roomNumber]*stay;
        else
            return RM3[roomNumber]*stay;
    }
}
