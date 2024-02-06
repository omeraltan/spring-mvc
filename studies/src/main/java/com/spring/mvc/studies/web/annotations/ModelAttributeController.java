package com.spring.mvc.studies.web.annotations;

import com.spring.mvc.studies.web.annotations.entities.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ModelAttributeController {

//    @ModelAttribute
//    public void addAttribute(Model model){
//        model.addAttribute("msg","Welcome to the Netherlands!");
//    }
//
//    @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
//    public String submit(@ModelAttribute("employee") Employee employee){
//        return "employeeView";
//    }

}
