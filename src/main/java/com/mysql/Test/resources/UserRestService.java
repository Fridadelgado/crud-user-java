package com.mysql.Test.resources;


import com.mysql.Test.repositories.UserRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.mysql.Test.models.User ;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import java.net.URI;
import java.util.Optional;


@Controller
@RequestMapping(path="/user")
public class UserRestService {

    @Autowired 
    private UserRepository userRepository;


    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        
        return userRepository.findAll();
    }
    @GetMapping(path="/getUsers/{id}")
    @ResponseBody
    public Optional<User> getUsersById(@PathVariable("id") long id) {

        Optional<User> user = userRepository.findById(id);
        return user;
    }
   

    @PostMapping(path = "/create")
    public User  createUser(@RequestBody User user) {
        User savedUser = userRepository.save(user);

        return  savedUser;
    }

    @PutMapping(path = "/update/{id}")
    public User updateUser(@RequestBody User user,@PathVariable("id") long id) {
        User updateUser = userRepository.save(user);
        return updateUser;

    }

    @DeleteMapping(path = "/deleteById/{id}")
   // @ResponseBody
    public void deleteUserById(@PathVariable("id") long id) {
       userRepository.deleteById(id);

    }
}
