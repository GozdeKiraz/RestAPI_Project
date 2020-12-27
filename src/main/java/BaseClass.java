package com;

import static io.restassured.RestAssured.*;
import static java.lang.Math.log;
import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.Matchers.containsInAnyOrder;

import com.google.gson.JsonObject;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sun.org.glassfish.gmbal.Description;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

import java.util.List;
import java.util.Map;


public class BaseClass
{

    @Before

    public void setUp(){

        RestAssured.baseURI="http://www.omdbapi.com/?s=Harry+Potter&plot=full&apikey=bf8107c3";
        given().
                param("apikey","bf8107c3").
                param("s", "Harry Potter and the Sorcerer's Stone").
                param("type", "movie").
                param("y", "").
                param("r", "json").
                param("page", "1").
                param("callback", "").
                param("v", "1");


    }

}








