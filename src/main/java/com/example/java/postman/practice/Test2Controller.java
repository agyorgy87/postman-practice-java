package com.example.java.postman.practice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test2Controller {

    @Autowired
    MathService mathService;

    @GetMapping(
            path = "/test2/{number1}/{number2}"
    )
    public int function5(@PathVariable int number1, @PathVariable int number2) {
        return mathService.sum(number1,number2);
    }

}
