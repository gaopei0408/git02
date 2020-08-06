package com.xxxx.git01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GitController {

    @GetMapping("/hello")
    public String first() {
        return "Hello Git! ";
    }
}
