package automacao_Api_siteReqres.Endpoints;

import static io.restassured.RestAssured.given;

import automacao_Api_siteReqres.config.Config;
import io.restassured.response.Response;

public class DeleteEndpoint {
	
	public static Response deletarUsuariosCadastradosPorIdDel(String id) {
		return given()				
				.baseUri(Config.BASE_URL)	            	            
	            .when()
	            .delete("/api/users/"+id);					
	}

}
