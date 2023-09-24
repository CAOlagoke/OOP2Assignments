import java.util.*;

public class ICU {

    private String location;
    private ArrayList<Bed> beds;
    private ArrayList<Patient> patients; //Create a method to Update list of patients
    private double currentAmtOfFTEs;

    public ICU(String location, double currentAmtOfFTEs) {

        this.location = location;
        this.currentAmtOfFTEs = currentAmtOfFTEs;
        this.beds = new ArrayList<>();

        if(this.beds.size() == 0){
            this.patients = new ArrayList<>();
        }else{
            updatePatients();
        }

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<Bed> getBeds() {
        return beds;
    }

    public void setBeds(ArrayList<Bed> beds) {
        this.beds = beds;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public double getCurrentAmtOfFTEs() {
        return currentAmtOfFTEs;
    }

    public void setCurrentAmtOfFTEs(double currentAmtOfFTEs) {
        this.currentAmtOfFTEs = currentAmtOfFTEs;
    }

    public void addBed(Bed bed){

        this.beds.add(bed);
    }

    public void addBeds(ArrayList<Bed> beds){

        for(Bed bed : beds){
            this.beds.add(bed);
        }
    }

    public boolean BedisAvailable(){

        for(Bed bed : getBeds()){
            if(bed.getPatient() == null){

                return true;
            }
        }

        return false;
    }


    public double calculatePatientFTE(Patient patient, ArrayList<Device> devices){

        double result = 0;

        int pDependency=0;
        if(patient.getCanWalk() == true){
            pDependency=1;
        }else{
            pDependency=2;
        }

        int bpMonitors = 0;
        int hMonitors =  0;
        for(Device device : devices){
            if( device instanceof BloodPressureMonitor){

                bpMonitors+= 1;
            }else if(device instanceof HeartRateMonitor){

                hMonitors+= 1;
            }
        }

        result =  ((hMonitors * 0.3) + (bpMonitors * 0.1) + pDependency);

        return result;
    }

    public boolean AdmitNewPatient(Patient patient, ArrayList<Device> devices){

        if(BedisAvailable() == false){

            try{
                throw new CodeBlackException("There's no free bed in " + getLocation());
            } catch (CodeBlackException e) {
                e.printStackTrace();
            }
        }else{
            if(calculatePatientFTE(patient, devices) + getCurrentAmtOfFTEs() > totalFTEsRequired()){
                return false;
            }else {
                for (Bed bed : getBeds()) {           //Check if patient FTE + currentFTE is less than requiredFTEs
                    if (bed.getPatient() == null) {

                        bed.setDevices(devices);
                        bed.setPatient(patient);
                        break;
                    }
                }
                return true;
            }
        }

        return false;
    }

    public void updatePatients(){

        ArrayList<Patient> result = new ArrayList<>();
        for(Bed bed : getBeds()){

            if(bed.getPatient() != null){

                result.add(bed.getPatient());
            }
        }

        setPatients(result);
    }

    public ArrayList<Bed> occupiedBeds(){

        ArrayList<Bed> result = new ArrayList<>();

        for(Bed bed : getBeds()){
            if(bed.getPatient() != null){

                result.add(bed);
            }
        }

        return result;
    }

    public int calculateDependency(Bed bed){

        int result = 0;
        if(bed.getPatient() == null){

            try{
                throw new PatientIsNullExecption("Patient is null");
            } catch (PatientIsNullExecption patientIsNullExecption) {

                patientIsNullExecption.printStackTrace();
            }
        }else{
            result+= 1;                             //Patient is 1 Dependency

            for(Device device : bed.getDevices()){
                result+= 1;
            }
        }

        return result;
    }


    public double totalFTEsRequired(){

        double result = 0;

        int totalDependency = 0;          // hMonitors+ bpMonitors+ cwPatients+ bPatients



        for(Bed bed : occupiedBeds()){

            totalDependency+= calculateDependency(bed);
        }

        if(totalDependency <= 5){

            for(Bed bed : occupiedBeds()){

                int hMonitors =  0;               //count of heartRate monitors
                int bpMonitors = 0;              //count of bloodPressure monitors
                int cwPatient = 0;               //count of canWalkPatient
                int bPatient =  0;                //count of can'tWalkPatient(Bedridden)
               for(Device device : bed.getDevices()){
                   if( device instanceof BloodPressureMonitor){

                       bpMonitors+= 1;
                   }else if(device instanceof HeartRateMonitor){

                       hMonitors+= 1;
                   }
               }

               if(bed.getPatient().getCanWalk()){
                 cwPatient++;
               }else{
                   bPatient++;
               }
                result+= ( (hMonitors * 0.3) + (bpMonitors * 0.1) + (cwPatient*1) + (bPatient*2) );

            }
        }else{//totalDependency > 5

            for(Bed bed : occupiedBeds()){

                int hMonitors =  0;               //count of heartRate monitors
                int bpMonitors = 0;              //count of bloodPressure monitors
                int cwPatient = 0;               //count of canWalkPatient
                int bPatient =  0;                //count of can'tWalkPatient(Bedridden)
                for(Device device : bed.getDevices()){
                    if( device instanceof BloodPressureMonitor){

                        bpMonitors+= 1;
                    }else if(device instanceof HeartRateMonitor){

                        hMonitors+= 1;
                    }
                }

                if(bed.getPatient().getCanWalk()){
                    cwPatient++;
                }else{
                    bPatient++;
                }
                result+= ( (hMonitors * 0.3) + (bpMonitors * 0.1) + (cwPatient*1) + (bPatient*2) + (totalDependency * 0.2) );

            }
        }
        return result;
    }


}
