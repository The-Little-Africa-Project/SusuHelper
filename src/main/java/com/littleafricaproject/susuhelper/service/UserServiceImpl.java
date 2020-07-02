package com.littleafricaproject.susuhelper.service;

import com.littleafricaproject.susuhelper.model.User;
import com.littleafricaproject.susuhelper.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;


    public UserServiceImpl(UserRepository userRepository) {

        this.userRepository = userRepository;
    }


    public User createUser(User user){



        return  new User();
    }


}
