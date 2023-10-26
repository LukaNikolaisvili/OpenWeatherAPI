package OpenWeatherAPI;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;
public class GetAllDataWithMixedInfo {
	public static void main(String[] args) {
		
		String appidVal = "8aa228fb0ae9618e00ca3b9baf142513";
		
		Response resp = given()
				.param("lat", "23.590")
				.param("lon", "102.20")
				.param("appid",appidVal)
				.when()
				.get("https://api.openweathermap.org/data/2.5/weather");
		
		System.out.println(resp.asPrettyString());
		
		int StatusCode = resp.getStatusCode();
		
		System.out.println("Status Code is: " + StatusCode);
				
		
		
	}
	
	
	
}
