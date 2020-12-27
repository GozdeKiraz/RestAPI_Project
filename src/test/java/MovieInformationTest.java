import com.BaseClass;
import com.sun.org.glassfish.gmbal.Description;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.equalTo;

public class MovieInformationTest extends BaseClass {

    @org.junit.Test
    @Description("Gelen json body içerisindeki filmin gösterim yılının kontrolü")
    public void testMovieYear(){
        given()
                .when()
                .get("http://www.omdbapi.com/?s=Harry+Potter&plot=full&apikey=bf8107c3")
                .then()
                .body("Search.Year[1]",equalTo("2001"));
    }

    @org.junit.Test
    @Description("Gelen json body içerisindeki title  kontrolü")
    public void testMovieTitle(){
        given()
                .when()
                .get(baseURI)
                .then()
                .body("Search.Title[1]",equalTo("Harry Potter and the Sorcerer's Stone"));
    }
    @org.junit.Test
    @Description("Gelen json body içerisindeki released  kontrolü")
    public void testMovieReleaseYear(){
        given()
                .when()
                .get("http://www.omdbapi.com/?i=tt0241527&plot=full&apikey=bf8107c3")
                .then()
                .body("Released",equalTo("16 Nov 2001"));
    }


}
