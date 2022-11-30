package com.codewithhades.quarkus.basicsetup;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

@QuarkusTest
class GreetingsResourceTest {

    @Test
    void greetingsResourceIntegrationTest() {
        given().when().get("/api").then().statusCode(200);
    }

}