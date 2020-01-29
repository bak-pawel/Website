package com.example.Website.controller;

import com.example.Website.model.Item;
import com.example.Website.service.WebsiteServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
import java.util.Set;

@RestController
public class WebsiteController {
    @Resource
    public final WebsiteServiceImpl websiteService;

    public WebsiteController(WebsiteServiceImpl websiteService) {
        this.websiteService = websiteService;
    }

    @GetMapping("//")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }

    @GetMapping("/search/{name}")
    public ModelAndView search(@PathVariable("name") String name) {
        ModelAndView modelAndView = new ModelAndView("dataPrint");
            return modelAndView;
    }
}
