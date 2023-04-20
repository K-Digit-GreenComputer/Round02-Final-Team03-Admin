package shop.readmecorp.adminserverreadme.modules.user.service;

import org.springframework.stereotype.Service;
import shop.readmecorp.adminserverreadme.modules.user.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
