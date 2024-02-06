package com.spring.mvc.studies.web.annotations;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@Controller
public class RequestMappingController {

    @RequestMapping(value ="ex/foos", method = GET)
    @ResponseBody
    public String getFoosBySimplePath(){
        return "Get some Foos with Header";
    }

    @RequestMapping(value = "/ex/foos", headers = {"key1=val1", "key2=val2"}, method = GET)
    @ResponseBody
    public String getFoosWithHeaders(){
        return "Get some Foos with header";
    }

    @RequestMapping(value = "/ex/foos/wl", method = GET, headers = "Accept=application/json")
    @ResponseBody
    public String getFootAsJsonFromBrowser(){
        return "Get some Foos with Header Old";
    }
}
