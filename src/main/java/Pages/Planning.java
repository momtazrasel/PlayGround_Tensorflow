package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Planning {
    public WebDriver driver;

    public Planning(WebDriver driver) {
        this.driver = driver;
    }


    public By planningIcon = By.xpath("(//li[@class='sidebar-item ng-star-inserted'])[1]");
    public By allPlanningOption = By.xpath("(//a[normalize-space()='All Planning'])[1]");
    public By allPlanningPage = By.xpath("(//li[@class='k-flex-none k-breadcrumb-item k-breadcrumb-root-item k-breadcrumb-last-item ng-star-inserted'])[1]");
    public By viewAllUnitCheckbox = By.xpath("(//label[@for='isAll'])[1]");
    public By planningUnit = By.xpath("(//span[@class = 'planningUnit-Details pu-title-overflow-wrap-detail left-negative-7'])[1]");

    public void getPlanningIcon() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(planningIcon).click();
    }
    public void getAllPlanning() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(allPlanningOption).click();
    }
    public void getAllPlanningPage() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(allPlanningPage).click();
    }
    public void getPlanningUnit() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(planningUnit).click();
    }
    public void getViewAllUnitCheckbox() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(viewAllUnitCheckbox).click();
    }
}
