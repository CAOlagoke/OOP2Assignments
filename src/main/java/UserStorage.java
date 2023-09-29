import java.util.ArrayList;

public class UserStorage {

    private ArrayList<User> storage;

    public UserStorage() {
        this.storage = new ArrayList<>();
    }

    public ArrayList<User> getStorage() {
        return storage;
    }

    public void setStorage(ArrayList<User> storage) {
        this.storage = storage;
    }
}
