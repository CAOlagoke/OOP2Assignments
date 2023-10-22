import java.util.ArrayList;

public class Restaurant extends Department{


    public Restaurant(Subject subject) {

        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    void notifyDepartment() {

        System.out.println("New guest has checked in");
    }
}
