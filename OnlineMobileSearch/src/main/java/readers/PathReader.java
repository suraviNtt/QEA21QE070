package readers;

public class PathReader {

	/**
	 * 
	 * @return
	 */
	public static String getProjectPath() {
		return System.getProperty("user.dir");

	}
	
	/**
	 * 
	 * @param filename
	 * @return
	 */
	public static String getTestDataFileLocation(String filename){
		return "/src/test/resources/"+filename+".xlsx";
	}
	
	public static String getJSONFilesPath(String filename) {
		return getProjectPath() + "/src/test/resources/"+filename+".json";
	}
	
//	public static void main(String[] args) {
//		PathReader r = new PathReader();
//		String s = r.getJSONFilesPath("usercreds");
//		System.out.println(s);
//	}
}
