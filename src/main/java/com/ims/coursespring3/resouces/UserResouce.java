package com.ims.coursespring3.resouces;

import com.ims.coursespring3.entities.User;
import com.ims.coursespring3.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {

    private UserService service;

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        List<User> list = this.service.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id){
        User obj = this.service.findById(id);
        return ResponseEntity.ok().body(obj);
    }
}
