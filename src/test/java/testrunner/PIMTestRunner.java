package testrunner;

import com.github.javafaker.Faker;
import config.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import page.LoginPage;
import page.PIMPage;
import utils.Utils;

public class PIMTestRunner extends Setup {

    @BeforeTest
    public void doLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.doLogin("admin", "admin123");
        WebElement imgProfile = driver.findElement(By.className("oxd-userdropdown-img"));
        Assert.assertTrue(imgProfile.isDisplayed());
    }

    @Test (priority = 1, description = "Creat new employee") //anotation
    public void employeeRegistration() throws InterruptedException {
        PIMPage pimPage=new PIMPage(driver);
        Faker faker=new Faker();
        String firstName=faker.name().firstName();//"Mira";
        String lastName=faker.name().lastName();//"Mondol";
        String username=faker.name().username();//"mira123";
        String password="P@ssword123";

        pimPage.registerUser(firstName,lastName,username,password);
        Utils.doScroll(driver,0,300);

        Thread.sleep(5000);

    }
}
