public abstract class Device {

    protected String serialNumber;
    protected int energyConsumption;
    protected Patient patient;                //Develop class

    public Device(String serialNumber, int energyConsumption) {
        this.serialNumber = serialNumber;
        this.energyConsumption = energyConsumption;
        this.patient = null;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getEnergyConsumption() {
        return energyConsumption;
    }

    public void setEnergyConsumption(int energyConsumption) {
        this.energyConsumption = energyConsumption;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    abstract String determineStatus();
    abstract void displayInformation();
}
