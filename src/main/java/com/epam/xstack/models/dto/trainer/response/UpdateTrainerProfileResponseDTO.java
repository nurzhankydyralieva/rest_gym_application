package com.epam.xstack.models.dto.trainer.response;

import com.epam.xstack.models.entity.Trainee;
import com.epam.xstack.models.entity.TrainingType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTrainerProfileResponseDTO {
    private String userName;
    private String firstName;
    private String lastName;
    private TrainingType specialization;
    private Boolean isActive;
    private List<Trainee> trainees;
}
