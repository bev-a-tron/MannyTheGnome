import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.junit.Assert.assertThat;
import static org.junit.matchers.JUnitMatchers.containsString;

public class ClickerTest {

    private WebDriver driver;
    private Clicker clicker;

    @Before
    public void setUp() throws Exception {

        driver = new FirefoxDriver();
        clicker = new Clicker(driver);
    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }

    @Test
    public void shouldLoginAndClickOnPeople() throws Exception {

        clicker.login("http://www.linkedin.com/in/beverlylau");
        Thread.sleep(3000L);
        assertThat(driver.getCurrentUrl(), containsString("home"));

        clicker.goToPeopleYouMayKnow();
        assertThat(driver.getCurrentUrl(), containsString("pymk"));
    }

}