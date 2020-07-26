package kz.sabyr.quarkus.helloworlkotlin

import io.quarkus.test.junit.QuarkusTest
import io.restassured.RestAssured.given
import kz.sabyr.quarkus.helloworlkotlin.service.MyService
import org.hamcrest.CoreMatchers.`is`
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import javax.inject.Inject

@QuarkusTest
class MyResourceTest {
    @Inject
    lateinit var myService: MyService

    @Test
    fun testHelloEndpoint() {
        given()
          .`when`().get("/hello-world")
          .then()
             .statusCode(200)
             .body(`is`("hello"))
    }

    @Test
    fun testWithName() {
        var name = "Sabyrzhan"
        val resultName = given()
                .`when`().get("/hello-world/" + name)
                .then()
                .statusCode(200)
                .extract()
                .path<String>("name")
        assertEquals(name + ", ID: 1234", resultName)
    }
}