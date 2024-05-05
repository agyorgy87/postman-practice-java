package com.example.java.postman.practice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController

public class TestController {

    @Autowired
    MathService mathService;

    @GetMapping(
            path = "/test"
    )
    public Dog function() {
        Dog dog = new Dog("Rambo");
        return dog;
    }

    @GetMapping(
            path = "/test/{id}"
    )
    public Dog function2(@PathVariable int id) {
        return new Dog("Conor" + id);
    }

    @PostMapping(
            path = "/test"
    )
    public Dog function3(@RequestBody Dog dog) {
        return dog;
    }

    @GetMapping(
            path = "/test/{number1}/{number2}"
    )
    public int function4(@PathVariable int number1, @PathVariable int number2) {
        return mathService.sum(number1,number2);
    }

}
