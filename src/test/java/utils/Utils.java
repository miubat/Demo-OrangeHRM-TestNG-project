package utils;

import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Utils {
    public static void doScroll(WebDriver driver, int firstPos, int lastPos){
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollBy("+firstPos+","+lastPos+")");

    }
}
