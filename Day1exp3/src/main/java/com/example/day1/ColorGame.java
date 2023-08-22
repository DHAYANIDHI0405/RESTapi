package com.example.day1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ColorGame {

    private String yourFavColor = "Blue"; 
    @GetMapping("get")
    public String getMyFav() {
        return "My favorite color is " + yourFavColor;
    }
}