package baseUrl;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeTest;

public class RestFullBaseUrl {
    public class RestFull {

        protected RequestSpecification specHerOkuApp;


        @BeforeTest
        public void setUp(){
            specHerOkuApp=new RequestSpecBuilder().setBaseUri("https://restful-booker.herokuapp.com").build();
        }
    }
}
