package ru.alexandrov.springsecurity.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.alexandrov.springsecurity.models.Notice;

import java.util.List;

@Repository
public interface NoticeRepository extends CrudRepository<Notice, Long> {
	@Query(value = "from Notice n where current_date BETWEEN noticBegDt AND noticEndDt")
	List<Notice> findAllActiveNotices();
}
