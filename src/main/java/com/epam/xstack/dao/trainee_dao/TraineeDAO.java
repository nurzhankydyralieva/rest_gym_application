package com.epam.xstack.dao.trainee_dao;

import com.epam.xstack.models.dto.trainee_dto.request.GetTraineeProfileRequestDTO;
import com.epam.xstack.models.dto.trainee_dto.request.TraineeRegistrationRequestDTO;
import com.epam.xstack.models.dto.trainee_dto.request.UpdateTraineeProfileRequestDTO;
import com.epam.xstack.models.dto.trainee_dto.response.DeleteResponseDTO;
import com.epam.xstack.models.dto.trainee_dto.response.GetTraineeProfileResponseDTO;
import com.epam.xstack.models.dto.trainee_dto.response.TraineeRegistrationResponseDTO;
import com.epam.xstack.models.dto.trainee_dto.response.UpdateTraineeProfileResponseDTO;

import java.util.UUID;

public interface TraineeDAO {
    TraineeRegistrationResponseDTO saveTrainee(TraineeRegistrationRequestDTO requestDTO);
    GetTraineeProfileResponseDTO selectTraineeProfileByUserName(UUID id, GetTraineeProfileRequestDTO requestDTO);
    UpdateTraineeProfileResponseDTO updateTraineeProfile(UUID id, UpdateTraineeProfileRequestDTO requestDTO);

   DeleteResponseDTO deleteTraineeByUserName(UUID id, GetTraineeProfileRequestDTO requestDTO);
}
