package com.example.jpabasics.Controller;

import com.example.jpabasics.Entity.User;
import com.example.jpabasics.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add")
    public String addUser(@RequestBody User user){

        return userService.addUser(user);

    }


    @GetMapping("/getUsers")
    public List<User> getAllUsers(){

        return userService.getUsers();

    }

    @GetMapping("/getUser")
    public User getUser(@RequestParam("id") int id){
        return userService.getUser(id);
    }

    //delete all the users


    //delete a user by userId

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id){
        return userService.deleteUser(id);
    }

    //update the name of a user with a particular userId

}
