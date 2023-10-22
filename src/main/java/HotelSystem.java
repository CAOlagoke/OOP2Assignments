import java.util.ArrayList;

public class HotelSystem {

    protected BookingStorage bookingStorage;
    protected ArrayList<Room> rooms;

    protected ArrayList<CheckIn> checkIns;

    public HotelSystem() {
        this.bookingStorage = new BookingStorage();
        this.rooms = new ArrayList<>();
        this.checkIns = new ArrayList<>();
    }

    public BookingStorage getBookingStorage() {
        return bookingStorage;
    }

    public void setBookingStorage(BookingStorage bookingStorage) {
        this.bookingStorage = bookingStorage;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public ArrayList<CheckIn> getCheckIns() {
        return checkIns;
    }

    public void setCheckIns(ArrayList<CheckIn> checkIns) {
        this.checkIns = checkIns;
    }
}
