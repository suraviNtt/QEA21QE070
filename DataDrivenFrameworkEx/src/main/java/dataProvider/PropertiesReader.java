package dataProvider;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	
	
	Properties prop;
	
	public PropertiesReader() {
		try {
			FileReader f = new FileReader(System.getProperty("user.dir")+"/src/main/resources/configuration.properties");
			prop = new Properties();
			try {
				prop.load(f);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getBrowser() {
		return prop.getProperty("browser");
	}
	
	public String getUrl() {
		return prop.getProperty("url");
	}
	
	public int getImplicitWait() {
		return Integer.parseInt(prop.getProperty("implicitWait"));
	}
	
	public int getExplicitWait() {
		return Integer.parseInt(prop.getProperty("explicitWait"));
	}
	
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	
}
