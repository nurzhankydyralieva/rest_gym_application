package com.epam.xstack.models.dto.trainee.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GetTraineeProfileRequestDTO {
    private String userName;
}
