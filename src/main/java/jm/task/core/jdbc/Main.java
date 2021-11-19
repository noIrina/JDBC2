package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;


public class Main {

    public static void main(String[] args) {
        UserDao userDao = new UserDaoJDBCImpl();
        userDao.dropUsersTable();
        userDao.createUsersTable();
        userDao.saveUser("Оливер", "Williams", (byte) 25);
        userDao.saveUser("Джек", "Peters", (byte) 26);
        userDao.saveUser("Гарри", "Gibson", (byte) 27);
        userDao.saveUser("Джейкоб", "Martin", (byte) 28);
        userDao.removeUserById(2);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
    }
}
