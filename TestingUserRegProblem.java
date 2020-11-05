import org.junit.Assert;
import org.junit.Test;

public class TestingUserRegProblem {
    @Test
    public void testingFirstName() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isFNameValid = userRegistration.checkFName("Geeth");
        Assert.assertTrue(isFNameValid);
    }

    @Test
    public void testFirstNameInvalidMustReturnFalse() {
        UserRegistration userRegistration = new UserRegistration();
        boolean isFnameValid = userRegistration.checkFName("geeth");
        Assert.assertFalse(isFnameValid);
    }
}
