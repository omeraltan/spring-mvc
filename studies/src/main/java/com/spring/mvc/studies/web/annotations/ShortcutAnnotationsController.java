package com.spring.mvc.studies.web.annotations;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ShortcutAnnotationsController {

    @GetMapping("/get")
    public @ResponseBody ResponseEntity<String> get(){
        return new ResponseEntity<String>("GET Response", HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<String> getById(@PathVariable String id){
        return new ResponseEntity<String>("GET Response : " + id, HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<String> post(){
        return new ResponseEntity<String>("POST Response", HttpStatus.OK);
    }

    @PutMapping("/put")
    public ResponseEntity<String> put(){
        return new ResponseEntity<String>("PUT Response", HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(){
        return new ResponseEntity<String>("DELETE Response", HttpStatus.OK);
    }

    @PatchMapping("/patch")
    public ResponseEntity<String> patch(){
        return new ResponseEntity<String>("PATCH Response", HttpStatus.OK);
    }

}
