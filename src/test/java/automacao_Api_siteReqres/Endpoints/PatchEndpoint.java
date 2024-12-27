package automacao_Api_siteReqres.Endpoints;

import static io.restassured.RestAssured.given;

import automacao_Api_siteReqres.Model.Model;
import automacao_Api_siteReqres.config.Config;
import io.restassured.response.Response;

public class PatchEndpoint {
	
	public static Response atualizarUsuariosPatch(Model patch, String id) {
	    return given()    
	    		.baseUri(Config.BASE_URL)
	            .contentType("application/json")
	            .body(patch)
	            .when()
	            .patch("/api/users/"+ id);
	}

}
