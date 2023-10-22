public class Room {

    protected int id;
    protected boolean isBooked;
    protected boolean guestHasCheckedIn;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public boolean isGuestHasCheckedIn() {
        return guestHasCheckedIn;
    }

    public void setGuestHasCheckedIn(boolean guestHasCheckedIn) {
        this.guestHasCheckedIn = guestHasCheckedIn;
    }
}
