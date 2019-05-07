package com.lambdaschool.cruddyorder.demo.repos;

import com.lambdaschool.cruddyorder.demo.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>
{
}
