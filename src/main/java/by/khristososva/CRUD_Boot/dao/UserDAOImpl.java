package by.khristososva.CRUD_Boot.dao;

import by.khristososva.CRUD_Boot.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class UserDAOImpl implements UserDAO {
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    EntityManager entityManager;

    @Override
    public List<User> AllListUser() {
        return entityManager.createQuery("from User", User.class).getResultList();
    }

    @Override
    public void add(User user) {
        entityManager.persist(user);
    }

    @Override
    public void edit(int id, User user) {
        User newUser = entityManager.find(User.class, id);
        newUser.setFirstName(user.getFirstName());
        newUser.setLastName(user.getLastName());
        newUser.setAge(user.getAge());
    }

    @Override
    public void delete(int id) {
        User user = entityManager.find(User.class, id);
        entityManager.remove(user);
    }

    @Override
    public User getById(int id) {
        return entityManager.find(User.class, id);
    }
}
