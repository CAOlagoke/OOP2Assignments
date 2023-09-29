import java.util.*;

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

        for(Device device : this.devices){                  ////Sets patient's details on the devices
            device.setPatient(patient);
        }

        setIsOccupied(true);
    }

    public boolean getIsOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(boolean occupied) {
        isOccupied = occupied;
    }


    public void removePatient(){

        setPatient(null);
        setIsOccupied(false);
        setDevices(new ArrayList<>());
    }

    public void addDevice(Device device){

       getDevices().add(device);
    }

}
