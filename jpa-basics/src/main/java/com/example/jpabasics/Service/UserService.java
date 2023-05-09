package com.example.jpabasics.Service;

import com.example.jpabasics.Entity.User;
import com.example.jpabasics.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;


    public String addUser(User user){

        userRepository.save(user);
        return "User Added";

    }

    public List<User> getUsers(){
        return userRepository.findAll();
    }

    public User getUser(int id){
        return userRepository.findById(id).get();
    }

    public String deleteUser(int id){
        if(userRepository.existsById(id)){
            userRepository.deleteById(id);
            return "Delete User " + id;
        } else{
            return "Please Enter Correct Id";
        }

    }

}
