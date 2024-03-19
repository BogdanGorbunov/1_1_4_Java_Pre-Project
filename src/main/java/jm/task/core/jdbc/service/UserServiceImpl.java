package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.util.List;

public class UserServiceImpl implements UserService {

    private final UserDao UserDaoJDBC = new UserDaoJDBCImpl();

    public void createUsersTable() {
        UserDaoJDBC.createUsersTable();
    }

    public void dropUsersTable() {
        UserDaoJDBC.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        UserDaoJDBC.saveUser(name, lastName, age);
        System.out.println("User с именем — " + name + " добавлен в базу данных");
    }

    public void removeUserById(long id) {
        UserDaoJDBC.removeUserById(id);
    }

    public List<User> getAllUsers() {
        return UserDaoJDBC.getAllUsers();
    }

    public void cleanUsersTable() {
        UserDaoJDBC.cleanUsersTable();
    }
}
