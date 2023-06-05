package Tests;
import Base.Base;
import Pages.LoginPage;
import org.testng.annotations.Test;
public class LoginTest extends Base {


    @Test
    public void spolLogin() throws InterruptedException {

        LoginPage login = homePage.signIn();
        login.getUsername();
        login.getPassword();
        login.getLogin();

    }



}
