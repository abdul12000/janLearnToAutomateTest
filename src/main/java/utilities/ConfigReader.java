package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigReader {
    File file = new File("src/main/resources/Conf.properties");
    FileInputStream fs = new FileInputStream(file);
    public Properties property = null;

    public ConfigReader() throws Exception{
        property = new Properties();
        property.load(fs);
    }

    public String getNewtoursURL(){
        return property.getProperty("URL_Newtours");
    }

    public String getTestAccountA(){
        return property.getProperty("TestAccount");
    }

    public String getMortgageCalcURL() {
        return property.getProperty("MortgageCalculatorURL");
    }
}
