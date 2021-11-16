package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;


public class Main {

    public static void main(String[] args) {
        UserDaoJDBCImpl userDaoJDBCImpl = new UserDaoJDBCImpl();
        userDaoJDBCImpl.dropUsersTable();
        userDaoJDBCImpl.createUsersTable();
        userDaoJDBCImpl.saveUser("Оливер", "Williams", (byte) 25);
        userDaoJDBCImpl.saveUser("Джек", "Peters", (byte) 26);
        userDaoJDBCImpl.saveUser("Гарри", "Gibson", (byte) 27);
        userDaoJDBCImpl.saveUser("Джейкоб", "Martin", (byte) 28);
        userDaoJDBCImpl.removeUserById(3);
        userDaoJDBCImpl.getAllUsers();
        userDaoJDBCImpl.cleanUsersTable();
    }
}
