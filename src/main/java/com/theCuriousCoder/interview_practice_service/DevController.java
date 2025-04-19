package com.theCuriousCoder.interview_practice_service;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@RestController
//@Controller
//@ResponseBody
public class DevController {

    @GetMapping("/name")
    public String getName() {
        return "Rahul";
    }

    /*        USING VIEWS       */
//    @GetMapping("/name")
//    public ModelAndView getName() {
//        Map<String, Object> map = new HashMap<>();
//        map.put("name", "Rahul");
//        return new ModelAndView("JsonViewTemplate");
//    }


}
