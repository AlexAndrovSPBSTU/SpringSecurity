package ru.alexandrov.springsecurity.repositories;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.alexandrov.springsecurity.models.Cards;

@Repository
public interface CardsRepository extends CrudRepository<Cards, Long> {
	List<Cards> findByCustomerId(int customerId);
}
