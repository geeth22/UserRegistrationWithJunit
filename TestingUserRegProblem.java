import org.junit.Assert;
import org.junit.Test;

public class TestingUserRegProblem {
    
    @Test
    public void testPassword1_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPassword1Valid = userRegistration.checkPassword1("password");
        Assert.assertTrue(isPassword1Valid);
    }
    @Test
    public void testPassword1_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPassword1InValid = userRegistration.checkPassword1("xyz");
        Assert.assertFalse(isPassword1InValid);
    }
}
