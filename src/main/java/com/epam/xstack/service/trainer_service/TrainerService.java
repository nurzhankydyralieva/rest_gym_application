package com.epam.xstack.service.trainer_service;

import com.epam.xstack.models.dto.trainee_dto.response.Ok_200_ResponseDTO;
import com.epam.xstack.models.dto.trainer_dto.request.ActivateDe_ActivateTrainerDTO;
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
    Ok_200_ResponseDTO activateDe_ActivateTrainer(UUID id, ActivateDe_ActivateTrainerDTO dto);
}
