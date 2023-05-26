//Imports
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class tests {
    public static void main(String[] args) {
        //Create WebDriver
        WebDriver driver = WebDriverManager.chromedriver().create();
        //Navigate to the website given
        driver.get("https://selenium.dev");
        //Place your visual regression testing code under here

        //Close WebDriver after execution
        driver.quit();
    }
}