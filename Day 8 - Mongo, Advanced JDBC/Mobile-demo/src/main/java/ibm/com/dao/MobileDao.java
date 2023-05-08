package ibm.com.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import ibm.com.entity.Mobile;

public class MobileDao {
	
	private EntityManagerFactory factory;
	
	public MobileDao() {
		factory = Persistence.createEntityManagerFactory("MyJPA");
	}
	
	public void save(Mobile m) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.persist(m);
		txn.commit();
		em.close();
	
	}
	
	public Mobile fetch(int mcode) {
		EntityManager em = factory.createEntityManager();
		Mobile m = em.find(Mobile.class, mcode);
		return m;
	}
	
	public List<Mobile> fetchAll(){
		EntityManager em = factory.createEntityManager();
		Query query = em.createQuery("from Mobile");
		return query.getResultList();
	}
	
	public void update(Mobile m) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		em.merge(m);
		txn.commit();
		em.close();
	}
	
	public void delete(int mcode) {
		EntityManager em = factory.createEntityManager();
		EntityTransaction txn = em.getTransaction();
		
		txn.begin();
		Mobile m = em.find(Mobile.class, mcode);
		em.remove(m);
		txn.commit();
		em.close();
	}

}
