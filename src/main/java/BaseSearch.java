import com.BaseClass;
import com.sun.org.glassfish.gmbal.Description;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

public class BaseSearch extends BaseClass {

    @org.junit.Test
    @Description("By search arama alanında Harry Potter arama")
    public void BySearch() {
        given()
                .baseUri("http://www.omdbapi.com/&apikey=bf8107c3")
                .when()
                .get("?s=Harry+Potter");

    }
    @org.junit.Test
    @Description("BySearch alanından  Harry Potter and the Sorcerer's Stone filmini seçip ByIDorTitle alanında idsine göre arama ")
    public void ByIDorTitle() {

        String imdbid =
                given()
                        .contentType(ContentType.JSON)
                        .when()
                        .get(baseURI)
                        .then()
                        .extract().response().body().path("Search.imdbID[1]","Search.Title[1]");

        System.out.println("Harry Potter and the Sorcerer's Stone imdbID:"+imdbid);
        given()
                .contentType(ContentType.JSON)
                .pathParam("imdbID", imdbid).
                expect().
                statusCode(200).
                when().
                get("http://www.omdbapi.com/?i={imdbID}&plot=full&apikey=bf8107c3");

        return  ;


    }

}
