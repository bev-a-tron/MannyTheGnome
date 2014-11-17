import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        Clicker clicker = new Clicker(driver);

        String url = "www.linkedin.com/in/beverlylau/";
        clicker.navigateToPage(url);

    }

}
