package com.epam.xstack.service.trainee_service;

import com.epam.xstack.models.dto.trainee.request.GetTraineeProfileRequestDTO;
import com.epam.xstack.models.dto.trainee.request.TraineeRegistrationRequestDTO;
import com.epam.xstack.models.dto.trainee.request.UpdateTraineeProfileRequestDTO;
import com.epam.xstack.models.dto.trainee.response.DeleteResponseDTO;
import com.epam.xstack.models.dto.trainee.response.GetTraineeProfileResponseDTO;
import com.epam.xstack.models.dto.trainee.response.TraineeRegistrationResponseDTO;
import com.epam.xstack.models.dto.trainee.response.UpdateTraineeProfileResponseDTO;

import java.util.UUID;

public interface TraineeService {
    TraineeRegistrationResponseDTO saveTrainee(TraineeRegistrationRequestDTO requestDTO);
    GetTraineeProfileResponseDTO selectTraineeProfileByUserName(UUID id, GetTraineeProfileRequestDTO requestDTO);
    UpdateTraineeProfileResponseDTO updateTraineeProfile(UUID id, UpdateTraineeProfileRequestDTO requestDTO);
    DeleteResponseDTO deleteTraineeByUserName(UUID id, GetTraineeProfileRequestDTO requestDTO);
}
