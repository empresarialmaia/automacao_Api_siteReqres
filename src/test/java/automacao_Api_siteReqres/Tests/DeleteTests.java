package automacao_Api_siteReqres.Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import automacao_Api_siteReqres.Endpoints.DeleteEndpoint;
import io.restassured.response.Response;

public class DeleteTests {
	
	@Test                      
	public void deletarUsuarioPorIdComSucesso() {
		Response response = DeleteEndpoint.deletarUsuariosCadastradosPorIdDel("2");
		assertEquals(204,  response.getStatusCode(),"Status code incorreto! ");		
	    
		
	}

}
