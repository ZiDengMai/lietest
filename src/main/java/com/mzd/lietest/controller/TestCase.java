package com.mzd.lietest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class TestCase {

    @GetMapping("/pageTest")
    @ResponseBody
    public String pageTest(){
        return "test";
    }
}
