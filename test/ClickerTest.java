import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClickerTest {

    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }

    @Test
    public void shouldNavigateToPage() throws Exception {
        Clicker clicker = new Clicker(driver);
        clicker.navigateToPage("http://www.linkedin.com/in/beverlylau");
        assertThat(driver.getCurrentUrl(), is("http://www.linkedin.com/in/beverlylau"));
    }

}