package CW.service;

import CW.model.User;
import CW.repository.UserRepository;

public class UserService {

    private UserRepository userRepository = new UserRepository();

    public void saveUser(User user){
        userRepository.saveUser(user);
    }

    public void deleteUser(User user) {
        userRepository.delFromList(user);
    }

    public User getUser(User user) {
        return userRepository.getUserFromRepository(user);
    }

    public void addToList(User user) {
        userRepository.addToList(user);
    }

}
