package HW.service;

import HW.repository.UserRepository;

public class BalanceService {

    private UserRepository userRepository = new UserRepository();

    public void creditBalance(Integer userID, Float balance) {
        userRepository.creditBalance(userID, balance);
    }

    public void discardBalance(Integer userID, Float balance) {
        userRepository.discardBalance(userID, balance);
    }

}
