public class HeartRateMonitor extends Device{

    private String status;

    public HeartRateMonitor(String serialNumber, int energyConsumption) {
        super(serialNumber, energyConsumption);
        this.status = null;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
    public String determineStatus(){

        String result ="";
        char male = 'M';
        char female = 'F';
        if(getPatient() == null){

            try{
                throw new PatientIsNullExecption("Patient is null");
            } catch (PatientIsNullExecption patientIsNullExecption) {

                patientIsNullExecption.printStackTrace();
            }
        }else{
            if(getPatient().getSex() == male){

                int heartrate = getPatient().getHeartRate();

                if(heartrate>= 60 && heartrate < 75){

                    result +=  Status.NORMAL;

                }else if(heartrate>= 75 && heartrate <= 100){

                    result += Status.WARNING;
                }else if(heartrate< 60 && heartrate > 100){

                    result += Status.CRITICAL;
                }
            }else if(getPatient().getSex() == female){

                int heartrate = getPatient().getHeartRate();

                if(heartrate>= 70 && heartrate < 80){

                    result +=  Status.NORMAL;

                }else if(heartrate>= 80 && heartrate <= 110){

                    result += Status.WARNING;
                }else if(heartrate< 70 && heartrate > 110){

                    result += Status.CRITICAL;
                }
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
        }else{

            System.out.println(getPatient().getFirstName() + " " + getPatient().getLastName() +" bloodPressure is: "+ determineStatus());
        }
    }
}
