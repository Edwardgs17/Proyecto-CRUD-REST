package com.Rest.crud.cliente;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.Rest.crud.servicio.Cliente;
import com.Rest.crud.vo.PersonaVO;

@Path("/personas")
public class ServiciosPersonas {

	Cliente misServicios=new Cliente();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List getPersonas() {
		
		List listaPersonas=misServicios.getAllPersonas();
		
		return listaPersonas;
		
	}
	
	@GET
	@Path("/{idPersona}")
	@Produces(MediaType.APPLICATION_JSON)
	public PersonaVO getPersonasDocumento(@PathParam("idPersona") int idPersona) {
		
		return misServicios.getPersonaVO(idPersona);
		
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public PersonaVO crearPersona(PersonaVO miPersona) {
		
		return misServicios.agregarPersona(miPersona);
		
	}
	
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	public PersonaVO actualizarPersona(PersonaVO miPersona) {
		
		return misServicios.actualizarPersona(miPersona);
		
	}
	
	@DELETE
	@Path("/{idPersona}")
	@Produces(MediaType.APPLICATION_JSON)
	public void eliminarPersona(@PathParam("idPersona") int idPersona) {
		
		misServicios.eliminarPersona(idPersona);
	}
	
}
