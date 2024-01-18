package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    private final static UserService userService = new UserServiceImpl();
    public static void main(String[] args) {
        userService.createUsersTable();

        userService.saveUser("John", "Snow", (byte) 23);
        userService.saveUser("Ann", "Smith", (byte) 45);
        userService.saveUser("Victor", "Black", (byte) 59);
        userService.saveUser("Kate", "Adams", (byte) 19);

        userService.removeUserById(2);

        userService.getAllUsers();

        userService.cleanUsersTable();

        userService.dropUsersTable();
    }
}
