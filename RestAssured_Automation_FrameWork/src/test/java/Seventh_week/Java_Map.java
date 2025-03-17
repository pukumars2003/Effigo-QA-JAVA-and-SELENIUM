package Seventh_week;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import static org.hamcrest.Matchers.equalTo;
 
public class Java_Map {
 
    @Test
    public void passBodyAsMap() {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", "fdfj");
        map.put("salary", "999");
        map.put("age", "28");
        RestAssured.given()
                .contentType(ContentType.JSON)
                .body(map)
                	.log().all()
 
                .when()
                	.post("	https://dummy.restapiexample.com/api/v1/create")
 
                .then()
                	.log().all()
                	
                	.assertThat().statusCode(200);
                	/**.body("data.employee_name", equalTo("MapTest"))
                	.body("data.employee_age", equalTo("30"))
                	.body("data.employee_salary", equalTo("99999"))
                	.body("message", equalTo("Successfully! Record has been added.")).log().all();**/
    }
}