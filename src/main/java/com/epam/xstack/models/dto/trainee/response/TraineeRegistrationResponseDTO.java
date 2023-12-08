package com.epam.xstack.models.dto.trainee.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TraineeRegistrationResponseDTO {
    private String userName;
    private String password;
}
