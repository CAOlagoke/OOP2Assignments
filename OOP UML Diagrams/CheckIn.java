import java.time.LocalTime;

public class CheckIn {

    private Booking booking;
    private GuestPreference guestPreference;
    private LocalTime checkInTime;

    private int noOfGuests;

    public CheckIn(Booking booking, LocalTime checkInTime) {
        this.booking = booking;
        this.guestPreference = getGuestPreference(); //Set guestPrefernce
        this.checkInTime = checkInTime;
        this.noOfGuests = 0; //Set noOfGuests
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public GuestPreference getGuestPreference() {
        return guestPreference;
    }

    public void setGuestPreference(GuestPreference guestPreference) {
        this.guestPreference = guestPreference;
    }

    public LocalTime getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(LocalTime checkInTime) {
        this.checkInTime = checkInTime;
    }

    public int getNoOfGuests() {
        return noOfGuests;
    }

    public void setNoOfGuests(int noOfGuests) {
        this.noOfGuests = noOfGuests;
    }

    public boolean verifyGuestID(Guest guest) {

        return false;
    }
}
