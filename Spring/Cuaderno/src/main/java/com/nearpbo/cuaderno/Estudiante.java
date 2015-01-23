package com.nearpbo.cuaderno;

public class Estudiante {
	private String nombre;
	private String telefono;
	private String curso;
	public Estudiante(){
		
	}
	public String getNombre(){
		return this.nombre;
	}
	public void setNombre(String pNombre){
		this.nombre=pNombre;
	}
	public String getTelefono(){
		return this.telefono;			
	}
	public void setTelefono(String pTelefono){
		this.telefono=pTelefono;
	}
	public String getCurso(){
		return this.curso;
	}
	public void setCurso(String pCurso){
		this.curso=pCurso;
	}
}
