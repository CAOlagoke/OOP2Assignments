import java.util.ArrayList;

public class Nhlium extends SplittingRod{

    public Nhlium() {

    }
    @Override
    public ArrayList<Double> split(double temperature, int time) throws MeltdownException {          //residual heat(rw in Kelvin), amt of steam(m^3)

        if(this.getResidualPercentage() < 0.1 || (time>60 && temperature> 100)){
            throw new MeltdownException("Meltdown on Nhlium core");
        }
        double residualPercentageDecrease = 0.06 * time;
        double newResidualPercent  = this.getResidualPercentage() - residualPercentageDecrease;
        this.setResidualPercentage(newResidualPercent);

        double residualHeat=0;
        double amtOfSteam=0;

        ArrayList<Double> result = new ArrayList();

        if(temperature < 90){

            residualHeat = time * 3;
            amtOfSteam =  (temperature/70) * time * 0.9;
        }else{

            residualHeat = temperature / 10;
            amtOfSteam = 0.9 * ((temperature * 0.9)/time) * Math.sqrt(3) * time;
        }

        result.add(residualHeat);
        result.add(amtOfSteam);

        return result;
    }
}
