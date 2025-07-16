package TESTINGCLASS.TEST.CRUD.GET;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class BDDStyleusingTestNg {


    @Test
    public void get_All_BookingsPos(){
        RequestSpecification r = RestAssured.given();
        r.baseUri("https://restful-booker.herokuapp.com");
        r.basePath("/booking/1").log().all();
        r.when().get();
        r.then().log().all().statusCode(200);
    }
 @Test
    public void get_All_BookingsPos1(){
     RequestSpecification r = RestAssured.given();
     r.baseUri("https://restful-booker.herokuapp.com");
     r.basePath("/booking/8927").log().all();
     r.when().get();
     r.then().log().all().statusCode(200);
    }

 @Test
    public void get_All_BookingsNeg(){
     RequestSpecification r = RestAssured.given();
     r.baseUri("https://restful-booker.herokuapp.com");
     r.basePath("/booking/-1").log().all();
     r.when().get();
     r.then().log().all().statusCode(200);
    }
}
