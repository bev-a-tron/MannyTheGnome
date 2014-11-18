import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {

        run();

    }

    private static void run() throws InterruptedException, IOException {

        WebDriver driver = new FirefoxDriver();
        Clicker clicker = new Clicker(driver);
        clicker.login("http://www.linkedin.com/in/beverlylau");
        driver.close();

    }

}
