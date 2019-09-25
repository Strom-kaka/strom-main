package com.strom.pc.controller.web;

import com.strom.common.controller.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pc/web")
public class HomeWebController extends BaseController {

    @GetMapping("/index")
    public String home(Model model){
        model.addAttribute("prefix",appPrefix);

        return "pc/index";
    }


}
