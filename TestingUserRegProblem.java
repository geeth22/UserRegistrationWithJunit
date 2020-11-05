import org.junit.Assert;
import org.junit.Test;

public class TestingUserRegProblem {
    
	@Test
    public void testLastNameValidMustReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isLnameValid = userRegistration.Lname("Chandra");
        Assert.assertTrue(isLnameValid);
    }
    @Test
    public void testLastNameValidMustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isLnameInValid = userRegistration.Lname("chandra");
        Assert.assertFalse(isLnameInValid);
    }
}
