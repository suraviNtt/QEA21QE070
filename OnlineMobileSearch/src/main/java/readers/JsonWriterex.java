package readers;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWriterex {

	public static void main(String[] args) throws FileNotFoundException {
		
		JSONObject jo = new JSONObject();
		//adding key-value pairs
		jo.put("name", "nameValue");
		jo.put("age", 123);
		
		//adding object
		Map m = new LinkedHashMap();
		m.put("city", "jalandhar");
		m.put("pin", 123456);
		
		jo.put("address", m);
		
		//adding array
		JSONArray jarray = new JSONArray();
		jarray.add(m);
		
		jo.put("addressarray", jarray);
		
		
		
		String filelocation = PathReader.getJSONFilesPath("testdat");
		PrintWriter pw = new PrintWriter(filelocation);
		pw.write(jo.toJSONString());
		
		pw.flush();
		pw.close();
	}
}
