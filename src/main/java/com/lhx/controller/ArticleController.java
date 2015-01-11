package com.lhx.controller;

import com.lhx.model.Article;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by xin on 15-1-11 下午6:33
 *
 * @project springmvc
 * @package com.lhx.controller
 * @Description
 * @blog http://blog.csdn.net/u011439289
 * @email 888xin@sina.com
 * @github https://github.com/888xin
 */

@Controller
@RequestMapping("/article")
public class ArticleController {

    @RequestMapping("/list")
    public String list(Model model){
        return "article/list" ;
    }
    @RequestMapping("/details/{id}")
    public ModelAndView details(@PathVariable("id") int id){
        ModelAndView modelAndView = new ModelAndView();
        if (id == 1){
            modelAndView.addObject("article", new Article("文章一", "文章一的内容")) ;
        } else if (id == 2){
            modelAndView.addObject("article", new Article("文章二", "文章二的内容")) ;
        }
        modelAndView.setViewName("article/details");
        return modelAndView ;
    }
}
