package com.epam.xstack.service.trainee_service;

import com.epam.xstack.models.dto.trainee.request.TraineeRegistrationRequestDTO;
import com.epam.xstack.models.dto.trainee.response.TraineeRegistrationResponseDTO;

public interface TraineeService {
    TraineeRegistrationResponseDTO saveTrainee(TraineeRegistrationRequestDTO requestDTO);
}
