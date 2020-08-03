package pl.coderslab.Driver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.Driver.domain.Question;
import pl.coderslab.Driver.domain.Training;

@Repository
public interface TrainingRepository extends JpaRepository<Training, String> {

}
