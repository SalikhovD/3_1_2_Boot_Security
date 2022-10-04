package ru.kata.spring.boot_security.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import ru.kata.spring.boot_security.demo.service.UserService;


@Controller
public class IndexController {

    @GetMapping
    public String index() {
        return "index";
    }
}
