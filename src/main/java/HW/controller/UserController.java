package HW.controller;

import HW.model.User;
import HW.service.BalanceService;
import HW.service.UserService;

public class UserController {

    private BalanceService balanceService = new BalanceService();
    private UserService userService = new UserService();

    public void addUserToList(int userID, String name, int age, float balance) {
        userService.addUserToList(new User(userID, name, age, balance));
    }

    public void removeUserFromList(int userID) {
        userService.removeUserFromList(userID);
    }

    public void creditBalance(int userID, float balance) {
        balanceService.creditBalance(userID, balance);
    }

    public void discardBalance(int userID, float balance) {
        balanceService.discardBalance(userID, balance);
    }

    public void printUsers() {
        userService.printUsers();
    }

}
