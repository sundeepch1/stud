package json.with.java.jsonproject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONObjectExample {

	public static void main(String[] args) {
		try(FileReader fileReader = new FileReader("/home/sundeep/json/office.json")){
			System.out.println(fileReader.toString());

			JSONParser jsonParser = new JSONParser();
			Float totalMarks = 0.0f;
			
			//Fist way iteration
			JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);;
			
			for (int i = 1; i <= jsonObject.size(); i++) {
				JSONObject jsonObject2 = (JSONObject) jsonObject.get(String.valueOf(i));
				
				System.out.println(jsonObject2);
				
				totalMarks += Float.parseFloat(String.valueOf(jsonObject2.get("markesgiven")));
				
			}
			System.out.println("Total Marks" + totalMarks);			
			
			System.out.println(jsonObject.toString());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	private static Object Integer(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
