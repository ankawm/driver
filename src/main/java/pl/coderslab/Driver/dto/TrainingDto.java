package pl.coderslab.Driver.dto;


import pl.coderslab.Driver.domain.Question;

import java.util.List;

public class TrainingDto {

    private Long id;
    private String title;
    private String description;
    private List<QuestionDto> questions;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public List<QuestionDto> getQuestions() {
        return questions;
    }

    public static class Builder {
        private TrainingDto trainingDto = new TrainingDto();

        public Builder withId(Long id){
            trainingDto.id = id;
            return this;
        }

        public Builder withTitle(String title){
            trainingDto.title= title;
            return this;
        }

        public Builder withDescription(String description){
            trainingDto.description = description;
            return this;
        }

        public Builder withQuestions(List<QuestionDto> questions){
            trainingDto.questions= questions;
            return this;
        }

        public TrainingDto build(){
            return trainingDto;
        }

    }

}
