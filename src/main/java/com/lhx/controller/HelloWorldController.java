package com.lhx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xin on 15-1-10 下午5:29
 *
 * @project springmvc
 * @package com.lhx.controller
 * @Description
 * @blog http://blog.csdn.net/u011439289
 * @email 888xin@sina.com
 * @github https://github.com/888xin
 */

@Controller
public class HelloWorldController {

    @RequestMapping("/helloWorld")
    public String helloWorld(Model model){
        model.addAttribute("message","SpringMVC来了") ;
        return "helloWorld" ;
    }
}
