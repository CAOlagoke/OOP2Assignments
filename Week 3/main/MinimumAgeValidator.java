public class MinimumAgeValidator implements Validateable{

    private int minimumAge;

    public MinimumAgeValidator(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    public int getMinimumAge() {
        return minimumAge;
    }

    public void setMinimumAge(int minimumAge) {
        this.minimumAge = minimumAge;
    }

    @Override
    public boolean validate(User user) {
        return false;
    }

    @Override
    public String getErrorMessage() {

        String result = "error: User is below minimum age";

        return result;
    }
}
