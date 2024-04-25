package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_docente")
public class Docente implements Serializable {
	@Id
	@Column (name = "cod_docente")
	private int cod_docente;
	
	@Column (name = "nombres")
	private String nombres;
	
	@Column (name = "apellidos")
	private String apellidos;
	
	@Column (name = "dni")
	private String dni;
	
	
	 @Column (name="telefono")
	private String telefono;


	
	
	public int getCod_docente() {
		return cod_docente;
	}




	public void setCod_docente(int cod_docente) {
		this.cod_docente = cod_docente;
	}




	public String getNombres() {
		return nombres;
	}




	public void setNombres(String nombres) {
		this.nombres = nombres;
	}




	public String getApellidos() {
		return apellidos;
	}




	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}




	public String getDni() {
		return dni;
	}




	public void setDni(String dni) {
		this.dni = dni;
	}




	public String getTelefono() {
		return telefono;
	}




	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}




	public Docente () {}

}
