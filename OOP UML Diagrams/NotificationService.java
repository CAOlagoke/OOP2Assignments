import java.util.*;
public class NotificationService {

    private ArrayList<NotifyListener> departments;

    public NotificationService() {
        this.departments = new ArrayList<>();
    }

    public void subscribe(NotifyListener department){

        ArrayList<Activity> a = new ArrayList<>();
        Housekeeping nH = new Housekeeping(a, true);
        
        this.departments.add(nH);
        this.departments.add(department);
    }

    public ArrayList<NotifyListener> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<NotifyListener> departments) {
        this.departments = departments;
    }
}
