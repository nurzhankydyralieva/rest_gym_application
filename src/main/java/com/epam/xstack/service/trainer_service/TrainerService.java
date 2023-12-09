package com.epam.xstack.service.trainer_service;

import com.epam.xstack.models.dto.trainer_dto.request.GetTrainerProfileRequestDTO;
import com.epam.xstack.models.dto.trainer_dto.request.TrainerRegistrationRequestDTO;
import com.epam.xstack.models.dto.trainer_dto.request.UpdateTrainerProfileRequestDTO;
import com.epam.xstack.models.dto.trainer_dto.response.GetTrainerProfileResponseDTO;
import com.epam.xstack.models.dto.trainer_dto.response.TrainerRegistrationResponseDTO;
import com.epam.xstack.models.dto.trainer_dto.response.UpdateTrainerProfileResponseDTO;

import java.util.UUID;

public interface TrainerService {
    TrainerRegistrationResponseDTO saveTrainer(TrainerRegistrationRequestDTO requestDTO);
    GetTrainerProfileResponseDTO selectTrainerProfileByUserName(UUID id, GetTrainerProfileRequestDTO requestDTO);
    UpdateTrainerProfileResponseDTO updateTrainerProfile(UUID id, UpdateTrainerProfileRequestDTO requestDTO);
}
