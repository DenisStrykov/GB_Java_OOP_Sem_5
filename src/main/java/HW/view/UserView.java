package HW.view;

import HW.controller.UserController;
import HW.model.User;

public class UserView {

    public static void main(String[] args) {

        UserController userController = new UserController();

        userController.addUserToList(1, "Денис", 26, 0);
        userController.addUserToList(2, "Иван", 18, 0);
        userController.addUserToList(3, "Анастасия", 42, 0);
        userController.addUserToList(4, "Петр", 33, 0);

        userController.printUsers();

        userController.creditBalance(1, 5000);
        userController.discardBalance(1, 1000);
        userController.discardBalance(3, 100);

        userController.printUsers();

        userController.removeUserFromList(2);

        userController.printUsers();

    }

}
