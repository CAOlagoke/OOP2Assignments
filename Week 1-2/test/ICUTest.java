import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ICUTest {

    private ICU icu;
    private Patient patient1;
    private ArrayList<Device> devices;
    private Bed bed;

    @BeforeEach
    void setUp(){

        this.icu = new ICU("Wing 2A", 4);
        this.patient1 = new Patient("Axel", "Laxus", LocalDate.parse("2000-01-20"),'M',true);
        System.out.println("Patient1 id: " + this.patient1.getPatientId());

        this.devices = new ArrayList<>();
        Device device1 = new BloodPressureMonitor("bp113", 33);
        Device device2 = new HeartRateMonitor("hm1115",20);
        this.devices.add(device1);
        this.devices.add(device2);

        this.bed = new Bed(1);

        this.icu.addBed(this.bed);

        this.bed.setDevices(this.devices);              //Sets devices the patient needs

        this.bed.setPatient(patient1);
    }

    @Test
    void AdmitNewPatientThrowsCodeBlackException(){

        Patient patient2 = new Patient("Temu", "Avaxus", LocalDate.parse("1999-01-19"),'F',false);

        assertThrows(CodeBlackException.class, () -> {
        //Act
            this.icu.admitNewPatient(patient2,this.devices);
        });
    }

    @Test
    void AdmitNewPatientSuccess(){

        Patient patient2 = new Patient("Temu", "Avaxus", LocalDate.parse("1999-01-19"),'F',false);

        Bed bed2 = new Bed(2);

        this.icu.addBed(bed2);

        assertDoesNotThrow(() ->{
            this.icu.admitNewPatient(patient2,this.devices);
        });
    }

}