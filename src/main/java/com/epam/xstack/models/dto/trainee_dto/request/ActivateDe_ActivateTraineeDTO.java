package com.epam.xstack.models.dto.trainee_dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivateDe_ActivateTraineeDTO {
    private String userName;
    private Boolean isActive;
}
