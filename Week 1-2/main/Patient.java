import java.util.*;
import java.time.*;

public class Patient {

    private int patientId;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private char sex;
    private int heartRate;
    private BloodPressure bloodPressure;
    private boolean canWalk;

    public Patient(String firstName, String lastName, LocalDate dateOfBirth, char sex, boolean canWalk) {

        int maxId = 10000;
        int minId = 1;

        this.patientId = (int) Math.floor(Math.random() * (maxId - minId + 1) + minId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.sex = sex;
        this.bloodPressure = new BloodPressure(0,0); //Create takeBloodPressure method
        this.heartRate = 0;                                         //Create takeHeartRate method
        this.canWalk = canWalk;
    }

    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public BloodPressure getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(BloodPressure bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public boolean getCanWalk() {
        return canWalk;
    }

    public void setCanWalk(boolean canWalk) {
        this.canWalk = canWalk;
    }

    public int getPatientAge(){

        int result = Period.between(getDateOfBirth(), LocalDate.now()).getYears();

        return result;
    }


}
