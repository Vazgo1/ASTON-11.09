package Lesson_8;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.jupiter.api.Test;
import org.json.JSONObject;
import java.util.HashMap;
import java.util.Map;
import static io.restassured.RestAssured.given;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestApi {

    @Test
    void get() {
        given().baseUri("https://postman-echo.com")
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")
                .when()
                .get("/get")
                .then()
                .statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", equalTo("bar2"))
                .log()
                .all();
    }

    @Test
    void postText() {
        String bodyText = "Hello ASTON";
        Response response = given()
                .baseUri("https://postman-echo.com")
                .header("Content-Type", "text/plain")
                .body(bodyText)
                .when().post("/post")
                .then()
                .statusCode(200)
                .extract()
                .response();
        System.out.println(response.asPrettyString());
    }

    @Test
    void postData() {
        RestAssured.baseURI = "https://postman-echo.com";
        given()
                .contentType(ContentType.JSON)
                .body("{ \"message\": \"Hello ASTON!\" }")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("json.message", equalTo("Hello ASTON!"))
                .log().body();
    }

    @Test
    void delete() {
        RestAssured.baseURI = "https://postman-echo.com";
        String requestBody = "This is expected to be sent back as part of response body.";
        Response response = given()
                .header("Content-Type", "text/plain")
                .body(requestBody)
                .when()
                .delete("/delete")
                .then()
                .statusCode(200)
                .extract().response();
        System.out.println(response.asPrettyString());
    }


    @Test
    void put() {
        RestAssured.baseURI = "https://postman-echo.com/put";
        String requestBody = "This is expected to be sent back as part of response body.";
        Response response = RestAssured.given()
                .header("Content-Type", "text/plain")
                .header("Accept", "Hello Aston")
                .header("x-forwarded-proto", "https")
                .header("user-agent", "PostmanRuntime/7.49.0")
                .header("postman-token", "147f2403-85bc-4150-a7d2-28c7069d9a30") // Token header
                .header("cookie", "_cfuvid=ueGUPZKgI4kzFWlE5RKoRpeMQ31euiG5.kNTWPA7Ffg-1761512151211-0.0.1.1-604800000; sails.sid=s%3ANb7pbdgz3RrqYuV-XAMKzYR4eFJJI7BU.LVyhu3vClaG4RwAYbos%2FwK5irjGX%2BrxmThS6qYAFa5I")
                .body(requestBody)
                .put();
        response.then().log().all();
        response.then().statusCode(200);
        assertThat(response.getBody().asString(), containsString(requestBody));
    }

    @Test
    void patch () {
        RestAssured.baseURI = "https://postman-echo.com";
        String requestBody = "{ \"message\": \"Hello Aston\" }";
        Response response = given()
                .contentType(ContentType.JSON)
                .body(requestBody)
                .when()
                .patch("/patch")
                .then()
                .statusCode(200)
                .extract().response();
        System.out.println("Response body:");
        System.out.println(response.asPrettyString());
    }
}

