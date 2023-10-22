import java.time.LocalTime;
import java.util.ArrayList;

public class CheckInSystem extends HotelSystem{

    public CheckInSystem() {
    }


    public boolean checkInGuest(Guest guest, String bookingId){

        Booking verifiedBookingId = null;
        for(Booking b : getBookingStorage().getBookings()){

            if(b.getBookingId() == bookingId){

               verifiedBookingId = b;
            }
        }

        if(verifiedBookingId != null){

            LocalTime checkInTime = LocalTime.now();
            CheckIn gCheckIn = new CheckIn(verifiedBookingId, checkInTime);
            if(gCheckIn.verifyGuestID(guest)){


                System.out.println("Booking made by: " + verifiedBookingId.getGuest().getEmail() + " was found in System");
                System.out.println("Payment to be made: " + verifiedBookingId.calculateBookingCost());

                //Asks receptionist to enter "Y" if payment has been made
                boolean paymentComplete = true;
                if (paymentComplete) {
                    verifiedBookingId.setCheckedIn(true); //Set booking to complete

                    //Asks for guestInformation
                    boolean useThePool = true;
                    boolean skipCleaning = true;
                    boolean wantCleanTowel = true;

                    GuestPreference gPreference = new GuestPreference(useThePool, skipCleaning, wantCleanTowel);


                    gCheckIn.setGuestPreference(gPreference);
                    gCheckIn.setNoOfGuests(noOfGuests);

                    verifiedBookingId.getRoom().setGuestHasCheckedIn(true);
                    this.checkIns.add(gCheckIn);                    //Add new checkIn to list of checkIns

                    System.out.println(verifiedBookingId.getGuest().getName() + " has been checked into room " + verifiedBookingId.getRoom().getId());

                    return true;
                } else {
                    System.out.println("Entered email does not match email on booking:" + bookingId);
                }

            } else {
                System.out.println("Wrong guest information");
            }
        }

        return false;
    }


}
