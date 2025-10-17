package com.LearningDocker.Learning.Docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/docker")
public class controller {
@GetMapping("/home")
public String home(){
    return "This is a Docker Application";
}

}
