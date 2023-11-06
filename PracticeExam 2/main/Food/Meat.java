package Food;

public abstract class Meat extends Food{

    protected double currentCookedPercentage;
    private double cookingFactor;
    private MeatType meatType;

    public Meat(double browningFactor, double currentCookedPercentage, double cookingFactor, MeatType meatType) {
        super(browningFactor);
        this.currentCookedPercentage = 0;
        this.cookingFactor = cookingFactor;
        this.meatType = meatType;
    }

    public double getCurrentCookedPercentage() {
        return currentCookedPercentage;
    }

    public void setCurrentCookedPercentage(double currentCookedPercentage) {
        this.currentCookedPercentage = currentCookedPercentage;
    }

    public double getCookingFactor() {
        return cookingFactor;
    }

    public void setCookingFactor(double cookingFactor) {
        this.cookingFactor = cookingFactor;
    }

    public MeatType getMeatType() {
        return meatType;
    }

    public void setMeatType(MeatType meatType) {
        this.meatType = meatType;
    }

    @Override
    public abstract void grill(double temperature);

    public abstract String toString();
}
