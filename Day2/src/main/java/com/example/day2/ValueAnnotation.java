package com.example.day2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueAnnotation{

    @Value("${studentName}")
    private String studentName;

    @GetMapping("getName")
    public String getName() {
        return "Name is: " + studentName;
    }
}