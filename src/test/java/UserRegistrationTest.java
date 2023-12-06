import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CustomException extends RuntimeException{
    public CustomException(String msg){
        super(msg);
    }
}

class UserRegistrationTest {

    @Test
    public void firstNameValidator() {
        assertThrows(CustomException.class, ()->isValidName("an"));
        assertThrows(CustomException.class, ()->isValidName("anushka"));
        assertThrows(CustomException.class, ()->isValidName("Anu@sh"));
        isValidName("John");
    }

    @Test
    public void emailValidator() {
        isValidEmail("abc.xyz@bl.co.in");
        assertThrows(CustomException.class, ()->isValidEmail("abc@.in"));
        assertThrows(CustomException.class, ()->isValidEmail("abc.@.in"));
    }

    @Test
    public void numberValidator() {
        isValidPhoneNumber("91 9946782345");
        assertThrows(CustomException.class, ()->isValidPhoneNumber("9894782345"));
        assertThrows(CustomException.class, ()->isValidPhoneNumber("919946782345"));
    }
    @Test
    public void passwordValidator() {
        isValidPassword("vaLid@23pw");
        assertThrows(CustomException.class, ()->isValidPassword("valid123"));
        assertThrows(CustomException.class, ()->isValidPassword("valid@"));
    }


    private void isValidName(String name) throws CustomException{
        String regex = "^[A-Z][a-zA-z]{2,}$";
        if(!name.matches(regex)){
            throw new CustomException("Invalid name"+ name);
        }
    }

    private void isValidEmail(String email) throws CustomException{
        String regex = "^[a-z]+(\\.[a-z]+)*@([a-z]+\\.)+[a-z]{2,7}$";
        if(!email.matches(regex)){
            throw new CustomException("Invalid email"+ email);
        }
    }
    private void isValidPhoneNumber(String ph_num) throws CustomException{
        String regex = "^([0-9]{2}) ([0-9]{10})$";
        if(!ph_num.matches(regex)){
            throw new CustomException("Invalid phone number"+ ph_num);
        }
    }

    private void isValidPassword(String password) throws CustomException{
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$*&]).{8,}$";
        if(!password.matches(regex)){
            throw new CustomException("Invalid password"+ password);
        }
    }
}
