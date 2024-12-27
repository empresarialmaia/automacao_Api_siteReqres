package automacao_Api_siteReqres.Endpoints;

import automacao_Api_siteReqres.config.Config;
import static io.restassured.RestAssured.given;
import io.restassured.response.Response;

public class GetEndpont {
	
	public static Response listarUsuariosCadastradosGet(String pag) {
		return given()
				.baseUri(Config.BASE_URL)	            	            
	            .when()
	            .get("/api/users?page="+pag);					
	}
	
	public static Response listarUsuariosCadastradosPorIdGet(String id) {
		return given()
				.baseUri(Config.BASE_URL)	            	            
	            .when()
	            .get("/api/users/"+id);					
	}
	
	public static Response usuarioNaoCadastradoGet(String id) {
		return given()
				.baseUri(Config.BASE_URL)	            	            
	            .when()
	            .get("/api/users/"+id);					
	}
	
	public static Response listarRecursosGet() {
		return given()
				.baseUri(Config.BASE_URL)	            	            
	            .when()
	            .get("/api/unknown");					
	}
	
	public static Response listarUsuariosCadastradosComAtrasoGet(String pag) {
		return given()
				.baseUri(Config.BASE_URL)	            	            
	            .when()
	            .get("/api/users?delay="+pag);					
	}

}
