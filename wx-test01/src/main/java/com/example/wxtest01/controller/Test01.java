package com.example.wxtest01.controller;

import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.databind.util.JSONPObject;
import netscape.javascript.JSObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class Test01 {
    @GetMapping("/hello")
    public String sayHello() {
        return "hello,world!";
    }

    @PostMapping("upload")
    public int getResult(@RequestBody JSONObject req) {
        int a = req.getInteger("num01");
        int b = req.getInteger("num02");
        return a+b;

    }
}
