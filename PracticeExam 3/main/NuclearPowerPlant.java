import java.util.ArrayList;
import java.util.Iterator;

public class NuclearPowerPlant {

    private Reactor reactor;
    private Generator generator;
    private CoolingSystem coolingSystem;
    private ControlRoom controlRoom;

    public NuclearPowerPlant() {

        this.reactor = new Reactor();
        this.generator = new Generator();
        this.coolingSystem = new CoolingSystem();
        this.controlRoom = new ControlRoom();
		
		this.controlRoom.addBuilding(this.reactor);
		this.controlRoom.addBuilding(this.generator);
		this.controlRoom.addBuilding(this.coolingSystem);
    }

    public Reactor getReactor() {
        return reactor;
    }

    public void setReactor(Reactor reactor) {
        this.reactor = reactor;
    }

    public Generator getGenerator() {
        return generator;
    }

    public void setGenerator(Generator generator) {
        this.generator = generator;
    }

    public CoolingSystem getCoolingSystem() {
        return coolingSystem;
    }

    public void setCoolingSystem(CoolingSystem coolingSystem) {
        this.coolingSystem = coolingSystem;
    }

    public double run(double temperature, int time) throws MeltdownException {

        double result = 0;   //Returns kWh produced by generator
        double totalResidualHeat = 0;
        double totalAmtOfSteam = 0;
        ArrayList<Double> tempSplitResult = new ArrayList();
        Iterator<SplittingRod> iterator = getReactor().getCores().iterator();

        while(iterator.hasNext()){
           tempSplitResult= iterator.next().split(temperature, time);

           totalResidualHeat+= tempSplitResult.get(0);
           totalAmtOfSteam+= tempSplitResult.get(1);
        }

        getCoolingSystem().abductResidualHeat(totalResidualHeat);
        getGenerator().generateEnergy(totalAmtOfSteam);

        result = getGenerator().getProducedKWh();

        return result;
    }
}
