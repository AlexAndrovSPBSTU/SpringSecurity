package ru.alexandrov.springsecurity.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.alexandrov.springsecurity.models.Customer;
import ru.alexandrov.springsecurity.repositories.CustomersRepository;

import java.util.List;

@Service
public class CustomersService {
    private final CustomersRepository customersRepository;

    @Autowired
    public CustomersService(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }

    public List<Customer> findByEmail(String username) {
        return customersRepository.findByEmail(username);
    }

    public Customer save(Customer customer) {
        return customersRepository.save(customer);
    }
}
