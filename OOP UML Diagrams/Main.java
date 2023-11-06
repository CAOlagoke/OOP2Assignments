import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

//        boolean end = false;
//
//        HotelSystem hSystem = new HotelSystem();
//        CheckInSystem cInSys = new CheckInSystem();
//
//        Subject subject = new Subject();
//        Restaurant restaurant = new Restaurant(subject);
//
//        Housekeeping housekeeping = new Housekeeping(subject);
//        while(!end){
//
//            System.out.println("==== TOUCAN GIANT HOTELS ====");
//            System.out.println("Check-in Guest");

//            Guest guest = new Guest();
//            if(cInSys.checkInGuest(Guest guest, "bookingId")){
//                subject.setNewCheckIn(true);
//            }

        NotificationService n = new NotificationService();

        ArrayList<Activity> a = new ArrayList<>();
        Housekeeping nH1 = new Housekeeping(a, true);

        n.subscribe(nH1);
        System.out.println(n.getDepartments());
    }

}
