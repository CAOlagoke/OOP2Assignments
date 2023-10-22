import java.util.ArrayList;

public class BookingStorage {

    private ArrayList<Booking> bookings;

    public BookingStorage() {
        this.bookings = new ArrayList<>();
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }
}
