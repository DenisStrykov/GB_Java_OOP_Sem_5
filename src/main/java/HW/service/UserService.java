package HW.service;

import HW.model.User;
import HW.repository.UserRepository;

public class UserService {

    private UserRepository userRepository = new UserRepository();

    public void addUserToList(User user) {
        userRepository.addUserToList(user);
    }

    public void removeUserFromList(Integer userID) {
        userRepository.removeUserFromList(userID);
    }

    public void printUsers() {
        userRepository.printUsers();
    }

}
