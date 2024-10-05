package Login;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginPage {
    private WebDriver driver;

    @BeforeClass
    public void setUp() {
        // Set the path for the ChromeDriver executable
        System.setProperty("webDriver.chrome.driver", "path/to/chromedriver"); // Update this path
        driver = new ChromeDriver();
        driver.manage().window().maximize(); // Maximize the browser window
    }

    @Test
    public void openFacebook() {
        // Open Facebook
        driver.get("https://www.facebook.com");
        // You can add assertions here to validate the page title or other elements if needed
        System.out.println("Opened Facebook: " + driver.getTitle());
        System.out.println("usha");
       
        
    }

    @AfterClass
    public void tearDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}
