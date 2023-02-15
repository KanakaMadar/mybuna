package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Pdto;

public class Pdao {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();

	public void insert(Pdto p1) {
		// TODO Auto-generated method stub
		et.begin();
		em.persist(p1);
		et.commit();
	}

	public void update(int id, String s2) {
		Pdto pdto = em.find(Pdto.class, id);
		pdto.setBloodgroup(s2);
		et.begin();
		em.merge(pdto);
		et.commit();
	}

	public void remove(int id) {
		// TODO Auto-generated method stub
		Pdto t1 = em.find(Pdto.class, id);
		et.begin();
		em.remove(t1);
		et.commit();

	}

}
