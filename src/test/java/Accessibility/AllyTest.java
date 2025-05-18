package Accessibility;

import com.deque.axe.AXE;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.json.JSONArray;
import org.json.JSONObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.net.URL;

public class AllyTest {
    WebDriver webDriver;


    @BeforeMethod
    public void setup(){
        WebDriverManager.chromedriver().setup();
        webDriver = new ChromeDriver();
        webDriver.get("https://amazon.com");
    }

    @Test
    public void test(){
        final URL scriptUrl = AllyTest.class.getResource("/axe.min.js");
        JSONObject responseJson = new AXE.Builder(webDriver,scriptUrl).analyze();
        JSONArray violations = responseJson.getJSONArray("violations");
        if(violations.length()==0){
            System.out.println("No Violations found");
        }else{
            AXE.writeResults("Amazon A11y Test",responseJson);
            Assert.fail(AXE.report(violations));
        }
    }

    @AfterMethod
    public void teardown(){
        webDriver.quit();
    }
}


