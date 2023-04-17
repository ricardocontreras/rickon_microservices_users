package rickon_microservices_users.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rickon_microservices_users.dtos.UserModel;
import rickon_microservices_users.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
    private UserRepository userRepository;

    public void saveUser(UserModel user) {
        userRepository.save(user);
    }
    
    public List<UserModel> getUsers() {
        return userRepository.findAll();
    }
}
