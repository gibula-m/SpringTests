package pl.bakkchos.walli.service;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import pl.bakkchos.walli.data.QuestionEntity;
import pl.bakkchos.walli.data.UserEntity;
import pl.bakkchos.walli.dto.QuestionDTO;
import pl.bakkchos.walli.dto.UserDTO;

@Component
public class QuestionConverter implements Converter<QuestionEntity, QuestionDTO> {

    @Override
    public QuestionDTO convert(QuestionEntity questionEntity) {
        return new QuestionDTO(questionEntity.getId(),questionEntity.getTitle(),questionEntity.getContent(),questionEntity.getAuthorid());
    }
}
