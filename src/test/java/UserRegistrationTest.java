import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    @Test
    public void firstNameValidator() {
        String regex = "^[A-Z][a-zA-z]{2,}$";
        assertFalse("an".matches(regex));
        assertFalse("anushka".matches(regex));
        assertFalse("Anu@sh".matches(regex));
        assertTrue("John".matches(regex));
    }

    @Test
    public void emailValidator() {
        String regex = "^[a-z]+(\\.[a-z]+)*@([a-z]+\\.)+[a-z]{2,7}$";
        assertTrue("abc.xyz@bl.co.in".matches(regex));
        assertFalse("abc@.in".matches(regex)); //as subdomain is mandatory
        assertFalse("abc.@.in".matches(regex));
    }

    @Test
    public void numberValidator() {
        String regex = "^([0-9]{2}) ([0-9]{10})$";
        assertTrue("91 9946782345".matches(regex));
        assertFalse("9894782345".matches(regex));
        assertFalse("919946782345".matches(regex));
    }

    @Test
    public void passwordValidator() {
        String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$*&]).{8,}$";
        assertTrue("vaLid@23pw".matches(regex));
    }
}
