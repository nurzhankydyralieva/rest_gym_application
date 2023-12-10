package com.epam.xstack.service.training_service;

import com.epam.xstack.models.dto.training_dto.request.AddTrainingRequestDTO;
import com.epam.xstack.models.dto.training_dto.response.AddTrainingResponseDTO;

public interface TrainingService {
    AddTrainingResponseDTO saveTraining(AddTrainingRequestDTO requestDTO);
}
