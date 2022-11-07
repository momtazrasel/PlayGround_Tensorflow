package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

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
    private By playButton = By.xpath("//button[@id=\"play-pause-button\"]");
    private By epochValue = By.xpath("//span[@id=\"iter-number\"]");


    //Select Exclusive Or
    public void ExclusiveOR() throws InterruptedException {
        Thread.sleep(500);
        driver.findElement(exClusiveOR).click();
        Thread.sleep(500);
    }

    //Select noise
    public void SelectNoise() throws InterruptedException {
        WebElement e = driver.findElement(selectNoise);
        e.sendKeys(Keys.ARROW_RIGHT);
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
        Select learningRate = new Select(driver.findElement(learningRateField));
        learningRate.selectByValue("0.1");
        Thread.sleep(2000);
    }

    public void selectEpochValue() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.findElement(playButton).click();
//        wait.pollingEvery(Duration.ofMillis(10));
//        wait.until(textToBePresentForElementWithRefreshByClick(epochValue, "000,216", playButton));
////        if (wait.until(ExpectedConditions.textToBe(epochValue, "000,216"))){
////            driver.findElement(playButton).click();
////        }

    }

    public static ExpectedCondition<Boolean> textToBePresentForElementWithRefreshByClick(By originalElement, String expectedText, By refreshElement) {
        return new ExpectedCondition<Boolean>() {
            private boolean hasText = false;
            private String currentText = "";

            @Override
            public Boolean apply(WebDriver driver) {
                currentText = driver.findElement(originalElement).getText();
                hasText = currentText == expectedText;
                if(!hasText) {
                    System.out.println(currentText);
                    // Optionally some sleep might be added here, like Thread.sleep(1000);
                }
                driver.findElement(refreshElement).click();
                return hasText;
            }

            @Override
            public String toString() {
                return String.format("element \"%s\" should have text \"%s\", found text: \"%s\"", originalElement.toString(), expectedText, currentText);
            }
        };
    }


}
