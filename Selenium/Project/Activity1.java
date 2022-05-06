package liveProject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        String title = driver.getTitle();
        String expectedtitle = "OrangeHRM";
        if(title.equals(expectedtitle)){
            driver.close();
        }

    }
}
