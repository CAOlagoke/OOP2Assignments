import java.util.ArrayList;

public class Subject {

    private ArrayList<Department> departments = new ArrayList<Department>();
    private boolean newCheckIn; //Used to notify all departments


    public boolean getNewCheckIn() {
        return newCheckIn;
    }

    public void setNewCheckIn(boolean newCheckIn) {
        this.newCheckIn = newCheckIn;
        if(newCheckIn == true){

            notifyAllDepartments();
        }
    }

    public void attach(Department department){

        departments.add(department);
    }

    public void notifyAllDepartments() {

        for(Department department : this.departments){
            department.notify();
        }
    }

}
