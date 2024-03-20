package com.miygo.msim.controller;

import com.miygo.common.utils.UIConstants;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("SYS_NAME", UIConstants.SYS_NAME);
        return "home/index";
    }
}
