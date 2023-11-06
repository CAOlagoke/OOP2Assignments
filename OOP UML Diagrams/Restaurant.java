import java.util.ArrayList;

public class Restaurant extends HotelSystem implements NotifyListener{

    private boolean state;

    public Restaurant(Subject subject) {


    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    @Override
    public void updateState() {

        setState(true);
    }
}
