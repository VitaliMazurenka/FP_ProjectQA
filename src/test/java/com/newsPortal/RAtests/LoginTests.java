package com.newsPortal.RAtests;

import com.newsPortal.AuthRequest;
import com.newsPortal.AuthResponse;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class LoginTests extends TestBase{
    AuthRequest auth = AuthRequest.builder()
            .username("vit1@mail.com")
            .password("12345")
            .build();

    @Test
    public void loginSuccessTest(){
        AuthResponse response = given()
        .contentType("application/json")
                .body(auth)
                .when()
                .post("auth/login")
                .then()
                .assertThat().statusCode(200)
                .extract().response().as(AuthResponse.class);
        System.out.println(response.getToken());
    }
}
