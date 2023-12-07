package com.epam.xstack.dao;

import com.epam.xstack.model.entity.Trainee;
import com.epam.xstack.model.entity.Trainer;
import lombok.RequiredArgsConstructor;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Component
@RequiredArgsConstructor
public class StorageDAO {
    private final SessionFactory sessionFactory;
    @PostConstruct
    public void save() {

        try (Session session = sessionFactory.openSession()) {
            session.beginTransaction();

            Trainer trainer1 = new Trainer();
            trainer1.setUserName("Tom.Smith");
            trainer1.setFirstName("Tom");
            trainer1.setLastName("Smith");
            trainer1.setIsActive(true);
            trainer1.setIsAssigned(true);
            trainer1.setPassword("111");
            trainer1.setCriteria("1 Trainer criteria");

            Trainer trainer2 = new Trainer();
            trainer2.setUserName("Andrea.Bocelli");
            trainer2.setFirstName("Andrea");
            trainer2.setLastName("Bocelli");
            trainer2.setIsAssigned(true);
            trainer2.setIsActive(true);
            trainer2.setPassword("222");
            trainer2.setCriteria("2 Trainer criteria");

            Trainee trainee1 = new Trainee();
            trainee1.setFirstName("Sarah");
            trainee1.setLastName("Jons");
            trainee1.setUserName("Sarah.Jons");
            trainee1.setPassword("trainee");
            trainee1.setIsAssigned(true);
            trainee1.setIsActive(true);
            trainee1.setCriteria("1 Trainee criteria");

            Trainee trainee2 = new Trainee();
            trainee2.setFirstName("Maxim");
            trainee2.setLastName("Jons");
            trainee2.setUserName("Maxim.Jons");
            trainee2.setPassword("maxim");
            trainee2.setIsAssigned(false);
            trainee2.setIsActive(false);
            trainee2.setCriteria("2 Trainee criteria");

            Trainee trainee3 = new Trainee();
            trainee3.setFirstName("Sultan");
            trainee3.setLastName("Suleiman");
            trainee3.setUserName("Sultan.Suleiman");
            trainee3.setPassword("sultan");
            trainee3.setIsAssigned(true);
            trainee3.setIsActive(true);
            trainee3.setCriteria("3 Trainee criteria");

            trainer1.getTraineeList().add(trainee1);
            trainer1.getTraineeList().add(trainee2);
            trainer1.getTraineeList().add(trainee3);

            trainee1.getTrainers().add(trainer1);
            trainee2.getTrainers().add(trainer1);
            trainee3.getTrainers().add(trainer1);

            trainer2.getTraineeList().add(trainee2);
            trainer2.getTraineeList().add(trainee3);

            trainee2.getTrainers().add(trainer2);
            trainee3.getTrainers().add(trainer2);

            session.persist(trainer1);
            session.persist(trainer2);

            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }}
}
