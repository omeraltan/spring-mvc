package com.spring.mvc.studies.response;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.LocalDate;
import java.util.Date;

@Controller
public class ResponseExamples {

    public static final int NOW = LocalDate.now().getYear();

    @GetMapping("/hello")
    ResponseEntity<String> hello(){
        return new ResponseEntity<>("Hello World!", HttpStatus.OK);
    }

    @GetMapping("/age")
    ResponseEntity<String> age(@RequestParam("yearOfBirth") int yearOfBirth){
        if (isInFuture(yearOfBirth)){
            return new ResponseEntity<>("Year of birth cannot be in the future", HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>("Your age is " + calculateAge(yearOfBirth), HttpStatus.OK);
    }

    @GetMapping("/customHeader")
    ResponseEntity<String> customHeader(){
        HttpHeaders header = new HttpHeaders();
        header.add("Custom-Header", "foo");

        return new ResponseEntity<>("Custom header set", header, HttpStatus.OK);
    }

    @GetMapping("/halo")
    ResponseEntity<String> halo(){
        return ResponseEntity.ok("Hello World!");
    }

    @GetMapping("/bodybuilder")
    ResponseEntity<String> ages(@RequestParam("yearOfBirth") int yearOfBirth){
        if (isInFuture(yearOfBirth)){
            return ResponseEntity.badRequest().body("Year of birth cannot be in the future");
        }
        return ResponseEntity.status(HttpStatus.OK).body("Your age is " + calculateAge(yearOfBirth));
    }

    @GetMapping("/customsmall")
    ResponseEntity<String> customHeaderSmall(){
        return ResponseEntity.ok().header("Custom-Header", "foos").body("Custom header set");
    }

    private int calculateAge(int yearOfBirth) {
        return NOW - yearOfBirth;
    }

    public static boolean isInFuture(int yearOfBirth){

        int year = NOW;

        if (yearOfBirth < year){
            return false;
        }else {
            return true;
        }
    }

}
