import org.junit.Assert;
import org.junit.Test;

public class TestingUserRegProblem {
    
	@Test
    public void testPhoneNumber_MustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPhoneNumberValid = userRegistration.checkPhoneNum("91 9898989898");
        Assert.assertTrue(isPhoneNumberValid);
    }
    @Test
    public void testPhoneNumber_MustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isPhoneNumberInValid = userRegistration.checkPhoneNum("9898989898");
        Assert.assertFalse(isPhoneNumberInValid);
    }
}
