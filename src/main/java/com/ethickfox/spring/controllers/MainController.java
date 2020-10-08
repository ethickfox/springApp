package com.ethickfox.spring.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class MainController {
    @ExceptionHandler(NoHandlerFoundException.class)
    public String handleError404() {
        return "redirect:/index.html";
    }
}
