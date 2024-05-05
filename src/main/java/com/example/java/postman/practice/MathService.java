package com.example.java.postman.practice;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    public int sum(int number1, int number2) {
        return number1 + number2;
    }

}
