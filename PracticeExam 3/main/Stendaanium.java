import java.util.ArrayList;

public class Stendaanium extends SplittingRod{

    public Stendaanium() {
    }

    @Override
    public ArrayList<Double> split(double temperature, int time) throws MeltdownException {

        if(temperature > 150){
            throw new MeltdownException("Meltdown on Stendaanium rod");
        }
       if(temperature >= 50){

            double residualPercentageDecrease = (0.00007 * temperature * time) + 0.0004;
            double newResidualPercent  = this.getResidualPercentage() - residualPercentageDecrease;
            this.setResidualPercentage(newResidualPercent);
        }

        ArrayList<Double> result = new ArrayList();

        double residualHeat = (time/0.5) * 20;
        double amtOfSteam =  temperature * 70;

        result.add(residualHeat);
        result.add(amtOfSteam);

        return result;
    }
}
