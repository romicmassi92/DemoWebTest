package WebTest;

import org.openqa.selenium.By;

public class RegistrationPage extends Utils {
    private By _firstName = By.id("FirstName");
    private By _lastName = By.id("LastName");
    private By _email = By.id("Email");
    private By _password = By.id("Password");
    private By _confirmPassword = By.id("ConfirmPassword");
    private By _registerButton = By.id("register-button");
    private String firstname = "Romic";
    private String lastname = "Masih";
    private static String timestamp = createTimeStamp();

    public void verifyUserIsOnRegisterPage(){
        assertURL("register");
    }

    public void userEntersRegistrationDetails(){
        try {
            Thread.sleep(2000); // System will go on sleep mode to allow loading the homepage(very Slow)
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        sendText(_firstName, firstname);
        sendText(_lastName, lastname);
        sendText(_email, "romic.massi"+timestamp+"@gmail.com");
        sendText(_password, "Romic@123");
        sendText(_confirmPassword, "Romic@123");
        clickOnElement(_registerButton);
    }
}
