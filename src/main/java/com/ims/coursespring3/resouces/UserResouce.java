package com.ims.coursespring3.resouces;

import com.ims.coursespring3.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResouce {

    @GetMapping
    public ResponseEntity<User> findAll(){
        return null;
    }
}
