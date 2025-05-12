package lesson16.restassured;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class AssertionsRestAssured {
    @Test
    public void checkStatusCode(){
        given()
                .baseUri("https://reqres.in/")
                .when()
                .get("/api/users?page=2")
                .then()
                .statusCode(200);
    }

    @Test
    public void checkBodyValueWithKey(){
        given()
                .baseUri("https://reqres.in/")
                .when()
                .get("/api/users?page=2")
                .then()
                .statusCode(200)
                .body("total", equalTo(12));
    }

    @Test
    public void checkValueDataTypeAndArraySize(){
        given()
                .baseUri("https://reqres.in/")
                .when()
                .get("/api/users?page=2")
                .then()
                .body("data[0].first_name", instanceOf(String.class))
                .body("data", hasSize(6));
    }
}
