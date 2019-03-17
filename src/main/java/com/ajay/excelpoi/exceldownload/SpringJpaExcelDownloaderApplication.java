package com.ajay.excelpoi.exceldownload;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ajay.excelpoi.exceldownload.model.Customer;
import com.ajay.excelpoi.exceldownload.repository.CustomerRepository;

@SpringBootApplication
public class SpringJpaExcelDownloaderApplication implements CommandLineRunner {

	@Autowired
	CustomerRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaExcelDownloaderApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		List<Customer> customers = Arrays.asList(new Customer(Long.valueOf(1), "Ajay Sharma", "Massachusetts", 29),
				new Customer(Long.valueOf(2), "Mahesh", "New York", 27),
				new Customer(Long.valueOf(3), "Sanjay", "Washington DC", 25),
				new Customer(Long.valueOf(4), "John", "Ellicott City", 33),
				new Customer(Long.valueOf(5), "Jason ", "California", 36),
				new Customer(Long.valueOf(5), "Lee ", "Baltimore", 30));

		// save a list of Customers
		repository.saveAll(customers);
	}
}
