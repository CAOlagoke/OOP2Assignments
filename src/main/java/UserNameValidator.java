public class UserNameValidator implements Validateable{

    private UserStorage userStorage;

    public UserNameValidator() {

        this.userStorage = new UserStorage();
    }

    public UserStorage getUserStorage() {
        return userStorage;
    }

    public void setUserStorage(UserStorage userStorage) {
        this.userStorage = userStorage;
    }

    @Override
    public boolean validate(User user) {
        return false;
    }

    @Override
    public String getErrorMessage() {

        String result = "error: incorrect user details entered";

        return result;
    }
}
