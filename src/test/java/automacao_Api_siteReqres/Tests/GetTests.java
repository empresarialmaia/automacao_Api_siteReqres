package automacao_Api_siteReqres.Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import automacao_Api_siteReqres.Endpoints.GetEndpont;
import io.restassured.response.Response;

public class GetTests {
	
	@Test	
	public void listarUsuariosCadastradosComSucesso() {				
		Response response = GetEndpont.listarUsuariosCadastradosGet("2");			
		assertEquals(200, response.getStatusCode(),"Status code inesperado!");
		

}
	@Test	
	public void listarUsuariosCadastradosPorIdComSucesso() {				
		Response response = GetEndpont.listarUsuariosCadastradosPorIdGet("2"); 
	    assertEquals(200, response.getStatusCode(), "Status code inesperado!");
	    assertEquals("janet.weaver@reqres.in", response.jsonPath().getString("data.email"), "Email do usuário não confere!");
	    assertTrue(response.getBody().asString().contains("janet.weaver@reqres.in"), "Resposta não contém o email do usuário!");
   
	
}
	
	@Test	
	public void usuarioNaoCadastrados() {				
		Response response = GetEndpont.usuarioNaoCadastradoGet("23");			
		assertEquals(404, response.getStatusCode(),"Status code inesperado!");
		
	
}
	@Test	
	public void listarRecursos() {				
		Response response = GetEndpont.listarRecursosGet();			
		assertEquals(200, response.getStatusCode(),"Status code inesperado!");
		
	
}
	
	@Test	
	public void listarUsuariosCadastradosComAtrasoNaResposta() {				
		Response response = GetEndpont.listarUsuariosCadastradosGet("3");			
		assertEquals(200, response.getStatusCode(),"Status code inesperado!");
		

}
	
	}
