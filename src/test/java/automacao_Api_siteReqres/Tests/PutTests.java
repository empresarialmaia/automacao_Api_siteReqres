package automacao_Api_siteReqres.Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import automacao_Api_siteReqres.Endpoints.PutEndpoint;
import automacao_Api_siteReqres.Model.Model;
import io.restassured.response.Response;

public class PutTests {

	@Test
	public void atualizacaoCompletaUsuariosComSucesso() {
		Model put = new Model();
		put.setName("morpheus Teste");
		put.setJob("zion resident");
		Response response = PutEndpoint.atualizarUsuariosPut(put, "2");
		assertEquals(200, response.getStatusCode());

	}

}
