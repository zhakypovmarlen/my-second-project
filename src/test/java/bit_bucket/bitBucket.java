package bit_bucket;

import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class bitBucket {

    @Before
    public void startup(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
    }

    @Test
    public void asd(){
        Assert.assertEquals(12, 12);
    }
}
