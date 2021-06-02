package de.leuphana.customer.component.behaviour;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import de.leuphana.customer.component.structure.Customer;
import de.leuphana.customer.connector.ComponentCustomerSpringDataConnectorRequester;

@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {

	private final ComponentCustomerSpringDataConnectorRequester dReq;

	public DataLoader(ComponentCustomerSpringDataConnectorRequester dReq) {
		this.dReq = dReq;
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		Customer customer_a = new Customer();
		customer_a.setName("Josef");
		customer_a.setAddress("Musterstrasse 1");
		dReq.save(customer_a);

		Customer customer_b = new Customer();
		customer_b.setName("Strolch");
		customer_b.setAddress("Musterstrasse 2");
		dReq.save(customer_b);

		Customer customer_c = new Customer();
		customer_c.setName("Alexander-Marcus");
		customer_c.setAddress("Musterstrasse 3");
		dReq.save(customer_c);
	}

}
