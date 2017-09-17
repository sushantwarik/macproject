package main.java.spring.batch.mapper;

import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import main.java.spring.batch.bo.Customer;

public class CustomerMapper implements FieldSetMapper<Customer> {

	@Override
	public Customer mapFieldSet(FieldSet record) throws BindException {
		// TODO Auto-generated method stub
		System.out.println("Mapping customer");
		Customer c = new Customer();
		c.setFirstname(record.readString(0));
		c.setLastname(record.readString(1));
		return c;
	}

}
