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

    @RequestMapping("/org/orgList")
    public String orgList(Model model){
        return "modules/org/orgList";
    }

    @RequestMapping("/org/userList")
    public String userList(Model model){
        return "modules/org/userList";
    }

    @RequestMapping("/org/roleList")
    public String roleList(Model model){
        return "modules/org/roleList";
    }
}
