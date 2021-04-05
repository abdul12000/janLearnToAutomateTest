package step_definitions;

import base.Baseutil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class Hook extends Baseutil {
    private Baseutil base;
    public Hook(Baseutil base){
        this.base =base;
    }


    @Before
    //https://www.selenium.dev/documentation/en/webdriver/driver_requirements/
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/drivers/chromedriver.exe");
        base.driver = new ChromeDriver();
    }

    @After
    public void teardown() throws InterruptedException, IOException {
        takeAScreenshot();
        Thread.sleep(3000);
        base.driver.quit();
    }

    private void takeAScreenshot() throws IOException {
        TakesScreenshot scrShot =((TakesScreenshot)base.driver);
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(SrcFile, new File ("target/screenshot" + System.currentTimeMillis()+ ".png"));


    }


}
