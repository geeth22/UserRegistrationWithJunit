import org.junit.Assert;
import org.junit.Test;

public class TestingUserRegProblem {
    
	@Test
    public void testEmailId_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isEmailValid = userRegistration.checkEmail("abc.xyz@Bridgelabz.co.in");
        Assert.assertTrue(isEmailValid);
    }
    @Test
    public void testEmailId_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isEmailInvalid = userRegistration.checkEmail("abc@.BridgeLabz");
        Assert.assertFalse(isEmailInvalid);
    }
}
