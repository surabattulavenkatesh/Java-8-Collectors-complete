package StreamsComplete;
import java.util.Comparator;

import org.json.JSONArray;
import org.json.JSONObject;
public class SortJsonObjects {

	public static void main(String[] args) {

		String jsonArrayStr = "[{\"age\": 30, \"name\": \"John\"}, {\"age\": 25, \"name\": \"Jane\"}, {\"age\": 35, \"name\": \"Bob\"}]";
        JSONArray jsonArray = new JSONArray(jsonArrayStr);

        // Sort the JSONArray by the "age" field in ascending order
        jsonArray.sort(Comparator.comparingInt(o -> ((JSONObject) o).getInt("age")));

        System.out.println(jsonArray.toString());
	}

}
