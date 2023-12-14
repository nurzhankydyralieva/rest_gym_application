package com.epam.xstack.dao.trainer_dao;

import com.epam.xstack.models.dto.trainer_dto.request.GetTrainerProfileRequestDTO;
import com.epam.xstack.models.dto.trainer_dto.request.TrainerRegistrationRequestDTO;
import com.epam.xstack.models.dto.trainer_dto.request.UpdateTrainerProfileRequestDTO;
import com.epam.xstack.models.dto.trainer_dto.response.GetTrainerProfileResponseDTO;
import com.epam.xstack.models.dto.trainer_dto.response.TrainerDTO;
import com.epam.xstack.models.dto.trainer_dto.response.TrainerRegistrationResponseDTO;
import com.epam.xstack.models.dto.trainer_dto.response.UpdateTrainerProfileResponseDTO;

import java.util.Collection;
import java.util.UUID;

public interface TrainerDAO {
    TrainerRegistrationResponseDTO saveTrainer(TrainerRegistrationRequestDTO requestDTO);

    GetTrainerProfileResponseDTO selectTrainerProfileByUserName(UUID id, GetTrainerProfileRequestDTO requestDTO);

    UpdateTrainerProfileResponseDTO updateTrainerProfile(UUID id, UpdateTrainerProfileRequestDTO requestDTO);

    Collection<TrainerDTO> selectNotAssignedOnTraineeActiveTrainers();
}
