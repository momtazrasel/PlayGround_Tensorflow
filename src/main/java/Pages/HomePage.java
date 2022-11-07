package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;
    private By testLoss = By.xpath("//div[@id=\"loss-test\"]");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void printTestLoss() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(driver.findElement(testLoss).getText());
        Thread.sleep(1000);
    }

    //Playground Tensorflow
    public PlayGround playGround() {
        return new PlayGround(driver);
    }


}
