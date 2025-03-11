package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    private static final UserService userService = new UserServiceImpl();

    public static void main(String[] args) {

        userService.createUsersTable();

        userService.saveUser("James", "Chuka", (byte) 34);
        userService.saveUser("Jon", "Anderson", (byte) 27);
        userService.saveUser("Jonny", "Depp", (byte) 45);
        userService.saveUser("Marya", "Smitt", (byte) 20);

        userService.getAllUsers();


        userService.cleanUsersTable();

        userService.dropUsersTable();// реализуйте алгоритм здесь
    }
}
