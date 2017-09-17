package main.java.spring.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import main.java.spring.batch.bo.Customer;

public class CustomProcessor implements ItemProcessor<Customer, Customer> {

	@Override
	public Customer process(Customer customer) throws Exception {
		System.out.println(customer);
		return customer;
	}

}
