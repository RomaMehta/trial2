import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
    static protected WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src\\BrowserDriver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();

                driver.manage().window().maximize();

        driver.get("https://www.google.co.uk");
    }
}
