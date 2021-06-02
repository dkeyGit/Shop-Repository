package de.leuphana.customer.connector;

import org.springframework.data.repository.CrudRepository;

import de.leuphana.customer.component.structure.Customer;

//Spring Data Connector
public interface ComponentCustomerSpringDataConnectorRequester extends CrudRepository<Customer, Integer> {

	public Customer findById(int id);

	public void deleteById(int id);
}
