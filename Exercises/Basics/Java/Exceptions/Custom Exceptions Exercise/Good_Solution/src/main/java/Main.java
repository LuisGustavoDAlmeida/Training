import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            System.out.println("Room Number: ");
            Integer roomNumber = sc.nextInt();

            System.out.println("Check-In date (dd/MM/yyyy): ");
            Date checkIn = sdf.parse(sc.next()); // Entrando com texto e convertendo pra data

            System.out.println("Check-Out date (dd/MM/yyyy):");
            Date checkOut = sdf.parse(sc.next());

            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println(reservation);

            System.out.println("\nEnter data to update the reservation: ");

            System.out.println("Check-In date (dd/MM/yyyy): ");
            checkIn = sdf.parse(sc.next());

            System.out.println("Check-Out date (dd/MM/yyyy):");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);

        } catch (ParseException e) {
            System.out.println("Invalid date format");
        } catch (DomainException e) {
            System.out.println("Error in reservation: " + e.getMessage());
        } catch (RuntimeException e){ // Ele faz o upcast pra RuntimeException e qualquer outra exceção que
            // Não foi definida cairá aqui
            System.out.println("Unexpected Error");
        }

        sc.close();
    }
}
