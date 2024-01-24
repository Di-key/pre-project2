package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoHibernateImpl;

import jm.task.core.jdbc.model.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@org.springframework.stereotype.Service
public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoHibernateImpl();

    @Override
    @Transactional
    public void createUsersTable() {
        userDao.createUsersTable();
    }
    @Override
    @Transactional
    public void dropUsersTable() {
        userDao.dropUsersTable();

    }
    @Override
    @Transactional
    public void saveUser(String name, String lastName, byte age) {
        userDao.saveUser(name, lastName, age);
    }
    @Override
    @Transactional
    public void removeUserById(long id) {
        userDao.removeUserById(id);

    }
    @Override
    @Transactional
    public List<User> getAllUsers() {
        List<User> users =  userDao.getAllUsers();
        for (User user : users) {
            System.out.println(user);
        }
        return users;
    }
    @Override
    @Transactional
    public void cleanUsersTable() {
        userDao.cleanUsersTable();

    }
}
