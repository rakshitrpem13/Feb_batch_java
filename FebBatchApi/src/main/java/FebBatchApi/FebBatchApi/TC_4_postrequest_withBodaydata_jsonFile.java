package FebBatchApi.FebBatchApi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class TC_4_postrequest_withBodaydata_jsonFile {
	public static void main(String[] args) throws FileNotFoundException {
		File f=new File("../FebBatchApi/Bodydata.json"); // file class is used for connection between json file
		FileReader fr=new FileReader(f); // reader object
		JSONTokener jr =new JSONTokener(fr); // used to read json file
		JSONObject js =new JSONObject(jr);
	
	}

}
