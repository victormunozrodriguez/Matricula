package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Matricula1;

public class Test_Matricula {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Matricula");
	EntityManager em = emf.createEntityManager();
	
	public Test_Matricula() {}
		
		public void Insertar_Matricula1() {
			Matricula1 insertarMatricula1 = new Matricula1();
			 insertarMatricula1.setAño_academico(2021);
			 insertarMatricula1.setCiclo(5);
			 insertarMatricula1.setSeccion("MNU");
			 insertarMatricula1.setCod_estudiante(1);
			 insertarMatricula1.setCod_curso(1);
			 insertarMatricula1.setCod_docente(1);
			
			em.getTransaction().begin();
			em.persist( insertarMatricula1);
			em.getTransaction().commit();
			
			
		}
	public static void main (String[] args) {
		Test_Matricula test_Matricula1 = new Test_Matricula();
		test_Matricula1.Insertar_Matricula1();
	}

}
