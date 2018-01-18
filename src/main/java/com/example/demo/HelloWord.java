package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWord {
@RequestMapping("/test")
public String getMessage()
{
return "WELCOME TO MICROSERVICE";	
}

@RequestMapping("/detail")
public String getDetail()
{
return "HII I AM SPRING BOOT project with docker  ";	
}

}
