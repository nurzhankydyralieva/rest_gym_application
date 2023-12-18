package com.epam.xstack.service.trainee_service.impl;

import com.epam.xstack.dao.trainee_dao.TraineeDAO;
import com.epam.xstack.models.dto.trainee_dto.request.ActivateDe_ActivateTraineeDTO;
import com.epam.xstack.models.dto.trainee_dto.request.GetTraineeProfileRequestDTO;
import com.epam.xstack.models.dto.trainee_dto.request.TraineeRegistrationRequestDTO;
import com.epam.xstack.models.dto.trainee_dto.request.UpdateTraineeProfileRequestDTO;
import com.epam.xstack.models.dto.trainee_dto.response.GetTraineeProfileResponseDTO;
import com.epam.xstack.models.dto.trainee_dto.response.Ok_200_ResponseDTO;
import com.epam.xstack.models.dto.trainee_dto.response.TraineeRegistrationResponseDTO;
import com.epam.xstack.models.dto.trainee_dto.response.UpdateTraineeProfileResponseDTO;
import com.epam.xstack.service.trainee_service.TraineeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TraineeServiceImpl implements TraineeService {
    private final TraineeDAO traineeDAO;

    @Override
    public TraineeRegistrationResponseDTO saveTrainee(TraineeRegistrationRequestDTO requestDTO) {
        return traineeDAO.saveTrainee(requestDTO);
    }

    @Override
    public GetTraineeProfileResponseDTO selectTraineeProfileByUserName(UUID id, GetTraineeProfileRequestDTO requestDTO) {
        return traineeDAO.selectTraineeProfileByUserName(id, requestDTO);
    }

    @Override
    public UpdateTraineeProfileResponseDTO updateTraineeProfile(UUID id, UpdateTraineeProfileRequestDTO requestDTO) {
        return traineeDAO.updateTraineeProfile(id, requestDTO);
    }

    @Override
    public Ok_200_ResponseDTO deleteTraineeByUserName(UUID id, GetTraineeProfileRequestDTO requestDTO) {
        return traineeDAO.deleteTraineeByUserName(id, requestDTO);
    }

    @Override
    public Ok_200_ResponseDTO activateDe_ActivateTrainee(UUID id, ActivateDe_ActivateTraineeDTO dto) {
        return traineeDAO.activateDe_ActivateTrainee(id, dto);
    }
}
