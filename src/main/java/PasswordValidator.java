public class PasswordValidator implements Validateable{

    private boolean isSpaceAllowed;
    private boolean areSpecialCharactersMandatory;
    private boolean areNumbersRequired;
    private boolean isLowerCaseRequired;
    private boolean isUpperCaseRequired;

    public PasswordValidator(boolean isSpaceAllowed, boolean areSpecialCharactersMandatory, boolean areNumbersRequired, boolean isLowerCaseRequired, boolean isUpperCaseRequired) {
        this.isSpaceAllowed = isSpaceAllowed;
        this.areSpecialCharactersMandatory = areSpecialCharactersMandatory;
        this.areNumbersRequired = areNumbersRequired;
        this.isLowerCaseRequired = isLowerCaseRequired;
        this.isUpperCaseRequired = isUpperCaseRequired;
    }

    public boolean isSpaceAllowed() {
        return isSpaceAllowed;
    }

    public void setSpaceAllowed(boolean spaceAllowed) {
        isSpaceAllowed = spaceAllowed;
    }

    public boolean isAreSpecialCharactersMandatory() {
        return areSpecialCharactersMandatory;
    }

    public void setAreSpecialCharactersMandatory(boolean areSpecialCharactersMandatory) {
        this.areSpecialCharactersMandatory = areSpecialCharactersMandatory;
    }

    public boolean isAreNumbersRequired() {
        return areNumbersRequired;
    }

    public void setAreNumbersRequired(boolean areNumbersRequired) {
        this.areNumbersRequired = areNumbersRequired;
    }

    public boolean isLowerCaseRequired() {
        return isLowerCaseRequired;
    }

    public void setLowerCaseRequired(boolean lowerCaseRequired) {
        isLowerCaseRequired = lowerCaseRequired;
    }

    public boolean isUpperCaseRequired() {
        return isUpperCaseRequired;
    }

    public void setUpperCaseRequired(boolean upperCaseRequired) {
        isUpperCaseRequired = upperCaseRequired;
    }

    @Override
    public boolean validate(User user) {

        return false;
    }

    @Override
    public String getErrorMessage() {

        String result = "error: incorrect password entered";

        return result;
    }
}
