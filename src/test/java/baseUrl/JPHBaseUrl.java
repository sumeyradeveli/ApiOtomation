package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class JPHBaseUrl {

    protected RequestSpecification specJPH;

    @BeforeTest // testng.
    public void setUp(){
        specJPH=new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com").build();

    }
}
