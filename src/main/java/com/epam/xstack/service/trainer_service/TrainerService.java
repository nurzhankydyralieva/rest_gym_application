package com.epam.xstack.service.trainer_service;

import com.epam.xstack.models.dto.trainer.request.GetTrainerProfileRequestDTO;
import com.epam.xstack.models.dto.trainer.request.TrainerRegistrationRequestDTO;
import com.epam.xstack.models.dto.trainer.request.UpdateTrainerProfileRequestDTO;
import com.epam.xstack.models.dto.trainer.response.GetTrainerProfileResponseDTO;
import com.epam.xstack.models.dto.trainer.response.TrainerRegistrationResponseDTO;
import com.epam.xstack.models.dto.trainer.response.UpdateTrainerProfileResponseDTO;

import java.util.UUID;

public interface TrainerService {
    TrainerRegistrationResponseDTO saveTrainer(TrainerRegistrationRequestDTO requestDTO);
    GetTrainerProfileResponseDTO selectTrainerProfileByUserName(UUID id, GetTrainerProfileRequestDTO requestDTO);
    UpdateTrainerProfileResponseDTO updateTrainerProfile(UUID id, UpdateTrainerProfileRequestDTO requestDTO);
}
