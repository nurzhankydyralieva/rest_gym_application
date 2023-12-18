package com.epam.xstack.models.dto.trainer_dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActivateDe_ActivateTrainerDTO {
    private String userName;
    private Boolean isActive;
}
