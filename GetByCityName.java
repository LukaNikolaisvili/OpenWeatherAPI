package OpenWeatherAPI;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class GetByCityName {
	public static void main(String[] args) {
		
		
		 
		Response resp =	given()
		.param("q", "London")
		.param("appid", "8aa228fb0ae9618e00ca3b9baf142513")
		.when()
		.get("https://api.openweathermap.org/data/2.5/weather");
		
		System.out.println();
		
		System.out.println(resp.asPrettyString());
		
	
		//validating the status code.
		resp.then().statusCode(200);
		
		
		 int StatusCode = resp.getStatusCode();
				
		 //Printing the status code.
				System.out.println(StatusCode);
		
	}

}
