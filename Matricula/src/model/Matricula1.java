package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "tb_matricula")
public class Matricula1 implements Serializable {
	@Id
	@Column (name = "año_academico")
	private int año_academico;
	
	 
	@Column (name = "ciclo")
	private int ciclo;
	
	public int getAño_academico() {
		return año_academico;
	}


	@Column (name = "seccion")
	private String seccion;
	
	@Column (name = "cod_estudiante")
	private int cod_estudiante;
	
	@Column (name = "cod_curso")
	private int cod_curso;
	
	
	@Column (name = "cod_docente")
	private int cod_docente;






	public void setAño_academico(int año_academico) {
		this.año_academico = año_academico;
	}





	public int getCiclo() {
		return ciclo;
	}





	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}





	public String getSeccion() {
		return seccion;
	}





	public void setSeccion(String seccion) {
		this.seccion = seccion;
	}





	public int getCod_estudiante() {
		return cod_estudiante;
	}





	public void setCod_estudiante(int cod_estudiante) {
		this.cod_estudiante = cod_estudiante;
	}





	public int getCod_curso() {
		return cod_curso;
	}





	public void setCod_curso(int cod_curso) {
		this.cod_curso = cod_curso;
	}





	public int getCod_docente() {
		return cod_docente;
	}





	public void setCod_docente(int cod_docente) {
		this.cod_docente = cod_docente;
	}





	


	public Matricula1 () {}
	


	}

