package com.spring.mvc.studies.web.annotations;

import com.spring.mvc.studies.web.annotations.entities.Bazz;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class RequestMappingController {

    @RequestMapping(value ="ex/foos", method = GET)
    @ResponseBody
    public String getFoosBySimplePath(){
        return "Get some Foos with Header";
    }

    @RequestMapping(value = "/ex/foos/create", headers = {"key1=val1", "key2=val2"}, method = GET)
    @ResponseBody
    public String getFoosWithHeaders(){
        return "Post some Foos with header";
    }

    @RequestMapping(value = "/ex/foos/wl", method = GET, headers = "Accept=application/json")
    @ResponseBody
    public String getFootAsJsonFromBrowser(){
        return "Get some Foos with Header Old";
    }

    // Path Variable
    @RequestMapping(value = "/ex/foos/{id}", method = GET)
    @ResponseBody
    public String getFoosBySimplePathWithPathVariable(@PathVariable("id") long id){
        return "Get a specific Foo with id = " + id;
    }

    @RequestMapping(value = "/ex/foo/{name}", method = GET)
    @ResponseBody
    public String getFoosBySimplePathWithPathVariable(@PathVariable String name){
        return "Get a specific Foo with name = " + name;
    }

    @RequestMapping(value = "/ex/foos/{fooid}/bar/{barid}", method = GET)
    @ResponseBody
    public String getFoosBySimplePathWithPathVariables(@PathVariable long fooid, @PathVariable long barid){
        return "Get a specific Bar with id = " + barid + " from a Foo with id = " + fooid;
    }

    @RequestMapping(value = "/ex/bars/{numericId:[\\d]+}", method = GET)
    @ResponseBody
    public String getBarsBySimplePathWithPathVariable(@PathVariable long numericId){
        return "Get a specific Bar with id = " + numericId;
    }

    @RequestMapping(value = "/ex/bars", method = GET)
    @ResponseBody
    public String getBarBySimplePathWithRequestParam(@RequestParam("id") long id){
        return "Get a specific Bar with id = " + id;
    }

    @RequestMapping(value = "/ex/warms", params = "id", method = GET)
    @ResponseBody
    public String getBarBySimplePathWithEExplicitRequestParam(@RequestParam("id") long id){
        return "Get a specific Bar with id = " + id;
    }

    @RequestMapping(value = "/ex/tars", params = {"id","second"}, method = GET)
    @ResponseBody
    public String getBarBySimplePathWithExplicitRequestParams(@RequestParam("id") long id){
        return "Narrow Get a specific Bar with id = " + id;
    }

    @RequestMapping(value = {"/ex/advanced/bars", "/ex/advanced/foos"}, method = GET)
    @ResponseBody
    public String getFoosOrBarsByPath(){
        return "Advanced - Get some Foos or Bars";
    }

    @RequestMapping(value = "/ex/foos/multiple", method = {RequestMethod.PUT, POST})
    @ResponseBody
    public String putAndPostFoos(){
        return "Advanced - PUT and POST within single method";
    }

    @RequestMapping(value = "*", method = GET)
    @ResponseBody
    public String getFallback(){
        return "Fallback for GET Requests";
    }

    @RequestMapping(value = "*", method = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.PATCH })
    @ResponseBody
    public String allFallback(){
        return "Fallback for All Requests";
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getBazz(@PathVariable Long id){
        return new ResponseEntity<>(new Bazz(id, "Bazz"+id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> newBazz(@RequestParam("name") String name){
        return new ResponseEntity<>(new Bazz(5L, name), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateBazz(@PathVariable Long id, @RequestParam("name") String name){
        return new ResponseEntity<>(new Bazz(id,name), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBazz(@PathVariable Long id){
        return new ResponseEntity<>(new Bazz(id), HttpStatus.OK);
    }
}
