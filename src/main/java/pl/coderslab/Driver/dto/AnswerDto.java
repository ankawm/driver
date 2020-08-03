package pl.coderslab.Driver.dto;



public class AnswerDto {

    private Long id;
    private String title;
    private String description;
    //poprawić na obiekt
    // dto
    private Long file_id;

    private Boolean isCorrect;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Long getFile() {
        return file_id;
    }

    public static class Builder {
        private AnswerDto answerDto = new AnswerDto();

        public Builder withId(Long id){
            answerDto.id = id;
            return this;
        }

        public Builder withTitle(String title){
            answerDto.title= title;
            return this;
        }

        public Builder withDescription(String description){
            answerDto.description = description;
            return this;
        }

        public Builder withFile(Long file_id){
            answerDto.file_id = file_id;
            return this;
        }
        public Builder withIsCorrect(Boolean isCorrect){
            answerDto.isCorrect = isCorrect;
            return this;
        }


        public AnswerDto build(){
            return answerDto;
        }


    }


}
