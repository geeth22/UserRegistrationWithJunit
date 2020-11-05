import org.junit.Assert;
import org.junit.Test;

public class TestingUserRegProblem {
    
    @Test
    public void testPassword_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPasswordValid = userRegistration.checkPassword("password");
        Assert.assertTrue(isPasswordValid);
    }
    @Test
    public void testPassword_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPasswordInValid = userRegistration.checkPassword("xyzz");
        Assert.assertFalse(isPasswordInValid);
    }
}
