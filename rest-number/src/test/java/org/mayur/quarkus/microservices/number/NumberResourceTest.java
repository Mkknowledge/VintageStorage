package org.mayur.quarkus.microservices.number;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class NumberResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/C:/Program Files/Git/api/numbers")
          .then()
             .statusCode(200)
             .body(is("Hello RESTEasy"));
    }

}