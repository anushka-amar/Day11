import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class) //the test class should be executed using parameterized runner
public class EmailValidatorTest {
    private String email;
    private boolean expected;

    public EmailValidatorTest(String email, boolean expected){
        this.email = email;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {"abc.xyz@bl.co.in", true},
                {"abc@.in", false},
                {"abc.@.in", false},
                {"abc..@bl.com",false}
        });
    }
    @Test
    public void testIsValidEmail(){
        String regex =  "^[a-z]+(\\.[a-z]+)*@([a-z]+\\.)+[a-z]{2,7}$";
        assertEquals(expected, email.matches(regex));
    }

}
