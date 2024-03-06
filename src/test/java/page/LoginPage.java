package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage {
    @FindBy(name = "username")

    WebElement textUsername;

    @FindBy(name = "password")
    WebElement textPassword;
    @FindBy(css = "[type=\"submit\"]")
    WebElement btnLogin;

@FindBy(css = "[role=\"menuitem\"]")
List<WebElement> btnLogout;

@FindBy(className = "oxd-userdropdown-name")

WebElement loggendinUser;

WebDriver driver;


    public LoginPage(WebDriver driver){
        this.driver=driver;

        PageFactory.initElements(driver,this);

    }
    public void doLogin(String username, String password){
        textUsername.sendKeys(username);
        textPassword.sendKeys(password);
        btnLogin.click();
    }
    public void doLogout(){
        LoginPage loginPage =new LoginPage(driver);
        loginPage.loggendinUser.click();
        loginPage.btnLogout.get(3).click();

    }



}
