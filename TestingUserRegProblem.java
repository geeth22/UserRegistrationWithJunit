import org.junit.Assert;
import org.junit.Test;

public class TestingUserRegProblem {
    
    @Test
    public void testPassword2_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPassword2Valid = userRegistration.checkPassword2("Password");
        Assert.assertTrue(isPassword1Valid);
    }
    @Test
    public void testPassword2_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPassword2InValid = userRegistration.checkPassword2("password");
        Assert.assertFalse(isPassword2InValid);
    }
}
