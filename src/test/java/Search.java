import com.BaseClass;
import com.sun.org.glassfish.gmbal.Description;
import io.restassured.http.ContentType;
import org.junit.Test;
import org.kohsuke.rngom.parse.host.Base;

import static io.restassured.RestAssured.given;

public class Search extends BaseSearch {


    public void ByID(){
        ByIDorTitle();

    }



    public void Search(){
         BySearch();
    }
}