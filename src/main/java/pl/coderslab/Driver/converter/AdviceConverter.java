package pl.coderslab.Driver.converter;

import org.springframework.stereotype.Component;
import pl.coderslab.Driver.domain.Answer;
import pl.coderslab.Driver.dto.AnswerDto;


@Component
public class AdviceConverter {


    public AnswerDto toResource(Answer answer){
        return new AnswerDto.Builder()
                .withId(answer.getId())
                .withTitle(answer.getTitle())
                .withDescription(answer.getDescription())
                .withFile(answer.getFileId())
               .build();
    }

    public Answer fromResource(AnswerDto answerDto){
        Answer answer  = new Answer();
        answer.setId(answerDto.getId());
        answer.setTitle(answerDto.getTitle());
        answer.setDescription(answer.getDescription());
        answer.setFileId(answer.getFileId());
        answer.setCorrect(answer.isCorrect());
        return answer;
    }
}