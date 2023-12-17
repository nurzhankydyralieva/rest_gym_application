package com.epam.xstack.dao.trainee_dao.impl;

import com.epam.xstack.dao.trainee_dao.TraineeDAO;
import com.epam.xstack.mappers.trainee_mapper.GetTraineeProfileRequestMapper;
import com.epam.xstack.mappers.trainee_mapper.TraineeMapper;
import com.epam.xstack.mappers.trainee_mapper.TraineeRegistrationRequestMapper;
import com.epam.xstack.mappers.trainee_mapper.UpdateTraineeProfileRequestMapper;
import com.epam.xstack.mappers.trainer_mapper.TrainerMapper;
import com.epam.xstack.models.dto.trainee_dto.request.GetTraineeProfileRequestDTO;
import com.epam.xstack.models.dto.trainee_dto.request.TraineeRegistrationRequestDTO;
import com.epam.xstack.models.dto.trainee_dto.request.UpdateTraineeProfileRequestDTO;
import com.epam.xstack.models.dto.trainee_dto.response.DeleteResponseDTO;
import com.epam.xstack.models.dto.trainee_dto.response.GetTraineeProfileResponseDTO;
import com.epam.xstack.models.dto.trainee_dto.response.TraineeRegistrationResponseDTO;
import com.epam.xstack.models.dto.trainee_dto.response.UpdateTraineeProfileResponseDTO;
import com.epam.xstack.models.dto.trainer_dto.response.TrainerDTO;
import com.epam.xstack.models.entity.Trainee;
import com.epam.xstack.models.entity.Trainer;
import com.epam.xstack.models.enums.Code;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Component
@RequiredArgsConstructor

public class TraineeDAOImpl implements TraineeDAO {
    private final SessionFactory sessionFactory;
    private final TraineeRegistrationRequestMapper registrationRequestMapper;
    private final GetTraineeProfileRequestMapper getTraineeProfileRequestMapper;
    private final UpdateTraineeProfileRequestMapper updateTraineeProfileRequestMapper;

//    public Collection<TrainerDTO> selectNotAssignedOnTraineeActiveTrainers(String userName) {
//        Session session = sessionFactory.getCurrentSession();
//        Query<Trainee> query = session.createQuery("SELECT t.trainers FROM Trainee t WHERE t.isActive=true AND t.isAssigned= false  AND t.userName=:userName", Trainee.class);
//        query.setParameter("userName", userName);
//        List<Trainee> resultList = query.getResultList();
//
//        return trainerDTOS;
//    }

    @Override
    @Transactional
    public DeleteResponseDTO deleteTraineeByUserName(UUID id, GetTraineeProfileRequestDTO requestDTO) {
        Session session = sessionFactory.getCurrentSession();
        Trainee trainee = getTraineeProfileRequestMapper.toEntity(requestDTO);
        Trainee traineeId = session.get(Trainee.class, id);

        if (traineeId.getUserName().equals(trainee.getUserName())) {
            session.remove(traineeId);
            return DeleteResponseDTO
                    .builder()
                    .response("Trainee is deleted from database")
                    .code(Code.STATUS_200_OK)
                    .build();
        } else {
            throw new RuntimeException("Trainee is not available in database");
        }

    }

    @Override
    @Transactional
    public UpdateTraineeProfileResponseDTO updateTraineeProfile(UUID id, UpdateTraineeProfileRequestDTO requestDTO) {
        Session session = sessionFactory.getCurrentSession();
        Trainee trainee = updateTraineeProfileRequestMapper.toEntity(requestDTO);
        Trainee traineeToBeUpdated = session.get(Trainee.class, id);

        traineeToBeUpdated.setUserName(trainee.getUserName());
        traineeToBeUpdated.setFirstName(trainee.getFirstName());
        traineeToBeUpdated.setLastName(trainee.getLastName());
        traineeToBeUpdated.setDateOfBirth(trainee.getDateOfBirth());
        traineeToBeUpdated.setAddress(trainee.getAddress());
        traineeToBeUpdated.setIsActive(trainee.getIsActive());

        session.update(traineeToBeUpdated);
        updateTraineeProfileRequestMapper.toDto(trainee);

        return UpdateTraineeProfileResponseDTO
                .builder()
                .userName(traineeToBeUpdated.getUserName())
                .firstName(traineeToBeUpdated.getFirstName())
                .lastName(traineeToBeUpdated.getLastName())
                .dateOfBirth(traineeToBeUpdated.getDateOfBirth())
                .address(traineeToBeUpdated.getAddress())
                .isActive(traineeToBeUpdated.getIsActive())
                .trainers(TrainerMapper.INSTANCE.toDtos(traineeToBeUpdated.getTrainers()))
                .build();
    }

    @Override
    @Transactional
    public GetTraineeProfileResponseDTO selectTraineeProfileByUserName(UUID id, GetTraineeProfileRequestDTO requestDTO) {
        Session session = sessionFactory.getCurrentSession();
        Trainee trainee = getTraineeProfileRequestMapper.toEntity(requestDTO);
        Trainee traineeId = session.get(Trainee.class, id);

        if (traineeId.getUserName().equals(trainee.getUserName())) {
            getTraineeProfileRequestMapper.toDto(trainee);

            return GetTraineeProfileResponseDTO
                    .builder()
                    .firstName(traineeId.getFirstName())
                    .lastName(traineeId.getLastName())
                    .address(traineeId.getAddress())
                    .isActive(traineeId.getIsActive())
                    .dateOfBirth(traineeId.getDateOfBirth())
                    .trainers(TrainerMapper.INSTANCE.toDtos(traineeId.getTrainers()))
                    .build();
        } else {
            throw new RuntimeException("Not available");
        }
    }

    @Override
    @Transactional
    public TraineeRegistrationResponseDTO saveTrainee(TraineeRegistrationRequestDTO requestDTO) {
        Session session = sessionFactory.getCurrentSession();
        Trainee trainee = registrationRequestMapper.toEntity(requestDTO);
        session.save(trainee);
        TraineeRegistrationRequestDTO newTrainee = registrationRequestMapper.toDto(trainee);
        String password = generateRandomPassword(10);
        trainee.setUserName(newTrainee.getFirstName() + "." + newTrainee.getLastName());
        trainee.setPassword(password);
        session.save(trainee);

        return TraineeRegistrationResponseDTO
                .builder()
                .userName(newTrainee.getFirstName() + "." + newTrainee.getLastName())
                .password(password)
                .build();
    }


    private static String generateRandomPassword(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_-+=<>?";
        Random random = new Random();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characters.length());
            password.append(characters.charAt(index));
        }
        return password.toString();
    }
}
