package pl.bakkchos.walli.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.bakkchos.walli.data.QuestionEntity;
import pl.bakkchos.walli.data.QuestionRepository;
import pl.bakkchos.walli.dto.QuestionDTO;
import pl.bakkchos.walli.service.QuestionConverter;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuestionController {

    @Autowired
    QuestionRepository questionRepository;
    @Autowired
    QuestionConverter questionConverter;

    /* Maps to all HTTP actions by default (GET,POST,..)*/
    @RequestMapping("/q")
    public @ResponseBody
    List<QuestionDTO> getQuestions() {
        List<QuestionDTO> lista= new ArrayList<>();
        for (QuestionEntity x : questionRepository.findAll()){
            lista.add(questionConverter.convert(x));
        }
    return lista;
    }
}