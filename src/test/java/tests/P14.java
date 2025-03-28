package tests;

import baseUrl.JPHBaseUrl;
import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class P14 extends JPHBaseUrl {

    @Test // testng.
    public void test01(){
         /*

       https://jsonplaceholder.typicode.com/posts endpointine
        bir GET request gonderdigimizde
        donen response'un status code'unun 200 oldugunu ve
        Response'ta 100 kayit oldugunu test edin
*/

        // endpoint
        specJPH.pathParam("pp1","posts");

        Response response = given().spec(specJPH).when().get("/{pp1}");

        response.prettyPrint();
    }
}

