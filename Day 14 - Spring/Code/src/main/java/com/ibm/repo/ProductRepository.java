package com.ibm.repo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ibm.entity.Product;

@Repository
public class ProductRepository {

//	@PersistenceContext(unitName = "MyJPA")
//	private EntityManager em;
	
	EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence.createEntityManagerFactory("MyJPA");//
	EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
	
//	@Transactional
	public void save(Product p) {
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
	}
	
	public Product fetch(int code) {
		return em.find(Product.class, code);
	}
	
	public List<Product> list() {
		return em.createQuery("from Product").getResultList();
	}
}
