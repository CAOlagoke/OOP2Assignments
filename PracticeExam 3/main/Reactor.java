import java.util.HashSet;
import java.util.Iterator;

public class Reactor implements StatusManager{

    private HashSet<SplittingRod> cores;

    public Reactor() {
        this.cores = new HashSet<>();
    }

    public HashSet<SplittingRod> getCores() {
        return cores;
    }

    public void setCores(HashSet<SplittingRod> cores) {
        this.cores = cores;
    }

    public Status getStatus() {

        Iterator<SplittingRod> iterator = getCores().iterator();

        while(iterator.hasNext()){
            if((iterator.next().getResidualPercentage() < 0.2 ||(getCores().size() == 1 && iterator.next().getResidualPercentage() < 100))){
                return Status.NeedsAttention;
            }
        }
        return Status.Stable;
    }


    public void addCore(SplittingRod splittingRod){

        this.cores.add(splittingRod);
    }

}
