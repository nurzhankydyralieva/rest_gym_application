package com.epam.xstack.service.trainer_service;

import com.epam.xstack.models.dto.trainer.request.TrainerRegistrationRequestDTO;
import com.epam.xstack.models.dto.trainer.response.TrainerRegistrationResponseDTO;

public interface TrainerService {
    TrainerRegistrationResponseDTO saveTrainer(TrainerRegistrationRequestDTO requestDTO);
}
