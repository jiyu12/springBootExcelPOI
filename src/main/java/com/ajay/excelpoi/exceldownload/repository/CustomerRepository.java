package com.ajay.excelpoi.exceldownload.repository;

import org.springframework.data.repository.CrudRepository;

import com.ajay.excelpoi.exceldownload.model.Customer;
 
public interface CustomerRepository extends CrudRepository<Customer, Long>{
}
