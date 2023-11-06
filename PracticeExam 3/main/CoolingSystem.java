public class CoolingSystem implements StatusManager{

    private double waterTemperature;

    public CoolingSystem() {
        this.waterTemperature = 0;
    }

    public double getWaterTemperature() {
        return waterTemperature;
    }

    public void setWaterTemperature(double waterTemperature) {
        this.waterTemperature = waterTemperature;
    }

    public Status getStatus() {

        if(getWaterTemperature()>=80 && getWaterTemperature()<90){

            return Status.NeedsAttention;
        }else if(getWaterTemperature()>=90){

            return Status.Unstable;
        }

        return Status.Stable;
    }


    public void abductResidualHeat(double residualHeat){

        double result = residualHeat * 0.4;

        setWaterTemperature(result);
    }

}
