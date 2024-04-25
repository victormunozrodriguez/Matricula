package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_estudiante")
public class Estudiante implements Serializable {
	@Id
	@Column (name = "cod_estudiante")
	private int codigo;
	
	@Column (name = "nombres")
	private String nombre;
	
	@Column (name = "apellidos")
	private String apellidos;
	
	@Column (name = "año_ingreso")
	private String año_ingreso;
	
	@Column (name = "escuela")
	private String escuela; 
	
	 @Column (name="telefono")
	private int telefono;
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getAño_ingreso() {
		return año_ingreso;
	}

	public void setAño_ingreso(String año_ingreso) {
		this.año_ingreso = año_ingreso;
	}

	public String getEscuela() {
		return escuela;
	}

	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}

	public int getTelefono() {
		return telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	
	
	public Estudiante () {}

}
