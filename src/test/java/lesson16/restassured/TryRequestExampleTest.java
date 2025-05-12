package lesson16.restassured;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TryRequestExampleTest {
    @Test
    public void getListOfBooks() {
        // given -> when -> then
        Response response =
                given()
                        .baseUri("https://simple-books-api.glitch.me")
                        .when()
                        .get("/books");
        System.out.println(response.getBody().asString());
    }

    @Test
    public void postCreateAnAccount() {
        String body = "{\n" +
                "   \"clientName\": \"%s\",\n" +
                "   \"clientEmail\": \"%s\"\n" +
                "}";
        Response response = given()
                .baseUri("https://simple-books-api.glitch.me")
                .contentType(ContentType.JSON)
                .body(String.format(body, "Sergey", "ser@mail.cim"))
                .when()
                .post("/api-clients/");

        System.out.println(response.getBody().asString());
    }

    //4676e179ba066d115892b3ecf5f55172d848b90dfd47562bb6ecc82611d5dda7

    @Test
    public void postCreateAnOrder() {
        String body = "{\n" +
                "  \"bookId\": 6,\n" +
                "  \"customerName\": \"Khalil\"\n" +
                "}";
        Response response = given()
                .baseUri("https://simple-books-api.glitch.me")
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer 4676e179ba066d115892b3ecf5f55172d848b90dfd47562bb6ecc82611d5dda7")
                .body(body)
                .when()
                .post("/orders/");

        System.out.println(response.getBody().asString());
    }


    public static void checkOrdersOfUser() {
        Response response = given()
                .baseUri("https://simple-books-api.glitch.me")
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer 4676e179ba066d115892b3ecf5f55172d848b90dfd47562bb6ecc82611d5dda7")
                .when()
                .get("/orders");

        System.out.println(response.getBody().asString());
    }

    //ZFWt4_MgVXfi5Jyq8RNhp
    @Test
    public void checkDeletingOrder() {
        checkOrdersOfUser();

        given()
                .baseUri("https://simple-books-api.glitch.me")
                .contentType(ContentType.JSON)
                .header("Authorization", "Bearer 4676e179ba066d115892b3ecf5f55172d848b90dfd47562bb6ecc82611d5dda7")
                .when()
                .delete("/orders/ZFWt4_MgVXfi5Jyq8RNhp");

        checkOrdersOfUser();
    }
}

