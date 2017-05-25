package com.rg.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.rg.entity.OrderDetails;

@Repository
public interface OrderDetailsDAO extends PagingAndSortingRepository<OrderDetails, Long>{

/*	@PersistenceContext
	private EntityManager entityManager;
	
	public void create(OrderDetails orderDetails) {
		entityManager.persist(orderDetails);
	}
	
	public void update(OrderDetails orderDetails) {
		entityManager.merge(orderDetails);
	}
	
	@SuppressWarnings("unchecked")
	public List<OrderDetails> findAll() {
		return entityManager.createQuery("Select t from " + OrderDetails.class.getSimpleName() + " t").getResultList();
	}
	
	public OrderDetails findById(Long id) {
		return entityManager.find(OrderDetails.class, id);
	}
	
	//not functional yet
	public void delete() {
		
	}*/
}
