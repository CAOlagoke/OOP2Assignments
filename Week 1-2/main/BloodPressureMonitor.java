
public class BloodPressureMonitor extends Device{

    private String status;

    public BloodPressureMonitor(String serialNumber, int energyConsumption) {
        super(serialNumber, energyConsumption);
        this.status = "";
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String determineStatus() {

        String result = "";

        if(getPatient() == null){

            try{
                throw new PatientIsNullExecption("Patient is null");
            } catch (PatientIsNullExecption patientIsNullExecption) {

                patientIsNullExecption.printStackTrace();
            }
        }else{

            int systolic = getPatient().getBloodPressure().getSystolic();
            int diastolic = getPatient().getBloodPressure().getDiastolic();

            if( systolic> 120 && diastolic > 80){

                result +=  Status.NORMAL;

            }else if((systolic >140 || systolic < 120) && (diastolic > 90 || diastolic < 80)){

                result += Status.WARNING;
            }else if(systolic > 180 && diastolic > 110){

                result += Status.CRITICAL;
            }
        }

        setStatus(result);              //Sets

        return result;
    }

    @Override
    void displayInformation() {

        if(getPatient() == null){

            try{
                throw new PatientIsNullExecption("Patient is null");
            } catch (PatientIsNullExecption patientIsNullExecption) {

                patientIsNullExecption.printStackTrace();
            }
        } else{

            System.out.println(getPatient().getFirstName() + " " + getPatient().getLastName() +" bloodPressure is: "+ determineStatus());
        }

    }
}
