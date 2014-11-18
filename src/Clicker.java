import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Clicker {

    private WebDriver driver;

    public Clicker(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String url) throws InterruptedException, IOException {
        driver.get(url);
        driver.findElement(By.linkText("Sign In")).click();

        Parser parser = new Parser();
        String password = parser.parse("password.txt");
        String email = parser.parse("email.txt");

        driver.findElement(By.id("session_key-login")).sendKeys(email);
        driver.findElement(By.id("session_password-login")).sendKeys(password);
        driver.findElement(By.id("btn-primary")).click();
    }

    public void goToPeopleYouMayKnow() {
        driver.findElement(By.linkText("People You May Know")).click();
    }
    
}
