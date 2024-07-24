import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Room Number: ");
        Integer roomNumber = sc.nextInt();

        System.out.println("Check-In date (dd/MM/yyyy): ");
        Date checkIn = sdf.parse(sc.next()); // Entrando com texto e convertendo pra data

        System.out.println("Check-Out date (dd/MM/yyyy):");
        Date checkOut = sdf.parse(sc.next());

        if (checkOut.before(checkIn)){
            System.out.println("Error in Reservation: Check-out date must be after Check-in date");
        } else {
            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println("\nEnter data to update the reservation: ");

            System.out.println("Check-In date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());

            System.out.println("Check-Out date (dd/MM/yyyy):");
            checkOut = sdf.parse(sc.next());

            // Início da solução didática ruim, movemos o tratamento de erro para a classe que gera ele
            String error = reservation.updateDates(checkIn, checkOut);
            if (error != null) {
                System.out.println("Error in reservation: " + error);
            } else {
                System.out.println("Reservation: " + error);
            }
        }
        sc.close();
    }
}
