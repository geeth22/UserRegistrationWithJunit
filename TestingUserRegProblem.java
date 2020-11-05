import org.junit.Assert;
import org.junit.Test;

public class TestingUserRegProblem {
    
    @Test
    public void testPassword_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPasswordValid = userRegistration.checkPassword("X@123xyz");
        Assert.assertTrue(isPasswordValid);
    }
    @Test
    public void testPassword_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPasswordInValid = userRegistration.checkPassword("xyzxyzxyz");
        Assert.assertFalse(isPasswordInValid);
    }
}
