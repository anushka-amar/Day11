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

    public boolean isValidFirstName(String firstName){
        String test = "^[A-Z][a-zA-z]{2,}$";
        return firstName.matches(test);
    }

}