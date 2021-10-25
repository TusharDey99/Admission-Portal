package akhi;

public class Main {
    public static void main(String[] args) {
        StudentDorm studentDorm = new StudentDorm();
        int roomCost = studentDorm.dormBooking();

        System.out.println(roomCost);
    }
}
