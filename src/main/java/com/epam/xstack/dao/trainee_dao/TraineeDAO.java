package com.epam.xstack.dao.trainee_dao;

import com.epam.xstack.models.dto.trainee.request.TraineeRegistrationRequestDTO;
import com.epam.xstack.models.dto.trainee.response.TraineeRegistrationResponseDTO;

public interface TraineeDAO {
    TraineeRegistrationResponseDTO saveTrainee(TraineeRegistrationRequestDTO requestDTO);
}
