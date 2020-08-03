package pl.coderslab.Driver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.Driver.domain.Answer;

@Repository
public interface AnswerRepository extends JpaRepository<Answer, String> {

}
