package pl.coderslab.Driver.dto;


import pl.coderslab.Driver.domain.Training;

import java.util.List;

public class AdviceDto {

    private Long id;

    private String title;

    private String description;
    //poprawić na obiekt
    // dto
    private Long file_id;

    private List<TrainingDto> trainings;

    private boolean trainingEnable;

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Long getFile_id() {
        return file_id;
    }

    public List<TrainingDto> getTrainings() {
        return trainings;
    }

    public boolean isTrainingEnable() {
        return trainingEnable;
    }

    public static class Builder {
        private AdviceDto adviceDto = new AdviceDto();

        public Builder withId(Long id){
            adviceDto.id = id;
            return this;
        }

        public Builder withTitle(String title){
            adviceDto.title= title;
            return this;
        }

        public Builder withDescription(String description){
            adviceDto.description = description;
            return this;
        }

        public Builder withFile(Long file_id){
            adviceDto.file_id = file_id;
            return this;
        }
        public Builder withTrainings(List<TrainingDto> trainings){
            adviceDto.trainings = trainings;
            return this;
        }
        public Builder withTrainingEnable(Boolean trainingEnable){
            adviceDto.trainingEnable = trainingEnable;
            return this;
        }

        public AdviceDto build(){
            return adviceDto;
        }


    }


}
