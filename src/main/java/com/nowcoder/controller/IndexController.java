package com.nowcoder.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class IndexController {

    @RequestMapping(path={"/","/index"})
    @ResponseBody
    public String index(){
        return "hello index";
    }


    @RequestMapping(path={"/profile/{userId}"})
    @ResponseBody
    public String profile(@PathVariable("userId") int userId,
                        @RequestParam(value = "type",defaultValue = "1") int type){
        return String.format("Profile page of %d ? t:%d",userId,type);
    }

    @RequestMapping(path={"/vm"},method = {RequestMethod.GET})
    public String template(Model model){
        model.addAttribute("value1","vvv1");
        return "home";
    }
}
