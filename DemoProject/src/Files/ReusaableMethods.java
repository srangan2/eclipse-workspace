package Files;

import io.restassured.path.json.JsonPath;

public class ReusaableMethods {
	
	public static JsonPath rawtoJson(String response)
	{
		JsonPath js1 = new JsonPath(response);
		return js1;
	}

}
