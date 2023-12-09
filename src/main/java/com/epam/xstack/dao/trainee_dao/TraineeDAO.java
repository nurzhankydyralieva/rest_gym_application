package com.epam.xstack.dao.trainee_dao;

import com.epam.xstack.models.dto.trainee.request.GetTraineeProfileRequestDTO;
import com.epam.xstack.models.dto.trainee.request.TraineeRegistrationRequestDTO;
import com.epam.xstack.models.dto.trainee.request.UpdateTraineeProfileRequestDTO;
import com.epam.xstack.models.dto.trainee.response.DeleteResponseDTO;
import com.epam.xstack.models.dto.trainee.response.GetTraineeProfileResponseDTO;
import com.epam.xstack.models.dto.trainee.response.TraineeRegistrationResponseDTO;
import com.epam.xstack.models.dto.trainee.response.UpdateTraineeProfileResponseDTO;
import com.epam.xstack.models.entity.Trainee;

import java.util.UUID;

public interface TraineeDAO {
    TraineeRegistrationResponseDTO saveTrainee(TraineeRegistrationRequestDTO requestDTO);
    GetTraineeProfileResponseDTO selectTraineeProfileByUserName(UUID id, GetTraineeProfileRequestDTO requestDTO);
    UpdateTraineeProfileResponseDTO updateTraineeProfile(UUID id, UpdateTraineeProfileRequestDTO requestDTO);

   DeleteResponseDTO deleteTraineeByUserName(UUID id, GetTraineeProfileRequestDTO requestDTO);

}
