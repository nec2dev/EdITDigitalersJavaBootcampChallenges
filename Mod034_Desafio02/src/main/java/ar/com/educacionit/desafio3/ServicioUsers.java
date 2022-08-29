package ar.com.educacionit.desafio3;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

public class ServicioUsers {
	private static ArrayList<User> listaUsuarios = new ArrayList<User>() {
		{
			add(new User("Rosa", "Marfil"));
			add(new User("Pepito", "Grillo"));
			add(new User("Manuela", "Lago"));
		}
	};

	/**
	 * URL: http://localhost:8080/API_REST_WS-RS/api/users
	 * 
	 * @return Response list Users
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsers() {
		return Response.ok(listaUsuarios).build();
	}

	/**
	 * URL: http://localhost:8080/API_REST_WS-RS/api/users/Rosa
	 * 
	 * @param name String
	 * @return Response
	 */
	@GET
	@Path("/{name}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUserById(@PathParam("name") String name) {
		User found = null;
		for (int i = 0; i < listaUsuarios.size(); i++) {
			if (listaUsuarios.get(i).getName().equalsIgnoreCase(name)) {
				found = listaUsuarios.get(i);
			}
		}
		if (found == null) {
			return Response.status(Status.BAD_REQUEST).entity("User not found").build();
		} else {
			return Response.ok(found).build();
		}
	}

	/**
	 * URL: http://localhost:8080/API_REST_WS-RS/api/users/createUser Parameters in
	 * Postman: {"name":"Rosa3333","username":"Marfi3333l"}
	 * 
	 * @param User
	 * @return Response list NOTA: Si no existe el constructor vacío de User, da un
	 *         error y el userRequest viene null.
	 */
	
}
