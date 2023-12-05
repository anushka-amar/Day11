import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationTest {

    @Test
    public void emailValidator(){
        assertTrue(isValidEmail("abc.xyz@bl.co.in"));
        assertFalse(isValidEmail("abc@.in")); //as subdomain is mandatory
        assertFalse(isValidEmail("abc.@.in"));
    }
    @Test
    public void firstNameValidator(){
        assertFalse(isValidFirstName("an"));
        assertFalse(isValidFirstName("anushka"));
        assertFalse(isValidFirstName("Anu@sh"));
        assertTrue(isValidFirstName("John"));
    }


    public boolean isValidEmail(String email){
        String test = "^[a-z]+(\\.[a-z]+)*@([a-z]+\\.)+[a-z]{2,7}";
        return email.matches(test);
    }
    public boolean isValidFirstName(String firstName){
        String test = "^[A-Z][a-zA-z]{2,}$";
        return firstName.matches(test);
    }
}