import org.openqa.selenium.WebDriver;

public class Clicker {

    private WebDriver driver;

    public Clicker(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToPage(String url) {
        driver.get(url);
    }
}
