package de.leuphana.customer.component.behaviour;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.leuphana.customer.component.structure.Customer;
import de.leuphana.customer.connector.ComponentCustomerSpringDataConnectorRequester;

@Service
public class CustomerService {

	@Autowired
	ComponentCustomerSpringDataConnectorRequester repository;

	@Autowired
	public CustomerService(final ComponentCustomerSpringDataConnectorRequester repository) {
		this.repository = repository;
	}

	// get all Customers
	public List<Customer> getCustomers() {
		return (List<Customer>) repository.findAll();
	}

	// get Customer by ID
	public Customer getCustomer(int customerId) {
		return repository.findById(customerId);
	}

	// add Customer
	public Customer addCustomer(Customer customer) {
		return repository.save(customer);
	}

	// update Customer by ID
	public Customer updateCustomer(int customerId, Customer customer) {
		Customer customerToUpdate = repository.findById(customerId);

		customerToUpdate.setName(customer.getName());
		customerToUpdate.setAddress(customer.getAddress());

		return repository.save(customerToUpdate);
	}

	// delete Customer by ID
	public void deleteCustomer(int customerId) {
		repository.findById(customerId);
		repository.deleteById(customerId);
	}
}
