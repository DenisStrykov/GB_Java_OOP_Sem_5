package CW.repository;

import CW.model.User;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private List<User> list;

    public UserRepository() {
        this.list = new ArrayList<>();
    }

    public void addToList(User user) {
        list.add(user);
    }

    public void delFromList(User user) {
        list.remove(user);
    }

    public User getUserFromRepository(User user) {
        for (User user1 : list) {
            if (user1.getUserID().equals(user.getUserID())) {
                return user1;
            }
        }
        return null;
    }

    public void saveUser(User user) {
        try (FileWriter fileWriter = new FileWriter("text.txt", true)) {
            fileWriter.write(user.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
