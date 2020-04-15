package com.codegym.validateinforuser.repository;


import com.codegym.validateinforuser.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface CustomerRepository extends JpaRepository<Customer, Long> {

}
