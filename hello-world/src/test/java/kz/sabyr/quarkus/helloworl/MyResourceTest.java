package kz.sabyr.quarkus.helloworl;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class MyResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/hello-world")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

    @Test
    public void testHelloWithParam() {
        String name = "Sabyrzhan";
        String result = given()
                .when().get("/hello-world/" + name)
                .then()
                .statusCode(200)
                .extract().path("name").toString();
        assertEquals(name + ", ID: 1234", result);
    }
}