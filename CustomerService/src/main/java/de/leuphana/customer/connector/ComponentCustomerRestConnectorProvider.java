package de.leuphana.customer.connector;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.leuphana.customer.component.behaviour.CustomerService;
import de.leuphana.customer.component.structure.Customer;

@RestController
@RequestMapping("customers")
public class ComponentCustomerRestConnectorProvider {

	private final CustomerService customerService;

	public ComponentCustomerRestConnectorProvider(final CustomerService customerService) {
		this.customerService = customerService;
	}

	// get Customers
	@GetMapping("/customers")
	public List<Customer> getCustomers() {
		return customerService.getCustomers();
	}

	// get Customer by ID
	@GetMapping("{customerId}")
	public Customer getCustomer(@PathVariable int customerId) {
		return customerService.getCustomer(customerId);
	}

	// add Customer
	@PostMapping
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);
	}

	// update Customer by ID
	@PutMapping("{customerId}")
	public Customer updateCustomer(@PathVariable int customerId, @RequestBody Customer customer) {
		return customerService.updateCustomer(customerId, customer);
	}

	// delete Customer
	@DeleteMapping("/{customerId}")
	public void deleteCustomer(@PathVariable int customerId) {
		customerService.deleteCustomer(customerId);
	}
}
