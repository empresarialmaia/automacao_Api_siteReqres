package automacao_Api_siteReqres.Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import automacao_Api_siteReqres.Endpoints.PatchEndpoint;
import automacao_Api_siteReqres.Model.Model;
import io.restassured.response.Response;

public class PatchTests {
	
	@Test
	public void atualizacaoParcialUsuariosComSucesso() {
		Model patch = new Model();
		patch.setName("morpheus t");
		patch.setJob("zion resident");
		Response response = PatchEndpoint.atualizarUsuariosPatch(patch, "2");
		assertEquals(200, response.getStatusCode());
	}

}
