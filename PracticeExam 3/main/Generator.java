public class Generator implements StatusManager{

    private double producedKWh;

    public Generator() {
        this.producedKWh = 0;
    }

    public double getProducedKWh() {
        return producedKWh;
    }

    public void setProducedKWh(double producedKWh) {
        this.producedKWh = producedKWh;
    }

    public Status getStatus() {

        if(getProducedKWh() > 560){
            return Status.Unstable;
        }
        return Status.Stable;
    }


    public double generateEnergy(double steam){

        double result = steam * 8;

        double newProducedKWhTotal = getProducedKWh() + result;
        setProducedKWh(newProducedKWhTotal);

        return result;
    }

}
