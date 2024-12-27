package automacao_Api_siteReqres.Endpoints;

import static io.restassured.RestAssured.given;

import automacao_Api_siteReqres.Model.Model;
import automacao_Api_siteReqres.config.Config;
import io.restassured.response.Response;

public class PostEndpoint {
	
	public static Response cadastrarUsuariosPost(Model post, String endPoit) {
	    return given()    
	    		.baseUri(Config.BASE_URL)
	            .contentType("application/json")
	            .body(post)
	            .when()
	            .post(endPoit);
	}
}
