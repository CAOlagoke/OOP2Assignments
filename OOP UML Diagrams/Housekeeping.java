import java.util.ArrayList;

public class Housekeeping extends HotelSystem implements NotifyListener{

    private ArrayList<Activity> activities;
    private boolean state;
    public Housekeeping(ArrayList<Activity> activities, boolean state) {
        this.activities = activities;
        this.state = state;
    }

    public ArrayList<Activity> getActivities() {
        return activities;
    }

    public void setActivities(ArrayList<Activity> activities) {
        this.activities = activities;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public void updateState() {

        setState(true);
    }
}
