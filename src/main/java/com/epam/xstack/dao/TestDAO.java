package com.epam.xstack.dao;

import com.epam.xstack.models.entity.Trainee;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TestDAO {
    private final SessionFactory sessionFactory;

    @Transactional
    public List<Trainee> getAllTrainee() {
        Session session = sessionFactory.getCurrentSession();
        Query<Trainee> fromTrainee = session.createQuery("FROM Trainee ", Trainee.class);
        List<Trainee> resultList = fromTrainee.getResultList();
        return resultList;
    }
}
