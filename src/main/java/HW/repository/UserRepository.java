package HW.repository;

import HW.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private final List<User> userList;

    public UserRepository() {
        this.userList = new ArrayList<>();
    }

    public void addUserToList(User user) {
        userList.add(user);
    }

    public void removeUserFromList(Integer userID) {
        for (User user : userList) {
            if (user.getUserID().equals(userID)) {
                userList.remove(user);
            }
        }
    }

    public void creditBalance(Integer userID, Float balance) {
        for (User user : userList) {
            if (user.getUserID().equals(userID)) {
                user.setBalance(user.getBalance() + balance);
            }
        }
    }

    public void discardBalance(Integer userID, Float balance) {
        for (User user : userList) {
            if (user.getUserID().equals(userID)) {
                user.setBalance(user.getBalance() - balance);
            }
        }
    }

    public void printUsers() {
        for (User user : userList) {
            System.out.println(user);
        }
        System.out.println();
    }

}
