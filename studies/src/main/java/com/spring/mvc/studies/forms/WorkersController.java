package com.spring.mvc.studies.forms;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.text.Format;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class WorkersController {

    @RequestMapping(value = "/worker", method = RequestMethod.GET)
    public ModelAndView showForm(){
        return new ModelAndView("employeeHome", "worker", new Worker());
    }

    @RequestMapping(value = "/addWorker", method = RequestMethod.POST)
    public String submit(@Valid @ModelAttribute("worker")Worker worker, BindingResult result, ModelMap model){
        if (result.hasErrors()){
            return "error";
        }

        List<Student> students = new ArrayList<>();
        students.add(new Student(1,"Ömer", 'M'));
        students.add(new Student(2,"Ebru", 'F'));
        students.add(new Student(3, "Adil", 'M'));
        students.add(new Student(4,"Elif", 'F'));


        model.addAttribute("name", worker.getName());
        model.addAttribute("contactNumber", worker.getContactNumber());
        model.addAttribute("id",worker.getId());
        model.addAttribute("serverTime", LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE));
        model.addAttribute("students", students);
        return "addEmployee";
    }

    @RequestMapping(value = "/employeeHome", method = RequestMethod.GET)
    public ModelAndView home(){
        return new ModelAndView("employeeHome", "worker", new Worker());
    }

}
