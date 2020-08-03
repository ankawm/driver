package pl.coderslab.Driver.dto;

import pl.coderslab.Driver.domain.Answer;

import java.util.List;

public class QuestionDto {

    private Long id;
    private String title;
    private String description;
    //poprawić na obiekt
    // dto
    private Long file_id;

    private List<AnswerDto> answers;

    public Long getFile_id() {
        return file_id;
    }

    public List<AnswerDto> getAnswers() {
        return answers;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public static class Builder {
        private QuestionDto questionDto = new QuestionDto();

        public Builder withId(Long id){
            questionDto.id = id;
            return this;
        }

        public Builder withTitle(String title){
            questionDto.title= title;
            return this;
        }

        public Builder withDescription(String description){
            questionDto.description = description;
            return this;
        }

        public Builder withFile(Long file_id){
            questionDto.file_id = file_id;
            return this;
        }
        public Builder withAnswers(List<AnswerDto> answers){
            questionDto.answers = answers;
            return this;
        }

        public QuestionDto build(){
            return questionDto;
        }

    }

}
