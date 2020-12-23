package com.Trendyol.Api;


import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class ApiTest {

    @BeforeClass
    public  void getUrl(){

          baseURI="http://ergast.com/api"; }

          //hejl

     @Test
    public void trendtest1(){

         Response response=given().accept(ContentType.JSON)
                    .when().get(baseURI);

         response.prettyPrint();

         Assert.assertEquals(response.statusCode(),200);
         Assert.assertEquals(response.contentType(),"application/json; charset=utf-8");
     }

    @Test
    public void trendtest2(){

        Response response=given().accept(ContentType.JSON)
                .contentType(ContentType.JSON)
                .pathParam("id","alonso")
                .when().get("/f1/2008/drivers/{id}");

        response.prettyPrint();

        Assert.assertEquals(response.statusCode(),200);
        Assert.assertEquals(response.contentType(),"application/json; charset=utf-8");
    }

}
