import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    @Test
    public void firstNameValidator(){
        assertFalse(isValidFirstName("an"));
        assertFalse(isValidFirstName("anushka"));
        assertFalse(isValidFirstName("Anu@sh"));
        assertTrue(isValidFirstName("John"));
    }
    @Test
    public void emailValidator(){
        assertTrue(isValidEmail("abc.xyz@bl.co.in"));
        assertFalse(isValidEmail("abc@.in")); //as subdomain is mandatory
        assertFalse(isValidEmail("abc.@.in"));
    }
    @Test
    public void numberValidator(){
        assertTrue(isValidPhNumber("91 9946782345"));
        assertFalse(isValidPhNumber("9894782345"));
        assertFalse(isValidPhNumber("919946782345"));
    }

    public boolean isValidFirstName(String firstName){
        String test = "^[A-Z][a-zA-z]{2,}$";
        return firstName.matches(test);
    }
    public boolean isValidEmail(String email){
        String test = "^[a-z]+(\\.[a-z]+)*@([a-z]+\\.)+[a-z]{2,7}$";
        return email.matches(test);
    }
    public boolean isValidPhNumber(String phone_number){
        String test = "^([0-9]{2}) ([0-9]{10})$";
        return phone_number.matches(test);
    }
}