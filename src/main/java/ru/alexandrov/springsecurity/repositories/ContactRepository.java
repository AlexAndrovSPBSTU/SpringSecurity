package ru.alexandrov.springsecurity.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.alexandrov.springsecurity.models.Contact;

@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {

}
