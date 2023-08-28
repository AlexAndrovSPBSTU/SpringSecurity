package ru.alexandrov.springsecurity.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.alexandrov.springsecurity.models.Loans;

import java.util.List;


@Repository
public interface LoanRepository extends CrudRepository<Loans, Long> {
	List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);
}
