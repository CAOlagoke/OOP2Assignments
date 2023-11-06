package Food;

public abstract class Vegetable extends Food {

    private double moistPercentage;
    private double moistFactor;

    public Vegetable(double browningFactor, double moistPercentage, double moistFactor) {
        super(browningFactor);
        this.moistPercentage = moistPercentage;
        this.moistFactor = moistFactor;
    }

    public double getMoistPercentage() {
        return moistPercentage;
    }

    public void setMoistPercentage(double moistPercentage) {
        this.moistPercentage = moistPercentage;
    }

    public double getMoistFactor() {
        return moistFactor;
    }

    public void setMoistFactor(double moistFactor) {
        this.moistFactor = moistFactor;
    }

    public void decreaseMoistPercentage(double difference){

        setMoistPercentage((getMoistPercentage() - difference));
    }

    @Override
    public abstract void grill(double temperature);

    public abstract String toString();
}