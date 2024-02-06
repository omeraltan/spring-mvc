package com.spring.mvc.studies.web.annotations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Controller
public class RequestParamController {

    @GetMapping("/api/foos")
    @ResponseBody
    public String getFoos(@RequestParam String id){
        return "ID : " + id;
    }

    @PostMapping("/api/fooss")
    @ResponseBody
    public String addFoo(@RequestParam(name = "id") String fooId, @RequestParam String name){
        return "IS : " + fooId + " Name : " + name;
    }

    @GetMapping("/api/foosa")
    @ResponseBody
    public String getFoosa(@RequestParam(required = false) String id){
        return "ID : " + id;
    }

    @GetMapping("/api/foosas")
    @ResponseBody
    public String getFoosas(@RequestParam Optional<String> id){
        return "ID : " + id.orElseGet(() -> "not provided");
    }

    @GetMapping("/api/foossa")
    @ResponseBody
    public String getFoossa(@RequestParam(defaultValue = "test") String id){
        return "ID : " + id;
    }

    @GetMapping("/api/footta")
    @ResponseBody
    public String updateFootta(@RequestParam Map<String,String> allParams){
        return "Parameters are " + allParams.entrySet();
    }

    @GetMapping("/api/foottas")
    @ResponseBody
    public String getFoottas(@RequestParam List<String> id, @RequestParam List<String> name){
        return "IDs are :" + id + " Names are : " + name;
    }
}
