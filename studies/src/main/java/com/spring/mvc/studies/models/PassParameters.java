package com.spring.mvc.studies.models;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class PassParameters {

    @GetMapping("/showViewPage")
    public String passParametersWithModel(Model model){
        Map<String, String> map = new HashMap<>();
        map.put("spring","mvc");
        model.addAttribute("message", "OmerOmer");
        model.mergeAttributes(map);
        return "view/viewPage";
    }

    @GetMapping("/printViewPage")
    public String passParametersWithModelMap(ModelMap map){
        map.addAttribute("welcomeMessage", "welcome to thymeleaf");
        map.addAttribute("message", " Omer ALTAN");
        return "view/viewPage2";
    }

    @GetMapping("/goToViewPage")
    public ModelAndView passParametersWithModelAndView(){
        ModelAndView modelAndView = new ModelAndView("view/viewPage3");
        modelAndView.addObject("message", "Ömer ALTAN Test");
        return modelAndView;
    }

}
