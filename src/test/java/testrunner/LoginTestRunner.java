package testrunner;

import config.Setup;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.LoginPage;

public class LoginTestRunner extends Setup {
    @Test(priority = 1 , description = "Admin Can login successfully")

    public void doLogin(){
        LoginPage loginPage =new LoginPage(driver);
        loginPage.doLogin("admin","admin123");
        WebElement imgProfile = driver.findElement(By.className("oxd-userdropdown-img"));
        Assert.assertTrue(imgProfile.isDisplayed());


    }
}
