package getMethod_2;

import baseUrl.Sky_Sports_House;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest extends Sky_Sports_House {
    /*
  When
I send a GET request to REST API URL https://5f99522350d84900163b8737.mockapi.io/tech-test/articles/2
 And Accept type is "application/json"
 Then
 HTTP Status Code should be 200
    */
    @Test
    public void get01() {
        //1)Set yhe URL
        spec.pathParams("first","tech-test","second","articles","third",2);

        //2)Send the request
        Response response=given().spec(spec).when().get("/{first}/{second}/{third}");
        response.prettyPrint();
        System.out.println("Status code: "+response.getStatusCode());

        //3)Assert the output
        response.
                then().
                assertThat().
                statusCode(200);


    }
}
