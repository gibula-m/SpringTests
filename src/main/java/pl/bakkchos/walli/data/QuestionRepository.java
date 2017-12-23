package pl.bakkchos.walli.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import pl.bakkchos.walli.dto.QuestionDTO;

import java.util.List;

public interface QuestionRepository extends JpaRepository<QuestionEntity, Long> {

    QuestionEntity findByAuthorid(Integer author_id);

}