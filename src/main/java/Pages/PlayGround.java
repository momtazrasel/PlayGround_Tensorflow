package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class PlayGround {
    private WebDriver driver;

    public PlayGround(WebDriver driver) {
        this.driver = driver;
    }

    private By exClusiveOR = By.xpath("(//canvas[@data-dataset='xor'])[1]");
    private By selectNoise = By.xpath("//input[@id='noise']");
    private By featureOne = By.xpath("(//canvas)[17]");
    private By featureTwo = By.xpath("(//canvas)[16]");
    private By minimizedNeuronsOne = By.xpath("(//i[@class='material-icons'][normalize-space()='remove'])[1]");
    private By minimizedNeuronsTwo = By.xpath("(//i[@class='material-icons'][normalize-space()='remove'])[2]");
    private By learningRateField = By.xpath("//select[@id='learningRate']");
    private By learningRateValue = By.xpath("(//option[@value='0.1'][normalize-space()='0.1'])[1]");
    private By outputPrint = By.xpath("//div[@class='metrics']");



    //Select Exclusive Or
    public void ExclusiveOR() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(exClusiveOR).click();
        Thread.sleep(500);
    }

    //Select noise
     public void SelectNoise() throws InterruptedException {
         WebElement e = driver.findElement(selectNoise);
         Actions move = new Actions(driver);
         move.moveToElement(e).clickAndHold().moveByOffset(0,1).release().perform();
         Thread.sleep(2000);
     }

     //Select Feature
    public void FeatureSelect() throws InterruptedException {
            driver.findElement(featureOne).click();
            Thread.sleep(500);
            driver.findElement(featureTwo).click();
            Thread.sleep(2000);
    }

    //Minimized Neurones

    public void MinimizedNeurones() throws InterruptedException {
        driver.findElement(minimizedNeuronsOne).click();
        Thread.sleep(500);
        driver.findElement(minimizedNeuronsTwo).click();
        Thread.sleep(2000);

    }

    //Select Learning Rate
    public void selectLearningRate() throws InterruptedException {
        driver.findElement(learningRateField).click();
        Thread.sleep(500);
        driver.findElement(learningRateValue).click();
        Thread.sleep(2000);
    }




}
