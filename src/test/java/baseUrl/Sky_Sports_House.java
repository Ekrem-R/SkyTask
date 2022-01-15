package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class Sky_Sports_House {
    //1)Create RequestSpecification object
    protected RequestSpecification spec;

    //If you use @Before annotation before a method, it means the method will be executed before every test method
    @Before
    public void setUp() {
        String url = "https://5f99522350d84900163b8737.mockapi.io";
        spec = new RequestSpecBuilder().setBaseUri(url).build();
    }
}
