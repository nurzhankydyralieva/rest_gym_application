package com.epam.xstack.models.dto.trainee.response;

import com.epam.xstack.models.entity.Trainer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTraineeProfileResponseDTO {
    private String userName;
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private String address;
    private Boolean isActive;
    private Collection<Trainer> trainers;
}