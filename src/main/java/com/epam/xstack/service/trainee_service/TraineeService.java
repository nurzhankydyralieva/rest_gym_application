package com.epam.xstack.service.trainee_service;

import com.epam.xstack.models.dto.trainee_dto.request.ActivateDe_ActivateTraineeDTO;
import com.epam.xstack.models.dto.trainee_dto.request.GetTraineeProfileRequestDTO;
import com.epam.xstack.models.dto.trainee_dto.request.TraineeRegistrationRequestDTO;
import com.epam.xstack.models.dto.trainee_dto.request.UpdateTraineeProfileRequestDTO;
import com.epam.xstack.models.dto.trainee_dto.response.GetTraineeProfileResponseDTO;
import com.epam.xstack.models.dto.trainee_dto.response.Ok_200_ResponseDTO;
import com.epam.xstack.models.dto.trainee_dto.response.TraineeRegistrationResponseDTO;
import com.epam.xstack.models.dto.trainee_dto.response.UpdateTraineeProfileResponseDTO;

import java.util.UUID;

public interface TraineeService {
    TraineeRegistrationResponseDTO saveTrainee(TraineeRegistrationRequestDTO requestDTO);

    GetTraineeProfileResponseDTO selectTraineeProfileByUserName(UUID id, GetTraineeProfileRequestDTO requestDTO);

    UpdateTraineeProfileResponseDTO updateTraineeProfile(UUID id, UpdateTraineeProfileRequestDTO requestDTO);

    Ok_200_ResponseDTO deleteTraineeByUserName(UUID id, GetTraineeProfileRequestDTO requestDTO);

    Ok_200_ResponseDTO activateDe_ActivateTrainee(UUID id, ActivateDe_ActivateTraineeDTO dto);
}
