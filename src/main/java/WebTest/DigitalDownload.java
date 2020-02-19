package WebTest;

import org.openqa.selenium.By;

public class DigitalDownload extends Utils{
    private By _product1 = By.xpath("//input[contains(@onclick,'35')and contains(@value,'compare'));contains(@value,'compare')]");
    private By _product2 = By.xpath("//input[contains(@onclick,'34')and contains(@value,'compare'));contains(@value,'compare')]");

    private By _comparisonLink = By.xpath("//a[text()='product comparison']");

    public void chooseProductsToCompare(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        clickOnElement(_product1);
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        clickOnElement(_product2);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clickOnElement(_comparisonLink);
    }

}
