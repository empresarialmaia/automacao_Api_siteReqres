package automacao_Api_siteReqres.Tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import automacao_Api_siteReqres.Endpoints.PostEndpoint;
import automacao_Api_siteReqres.Model.Model;
import io.restassured.response.Response;

public class PostTests {

	@Test
	public void cadastrarUsuariosComSucesso() {
		Model post = new Model();
		post.setName("morpheus");
		post.setJob("leader");
		Response response = PostEndpoint.cadastrarUsuariosPost(post, "/api/users");
		assertEquals(201, response.getStatusCode(),"Status code inesperado!");
		

	}
	
	@Test
	public void cadastrarUsuariosEndpointDiferenteComSucesso() {
		Model post = new Model();
		post.setEmail("eve.holt@reqres.in");
		post.setPassword("pistol");
		Response response = PostEndpoint.cadastrarUsuariosPost(post, "/api/register");
		assertEquals(200, response.getStatusCode(),"Status code inesperado!");
		

	}
	
	@Test
	public void cadastrarUsuarioSemSucesso() {
		Model post = new Model();
		post.setEmail("sydney@fife");		
		Response response = PostEndpoint.cadastrarUsuariosPost(post, "/api/register");
		assertEquals(400, response.getStatusCode(),"Status code inesperado!");		
		
		

	}
	
	@Test
	public void loginUsuariosComSucesso() {
		Model post = new Model();
		post.setEmail("eve.holt@reqres.in");
		post.setPassword("cityslicka");
		Response response = PostEndpoint.cadastrarUsuariosPost(post, "/api/login");
		assertEquals(200, response.getStatusCode(),"Status code inesperado!");
		

	}
	

	@Test
	public void loginUsuarioSemSucesso() {
		Model post = new Model();
		post.setEmail("peter@klaven");		
		Response response = PostEndpoint.cadastrarUsuariosPost(post, "/api/login");
		assertEquals(400, response.getStatusCode(),"Status code inesperado!");		
		
		

	}
	
	
}
