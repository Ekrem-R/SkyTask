package put;

import baseUrl.Sky_Sports_House;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Test;
import testData.Sky_Sports_House_Test_Data;
import static io.restassured.RestAssured.given;

public class PutRequest extends Sky_Sports_House {
     /*
    When
	 		I send PUT Request to the Url https://5f99522350d84900163b8737.mockapi.io/tech-test/articles/2
	 		with the PUT Request body like {
    "id": "2",
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
	   	   And response body is like
									   "Endpoint disabled"

     */

    @Test
    public void put01() {
        spec.pathParams("first", "tech-test", "second", "articles", "third", 2);
        Sky_Sports_House_Test_Data expected = new Sky_Sports_House_Test_Data();
        Response response = given().spec(spec).contentType(ContentType.JSON).
                body(expected.expectedDataSetUp()).when().put("/{first}/{second}/{third}");
        response.prettyPrint();
        //Assertion
        response.then().assertThat().statusCode(404);

    }
}
