package ru.alexandrov.springsecurity.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.alexandrov.springsecurity.models.Accounts;

@Repository
public interface AccountsRepository extends CrudRepository<Accounts, Long> {
	Accounts findByCustomerId(int customerId);
}
