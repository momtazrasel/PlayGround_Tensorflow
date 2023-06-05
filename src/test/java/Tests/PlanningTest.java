package Tests;

import Base.Base;
import Tests.LoginTest;
import Pages.Planning;
import org.testng.annotations.Test;

public class PlanningTest extends LoginTest {

    @Test
    public void allPlanningPage() throws InterruptedException {
        spolLogin();
        Planning planning = homePage.planning();
        planning.getPlanningIcon();
        planning.getAllPlanning();
        planning.getAllPlanningPage();

    }

    @Test
    public void allPlanningUnit() throws InterruptedException {
        spolLogin();
        Planning planning = homePage.planning();
        planning.getPlanningIcon();
        planning.getAllPlanning();
        planning.getAllPlanningPage();
        planning.getViewAllUnitCheckbox();
        planning.getPlanningUnit();

    }
}
