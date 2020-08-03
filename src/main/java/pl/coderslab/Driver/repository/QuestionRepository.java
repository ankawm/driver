package pl.coderslab.Driver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.Driver.domain.Advice;
import pl.coderslab.Driver.domain.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, String> {

}
