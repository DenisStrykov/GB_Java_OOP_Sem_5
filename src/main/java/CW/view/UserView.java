package CW.view;

import CW.controller.UserController;
import CW.model.User;

import java.util.Scanner;

public class UserView {

    public static void main(String[] args) {

        UserController userController = new UserController();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя и возраст: ");
        userController.saveNewUser(scanner.nextInt() ,scanner.next(), scanner.nextInt());

        scanner.close();

        User user_3 = new User(3, "name-3", 3);
        userController.addToList(user_3);
        userController.getUser(user_3);
        userController.deleteUser(user_3);
    }

}
