package com.example.task_01.controllers;

import com.example.task_01.models.Greeting;
import com.example.task_01.models.Reply;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Date;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    @GetMapping
    public Greeting newGreeting(){
        Greeting greeting = new Greeting("Sue", 12);
        return greeting;
        //return"Good Afternoon Sue!";

    }
}
