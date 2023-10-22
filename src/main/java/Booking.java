public class Booking {

    protected String bookingId;
    protected Guest guest;
    protected boolean checkedIn;
    protected Room room;

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }


    public double calculateBookingCost() {

        double result = 0;

        return result;
    }

    public int calculateNoOfGuests(){

        int result = 0;
        return result;
    }
}
