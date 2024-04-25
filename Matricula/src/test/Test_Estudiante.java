package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Estudiante;

public class Test_Estudiante {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Matricula");
	EntityManager em = emf.createEntityManager();
	
	public Test_Estudiante() {}
		
		public void Insertar_Estudiante() {
			Estudiante insertarEstudiante = new Estudiante();
			insertarEstudiante.setCodigo(1);
			insertarEstudiante.setNombre("Joel");
			insertarEstudiante.setApellidos("Muñoz");
			insertarEstudiante.setAño_ingreso("2020");
			insertarEstudiante.setEscuela("Cibertec");
			insertarEstudiante.setTelefono(987654321);
			
			em.getTransaction().begin();
			em.persist(insertarEstudiante);
			em.getTransaction().commit();
			
			
		}
	public static void main (String[] args) {
		Test_Estudiante test_Estudiante = new Test_Estudiante();
		test_Estudiante.Insertar_Estudiante();
	}

}
