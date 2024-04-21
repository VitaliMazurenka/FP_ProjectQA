package com.newsPortal.RAtests;

import io.restassured.RestAssured;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    @BeforeMethod
    public void init(){
        RestAssured.baseURI = "https://squid-app-aywag.ondigitalocean.app";
        RestAssured.basePath = "api";
    }
}
