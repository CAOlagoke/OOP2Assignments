import java.util.ArrayList;

public abstract class SplittingRod {

    protected double residualPercentage;

    public SplittingRod() {

        this.residualPercentage = 100;
    }

    public double getResidualPercentage() {
        return residualPercentage;
    }

    public void setResidualPercentage(double residualPercentage) {
        this.residualPercentage = residualPercentage;
    }

    public abstract ArrayList<Double> split(double temperature, int time) throws MeltdownException;       //returns residual heat(rw in Kelvin), amt of steam(m^3)
}
