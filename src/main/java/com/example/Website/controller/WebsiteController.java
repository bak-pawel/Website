package com.example.Website.controller;

import com.example.Website.model.Item;
import com.example.Website.service.WebsiteServiceImpl;
import com.sun.org.apache.xpath.internal.operations.Mod;
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

    @GetMapping("/")
    public ModelAndView home() {
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }

    @GetMapping("/search")
    public ModelAndView search(@RequestParam String value) {
        ModelAndView modelAndView;
        switch (value){
            case "kolumna1":
                modelAndView = new ModelAndView("kolumna1");
                break;
            case "kolumna2":
                modelAndView = new ModelAndView("kolumna2");
            break;
            case "kolumna3":
                modelAndView = new ModelAndView("kolumna3");
                break;
            case "kolumna4":
                modelAndView = new ModelAndView("kolumna4");
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + value);
        }

        return modelAndView;
    }
}
