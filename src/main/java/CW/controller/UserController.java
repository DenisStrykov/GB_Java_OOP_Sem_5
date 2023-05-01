package CW.controller;

import CW.model.User;
import CW.service.UserService;

public class UserController {

    private UserService userService = new UserService();

    public void saveNewUser(int ID, String name, int age) {
        userService.saveUser(new User(ID, name, age));
    }

    public void deleteUser(User user) {
        userService.deleteUser(user);
    }

    public User getUser(User user) {
        return userService.getUser(user);
    }

    public void addToList(User user) {
        userService.addToList(user);
    }

}
