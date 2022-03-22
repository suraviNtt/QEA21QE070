package readers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReaderEx {

	public static void jsonReader(String filename) throws FileNotFoundException, IOException, ParseException {
		String filelocation = PathReader.getJSONFilesPath(filename);
//		JSONObject j = (JSONObject) new JSONParser().parse(new FileReader(filelocation));

		FileReader f = new FileReader(filelocation);
		Object obj = new JSONParser().parse(f);
		JSONObject jo = (JSONObject) obj;

		//individual element
		String un = (String) jo.get("username");
		String pw = (String) jo.get("password");
		long age = (long) jo.get("age");
		System.out.println(un);
		System.out.println(pw);
		System.out.println(age);
		//reading object
		Map m = (Map) jo.get("address");
		Iterator<Map.Entry> itr = m.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry data = itr.next();
			System.out.println(data.getKey()+ " : "+data.getValue());
		}
		//
		
		

	}

	public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {
		jsonReader("usercreds");
	}
}
