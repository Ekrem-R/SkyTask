package delete;

import baseUrl.Sky_Sports_House;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class DeleteRequest1 extends Sky_Sports_House {

    @Test
    public void delete01() {
        spec.pathParams("first","tech-test","second","articles","third",2);
        Map<String, Object> expected = new HashMap<>();
        Response response = given().spec(spec).
                when().delete("/{first}/{second}/{third}");
        response.prettyPrint();

        //Assertion
        response.then().assertThat().statusCode(404);
    }
}
