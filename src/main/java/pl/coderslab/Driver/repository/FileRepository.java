package pl.coderslab.Driver.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pl.coderslab.Driver.domain.File;

@Component
@Repository
public interface FileRepository extends JpaRepository<File, String> {

}
