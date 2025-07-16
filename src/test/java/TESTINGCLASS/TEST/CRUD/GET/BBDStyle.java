package TESTINGCLASS.TEST.CRUD.GET;

import io.restassured.RestAssured;

public class BBDStyle {
    public static void main(String[] args) {

        RestAssured

                .given().baseUri("https://api.zippopotam.us").basePath("/IN/211002")
                .when().log().all()
                .get()
                .then().log().all().statusCode(200);
    }
}
