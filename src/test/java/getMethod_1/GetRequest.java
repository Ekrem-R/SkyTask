package getMethod_1;

import baseUrl.Sky_Sports_House;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;


import static org.hamcrest.Matchers.*;
import static io.restassured.RestAssured.*;

public class GetRequest  extends Sky_Sports_House {
    /*
   When
I send a GET request to REST API URL https://5f99522350d84900163b8737.mockapi.io/tech-test/articles
  And Accept type is "application/json"
  Then
  HTTP Status Code should be 200
     */
    @Test
    public void get01() {
        //1)Set yhe URL
        spec.pathParams("first","tech-test","second","articles");

        //2)Send the request
        Response response=given().spec(spec).when().get("/{first}/{second}");
        response.prettyPrint();
        System.out.println("Status code: "+response.getStatusCode());

        //3)Assert the output
        response.
                then().
                assertThat().
                statusCode(200);


    }

}
