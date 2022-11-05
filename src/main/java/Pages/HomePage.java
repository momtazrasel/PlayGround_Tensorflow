package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }


    //Playground Tensorflow
    public PlayGround playGround(){
        return new PlayGround(driver);
    }


}
