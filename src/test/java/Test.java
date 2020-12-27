import com.BaseClass;
import com.sun.org.glassfish.gmbal.Description;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;

import static io.restassured.RestAssured.*;
import static javax.management.Query.not;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.nullValue;

public class  Test extends BaseClass {

    @org.junit.Test
    @Description("Status'un Success gelme kontrolü")
    public void testStatusCode(){
        given().
                when().get(baseURI).then().statusCode(HttpStatus.SC_OK);
    }


    @org.junit.Test
        @Description("Body içerik arama")
    public void ByBodySearch() {

        Response response = RestAssured.get(baseURI);
        System.out.println(response.asString());
        System.out.println(response.getBody().asString());
        System.out.println(response.getStatusCode());
        System.out.println(response.getStatusLine());
        System.out.println(response.getHeader("content-type"));
        System.out.println(response.getTime());




    }
}