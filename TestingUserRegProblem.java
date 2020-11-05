import org.junit.Assert;
import org.junit.Test;

public class TestingUserRegProblem {
    
    @Test
    public void testPassword4_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPassword4Valid = userRegistration.checkPassword4("Password");
        Assert.assertTrue(isPassword4Valid);
    }
    @Test
    public void testPassword4_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPassword4InValid = userRegistration.checkPassword4("password");
        Assert.assertFalse(isPassword4InValid);
    }
}
