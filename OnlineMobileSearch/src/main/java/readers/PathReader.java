package readers;

public class PathReader {

	/**
	 * 
	 * @return
	 */
	public String getProjectPath() {
		return System.getProperty("user.dir");

	}
	
	/**
	 * 
	 * @param filename
	 * @return
	 */
	public String getTestDataFileLocation(String filename){
		return "/src/test/resources/"+filename+".xlsx";
	}
}
