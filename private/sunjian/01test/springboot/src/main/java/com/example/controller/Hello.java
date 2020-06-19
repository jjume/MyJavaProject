package com.example.controller;

import com.example.WebSiteConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @RestController ==@Controller+@ResponseBody,需要注意的是使用这个注解代表着整个一类都是如此
 * 当然@Conroller&@ResponseBody还是可以使用的
 */

@RestController
public class Hello {
    @Autowired
    private WebSiteConfig webSiteConfig;

    @RequestMapping("hi")
    public String hi() {
        return "Hello,Spring Boot!!!";
    }

    @GetMapping("/config")
    public String getConfig() {
        return webSiteConfig.toString();
    }
}




