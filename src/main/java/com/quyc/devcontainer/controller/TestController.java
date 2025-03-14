package com.quyc.devcontainer.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("hello")
    public ResponseEntity<String> hello(@RequestParam(defaultValue = "world") String name) {
        return ResponseEntity.ok().body("hello %s!".formatted(name));
    }

}
