package com.ucare.ucareweb.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/ucare")
public class ucareController {
    public String test(){
        return "First test";
    }
}
