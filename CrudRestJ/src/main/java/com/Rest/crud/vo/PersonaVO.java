package com.Rest.crud.vo;

public class PersonaVO {

    private int idPersona;
	private int documento;
	private String nombres;
	private String nacionalidad;
	

	public PersonaVO() {
		
	}
	
	public PersonaVO(int idPersona, int documento, String nombres, String nacionalidad) {
		super();
		this.idPersona= idPersona;
		this.documento = documento;
		this.nombres = nombres;
		this.nacionalidad = nacionalidad;
	}
	
	public int getDocumento() {
		return documento;
	}
	public void setDocumento(int documento) {
		this.documento = documento;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
}
