package ru.alexandrov.springsecurity.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.alexandrov.springsecurity.models.AccountTransactions;

import java.util.List;


@Repository
public interface AccountTransactionsRepository extends CrudRepository<AccountTransactions, Long> {
	List<AccountTransactions> findByCustomerIdOrderByTransactionDtDesc(int customerId);
}
