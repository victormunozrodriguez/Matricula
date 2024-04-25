package test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Curso;

public class Test_Curso {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Matricula");
	EntityManager em = emf.createEntityManager();
	
	public Test_Curso() {}
		
		public void Insertar_Curso() {
			Curso insertarCurso = new Curso();
			insertarCurso.setCod_curso(1);
			insertarCurso.setNombre("Matematicas");
			insertarCurso.setCredito("5");
		
			em.getTransaction().begin();
			em.persist(insertarCurso);
			em.getTransaction().commit();
			
			
		}
	public static void main (String[] args) {
		Test_Curso test_Curso = new Test_Curso();
		test_Curso.Insertar_Curso();
	}

}