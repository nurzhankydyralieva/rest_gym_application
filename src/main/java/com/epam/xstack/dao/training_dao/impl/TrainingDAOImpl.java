package com.epam.xstack.dao.training_dao.impl;

import com.epam.xstack.dao.training_dao.TrainingDAO;
import com.epam.xstack.mappers.training_mapper.TrainingMapper;
import com.epam.xstack.models.dto.training_dto.request.AddTrainingRequestDTO;
import com.epam.xstack.models.dto.training_dto.response.AddTrainingResponseDTO;
import com.epam.xstack.models.entity.Training;
import com.epam.xstack.models.enums.Code;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class TrainingDAOImpl implements TrainingDAO {
    private final SessionFactory sessionFactory;
    private final TrainingMapper trainingMapper;

    @Override
    @Transactional
    public AddTrainingResponseDTO saveTraining(AddTrainingRequestDTO requestDTO) {
        Session session = sessionFactory.getCurrentSession();
        Training training = trainingMapper.toEntity(requestDTO);
        session.save(training);
        trainingMapper.toDto(training);
        return AddTrainingResponseDTO
                .builder()
                .response("Training is saved")
                .code(Code.STATUS_200_OK)
                .build();
    }
}
