import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {
    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Estático para
    // Não criar um novo sdf para cada objeto Reservation da app

    public Reservation() {
    }

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public Long duration(){
        Long difference = checkOut.getTime() - checkIn.getTime() ; // Calcula a diferença baseado em ms
        return TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS); // Convertendo de ms para dias
    }

    public void updateDates(Date checkIn, Date checkOut){
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return """
                Room
                Room Number: %d
                Check In: %s
                Check Out: %s
                Duration: %d, nights""".formatted(roomNumber, checkIn, checkOut, duration());
    }
}
