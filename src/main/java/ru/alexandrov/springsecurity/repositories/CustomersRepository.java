package ru.alexandrov.springsecurity.repositories;

import org.springframework.data.repository.CrudRepository;
import ru.alexandrov.springsecurity.models.Customer;

import java.util.List;

public interface CustomersRepository extends CrudRepository<Customer, Integer> {
    List<Customer> findByEmail(String email);
}
