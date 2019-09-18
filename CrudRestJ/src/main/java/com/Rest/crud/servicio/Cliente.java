package com.Rest.crud.servicio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.Rest.crud.vo.PersonaVO;

public class Cliente{

	public static HashMap<Integer, PersonaVO> personasHash=getPersonasHash();

	public Cliente() {
		
		super();
	if(personasHash==null) {
		
		personasHash=new HashMap<Integer, PersonaVO>();
		
		PersonaVO miPersona1= new PersonaVO(1,123,"juan","colombiano");
		PersonaVO miPersona2= new PersonaVO(2,234,"maicol","africano");
		PersonaVO miPersona3= new PersonaVO(3,345,"oscar","taliban");
		
		personasHash.put(123, miPersona1);
		personasHash.put(234, miPersona2);
		personasHash.put(345, miPersona3);
	}
	
}
	public List getAllPersonas() {
		
		List PersonaVO = new ArrayList(personasHash.values());
		return PersonaVO;
		
	}
	
	public PersonaVO getPersonaVO(int idPersona) {
		PersonaVO miPersona= personasHash.get(idPersona);
		return miPersona;
		
	}
	
	public PersonaVO agregarPersona(PersonaVO miPersona) {
		miPersona.setIdPersona(personasHash.size());
		personasHash.put(miPersona.getIdPersona(), miPersona);
		
		return miPersona;
		
	}
	
	public PersonaVO actualizarPersona(PersonaVO miPersona) {
		if(miPersona.getDocumento()<=0) 
			return null;
			personasHash.put(miPersona.getDocumento(), miPersona);
		
		return miPersona;
			
	}
	public void eliminarPersona(int idPersona) {
		personasHash.remove(idPersona);
	}
	private static HashMap<Integer, PersonaVO> getPersonasHash() {
		
		return personasHash;
	}
}
