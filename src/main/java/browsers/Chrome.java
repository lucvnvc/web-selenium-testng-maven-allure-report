package browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome implements IWebDriver {

    @Override
    public WebDriver getWebDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
}
