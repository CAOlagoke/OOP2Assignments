import java.util.*;
import java.time.*;

public class Bed {

    private int bedId;
    private ArrayList<Device> devices;
    private Patient patient;
    private boolean isOccupied;

    public Bed(int bedId) {

        this.bedId = bedId;
        this.devices = new ArrayList<>();
        this.patient = null;
        this.isOccupied = false;                    //Needs to be set to true if patient is not null

    }

    public int getBedId() {
        return bedId;
    }

    public void setBedId(int bedId) {
        this.bedId = bedId;
    }

    public ArrayList<Device> getDevices() {
        return devices;
    }

    public void setDevices(ArrayList<Device> devices) {
        this.devices = devices;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;

        for(Device device : this.devices){
            device.setPatient(patient);
        }

        setOccupied(true);
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }


    public void removePatient(){

        setPatient(null);
    }

    public void addDevice(Device device){

       getDevices().add(device);
    }

}
