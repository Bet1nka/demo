package com.example.demo.Service;

import com.example.demo.Persist.User;
import com.example.demo.Persist.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
        this.userRepository.save(new User("Betina"));
        this.userRepository.save(new User("andrew"));
        this.userRepository.save(new User("Alex"));
    }
    public List<User> findAll(){
        return userRepository.findAll();
    }
    public Optional<User> findById(Long id){
        return userRepository.findById(id);
    }
}
