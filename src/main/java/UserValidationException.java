public class UserValidationException extends Exception{

    public UserValidationException(Validateable validateable){

        super(validateable.getErrorMessage());
    }
}
