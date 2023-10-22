import java.util.ArrayList;

public class Housekeeping extends Department{

    public Housekeeping(Subject subject) {

        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void notifyDepartment() {

        System.out.println("New guest has checked in");
    }
}
