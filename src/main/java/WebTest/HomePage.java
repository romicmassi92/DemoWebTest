package WebTest;

import org.openqa.selenium.By;

public class HomePage extends Utils{
    private By _registerLink = By.xpath("//a[contains(., 'Register')}");
    private By _DigitalDownload = By.linkText("Digital downloads");
    public void clickOnRegisterButton(){clickOnElement(_registerLink);}
    public void clickOnDigitalDownload() {clickOnElement(_DigitalDownload);}
    private By _computer = By.linkText("Computers");
    public void clickOnComputerCategory(){clickOnElement(_computer);}
}
