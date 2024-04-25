package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_curso")

public class Curso implements Serializable {
	@Id
	@Column (name = "cod_curso")
	private int cod_curso;
	
	@Column (name = "nombre")
	private String nombre;
	
	@Column (name = "credito")
	private String credito;

	public int getCod_curso() {
		return cod_curso;
	}

	public void setCod_curso(int cod_curso) {
		this.cod_curso = cod_curso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCredito() {
		return credito;
	}

	public void setCredito(String credito) {
		this.credito = credito;
	}
	
	public Curso () {}


}
