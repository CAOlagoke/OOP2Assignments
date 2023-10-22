import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator implements Validateable{

    public EmailValidator() {
    }

    @Override
    public boolean validate(User user) {

        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(user.getEmail());

        if(matcher.matches()){
            return true;
        }

        return false;
    }

    @Override
    public String getErrorMessage() {

        String result = "error: incorrect email entered";

        return result;
    }
}
