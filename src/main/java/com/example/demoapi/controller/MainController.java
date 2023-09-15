package com.example.demoapi.controller;

import com.example.demoapi.model.Message;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

import static org.springframework.http.ResponseEntity.ok;

@RestController
@RequestMapping("/")
public class MainController {

    @GetMapping("/{str}")
    public ResponseEntity<Message> anyMessage(@PathVariable String str){
        System.out.println("str = " + str);
        return message();
    }

    @RequestMapping
    public ResponseEntity<Message> anyMessageParam(@RequestParam String msg){
        return message();
    }

    @GetMapping
    public ResponseEntity<Message> message(){
        Message response = Message.builder()
                .title("Welcome to our api")
                .timestamp(String.valueOf(LocalDate.now()))
                .build();

        return ok(response);
    }
}
