package com.example.springrest;
import java.util.concurrent.atomic.AtomicLong;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class CalculatorController {

    @GetMapping("/calculate")
    public Response greeting(@RequestParam(value = "op", defaultValue = "+") String op, @RequestParam(value = "first", defaultValue = "2") String first, @RequestParam(value = "second", defaultValue = "1") String second) {
        System.out.println(op + first + " "+ second );
        Calculator calculator =  new Calculator(op, first, second);
        return calculator.calculate();
    }
}
