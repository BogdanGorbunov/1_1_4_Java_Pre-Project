package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("William", "Torres", (byte) 20);
        userService.saveUser("Frank", "Anderson", (byte) 25);
        userService.saveUser("William", "Holland", (byte) 31);
        userService.saveUser("Mike", "Moran", (byte) 38);
        System.out.println(userService.getAllUsers());
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
