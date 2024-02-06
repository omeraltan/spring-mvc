package com.spring.mvc.studies.web.annotations;

import com.spring.mvc.studies.web.annotations.entities.Vehicle;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

//@Controller
public class VehicleController {

    // RequestMapping:
    @RequestMapping(value = "/vehciles/home", method = RequestMethod.GET)
    String home(){
        return "home";
    }
    // RequestBody:
    // RequestBody: which maps the body of the HTTP request to an object.
    @PostMapping("/save")
    void saveVehicle(@RequestBody Vehicle vehicle){
        // ...
    }
    // PathVariable:
    // This annotatin indicates that a method argument is bound to a URI template variable.
    @RequestMapping("/{id}")
    Vehicle getVehicle(@PathVariable long id){
        // ...
        Vehicle vehicle = new Vehicle();
        return vehicle;
    }

    // RequestParam
    @RequestMapping
    Vehicle getVehicleByParam(@RequestParam("id") long id){
        // ...
        Vehicle vehicle = new Vehicle();
        return vehicle;
    }

    @RequestMapping
    Vehicle buyCar(@RequestParam(defaultValue = "5") int seatCount){
        // ...
        Vehicle vehicle = new Vehicle();
        return vehicle;
    }

    // ResponseBody

    @ResponseBody
    @RequestMapping("/hello")
    String hello(){
        return "Hello World!";
    }

    // ExceptionHandler

    @ExceptionHandler(IllegalArgumentException.class)
    void onIllegalArgumentException(IllegalArgumentException exception){
        // ...
    }

    // ResponseStatus

    @ExceptionHandler(IllegalArgumentException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    void onIllegalArgumentException2(IllegalArgumentException exception){

    }

    // @Controller

    // @RestController

    // @ModelAttribute

    @PostMapping("/assemble")
    void assembleVehicle(@ModelAttribute("vehicle") Vehicle vehicleInModel){
        // ...
    }

    // @CrossOrigin

    @CrossOrigin
    @RequestMapping("/hello2")
    String hello2(){
        return "Hello World!";
    }
}
