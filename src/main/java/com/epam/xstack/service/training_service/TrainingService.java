package com.epam.xstack.service.training_service;

import com.epam.xstack.models.dto.training_dto.request.TrainingRequestDTO;
import com.epam.xstack.models.dto.training_dto.response.TrainingResponseDTO;

public interface TrainingService {
    TrainingResponseDTO saveTraining(TrainingRequestDTO requestDTO);
}
