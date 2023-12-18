package com.epam.xstack.dao.trainee_dao;

import com.epam.xstack.models.dto.trainee_dto.request.ActivateDe_ActivateTraineeDTO;
import com.epam.xstack.models.dto.trainee_dto.request.GetTraineeProfileRequestDTO;
import com.epam.xstack.models.dto.trainee_dto.request.TraineeRegistrationRequestDTO;
import com.epam.xstack.models.dto.trainee_dto.request.UpdateTraineeProfileRequestDTO;
import com.epam.xstack.models.dto.trainee_dto.response.Ok_200_ResponseDTO;
import com.epam.xstack.models.dto.trainee_dto.response.GetTraineeProfileResponseDTO;
import com.epam.xstack.models.dto.trainee_dto.response.TraineeRegistrationResponseDTO;
import com.epam.xstack.models.dto.trainee_dto.response.UpdateTraineeProfileResponseDTO;
import com.epam.xstack.models.dto.trainer_dto.request.ActivateDe_ActivateTrainerDTO;

import java.util.UUID;

public interface TraineeDAO {
    TraineeRegistrationResponseDTO saveTrainee(TraineeRegistrationRequestDTO requestDTO);

    GetTraineeProfileResponseDTO selectTraineeProfileByUserName(UUID id, GetTraineeProfileRequestDTO requestDTO);

    UpdateTraineeProfileResponseDTO updateTraineeProfile(UUID id, UpdateTraineeProfileRequestDTO requestDTO);

    Ok_200_ResponseDTO deleteTraineeByUserName(UUID id, GetTraineeProfileRequestDTO requestDTO);
    Ok_200_ResponseDTO activateDe_ActivateTrainee(UUID id, ActivateDe_ActivateTraineeDTO dto);

}
