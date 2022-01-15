package post;

import baseUrl.Sky_Sports_House;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import testData.Sky_Sports_House_Test_Data;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class PostRequest extends Sky_Sports_House {
    /*
   When
            I send POST Request to the Url https://5f99522350d84900163b8737.mockapi.io/tech-test/articles
            with the request body {
                                   "createdAt": "2020-10-28T07:45:21.526Z",
                                   "title": "title 24",
                                   "sensitive": false,
                                   "topics": [],
                                   "image": {
                                       "url": "https://imgur.com",
                                       "fileType": ".jpg"
                                   },
                                   "priority": 10
                                   }
        Then
            Status code is 404
            And response body should be like "Endpoint disabled"

    */
    @Test
    public void post01() {
        //1) Set the url
        spec.pathParams("first", "tech-test","second","articles");
        //2) Set the expected data
        Sky_Sports_House_Test_Data expectedData = new Sky_Sports_House_Test_Data();
        Map<String, Object> expectedDataMap = expectedData.expectedDataSetUp();


        //3)Send POST request
        Response response = given().spec(spec).contentType(ContentType.JSON).
                body(expectedData.expectedDataSetUp()).when().post("/{first}/{second}");
        response.prettyPrint(); // Writing response body data
        System.out.println(response.statusCode());
        response.then().assertThat().statusCode(404);

    }
}
