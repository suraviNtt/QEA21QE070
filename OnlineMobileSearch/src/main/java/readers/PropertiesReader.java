package readers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesReader {

	Properties prop;

	public PropertiesReader() throws FileNotFoundException, IOException {
		prop = new Properties();
		String filePath = getConfigFile();
		InputStream file = new FileInputStream(filePath);
		prop.load(file);

	}
	
	/**
	 * 
	 * @return
	 */
	private String getConfigFile() {
		String currentDirectory = System.getProperty("user.dir");
		String fileLocation = "/src/main/resources/config.properties";
		return currentDirectory + fileLocation;
	}

	/**
	 * 
	 * @return
	 */
	public String getBrowserName() {
		return prop.getProperty("browser");
	}

	/**
	 * 
	 * @return
	 */
	public String getApplicationUrl() {
		return prop.getProperty("url");
	}

}
