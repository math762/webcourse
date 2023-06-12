package com.sofitiuare.course.resources;

import com.sofitiuare.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class userResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
// O @GetMapping serve para dizer que esse metodo responde uma solicitação do tipo get do http;
        var u = new User(1L, "Maria", "maria@gmail.com", "11940028922", "YnvJm54o");
        return ResponseEntity.ok().body(u);
    }
}
